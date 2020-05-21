package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderDetail {
    private int orderDetailId;
    private List<ProductDetail> productDetailList;
    private long total;
    private Customer customer;

    public OrderDetail() {
    }

    public OrderDetail(List<ProductDetail> productDetailList, Customer customer) {
        this.productDetailList = productDetailList;
        this.customer = customer;

        this.total = productDetailList.stream()
                .mapToLong(ProductDetail::getTotal)
                .sum();
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public List<ProductDetail> getProductDetailList() {
        return productDetailList;
    }

    public long getTotal() {
        return total;
    }

    public void generate(OutputStream out) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("./src/main/resources/orderTempl.html")));

        String result = String.format(content, customer.getName(), getProductListRow(productDetailList), total + "");
        try (PrintWriter writer = new PrintWriter(out)) {
            writer.print(result);
        }
        ;
    }

    public String getProductListRow(List<ProductDetail> productDetails) {
        //<tr><td>product name</td><td>price</td><tr>
        //<tr><td>product name</td><td>price</td><tr>
        return productDetails.stream().map(this::getProductRow)
                .reduce("", (x, y) -> x + y);
    }

    public String getProductRow(ProductDetail productDetail) {
        //<tr><td>product name</td><td>price</td><tr>
        return String.format("<tr><td>%s</td><td>%s</td><tr>\n\t\t\t",
                productDetail.getProduct().getName(),
                productDetail.getTotal() + "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetail that = (OrderDetail) o;
        return orderDetailId == that.orderDetailId &&
                total == that.total &&
                Objects.equals(productDetailList, that.productDetailList) &&
                Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailId, productDetailList, total, customer);
    }

    //////////////////////////////////////////////////////////////////////////////////

    public Customer getCustomer() {
        return customer;
    }

    public static int getLastInsertOrderDetailId(Connection conn) {
        String sql = "select last_insert_id() from order_detail";
        int lastId = -1;
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            rs.last();
            lastId = rs.getInt(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lastId;
    }

    public static boolean insertOrderDetail(OrderDetail orderDetail) {
        String sql = "insert into order_detail(customer_id, total_price) values (?, ?)";
        int checkInsertSuccess = 0;
        try {
            Connection conn = Controller.getConnection();
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setLong(1, orderDetail.getCustomer().getId());
            ps.setLong(2, orderDetail.getTotal());
            checkInsertSuccess = ps.executeUpdate();
            // insert list product detail
            int orderDetailId = getLastInsertOrderDetailId(conn);
            for (ProductDetail productDetail :
                    orderDetail.getProductDetailList()) {
                ProductDetail.insertProductDetail(productDetail, orderDetailId);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return checkInsertSuccess > 0;
    }

    public static OrderDetail getOrderDetail(int orderDetailId) {
        String sql = "select * from order_detail where id = ?";
//        List<OrderDetail> orderDetails = new ArrayList<>();
        OrderDetail orderDetail = null;
        try {
            PreparedStatement ps = Controller.getConnection().prepareStatement(sql);
            ps.setInt(1, orderDetailId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                int orderDetailId = rs.getInt("id");
//                int totalPrice = rs.getInt("total_price");
                int customerId = rs.getInt("customer_id");
                List<ProductDetail> productDetails = ProductDetail.getProductDetail(orderDetailId);
                Customer customer = Customer.getCustomer(customerId);
                orderDetail = new OrderDetail(productDetails, customer);
//                orderDetails.add(orderDetail);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return orderDetail;
    }
}
