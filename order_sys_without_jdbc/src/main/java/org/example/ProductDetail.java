package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDetail {
    private final Product product;
    private final int quantity;

    public ProductDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public long getTotal() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    /////////////////////////////////////////////////////////////////

    public static List<ProductDetail> getProductDetail(int orderDetailId) throws SQLException {
        List<ProductDetail> productDetails = new ArrayList<>();
        String sql = "select * from product_detail where order_detail_id = ?";
        PreparedStatement ps = Controller.getConnection().prepareStatement(sql);
        ps.setInt(1, orderDetailId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int productId = rs.getInt("product_id");
            int quantity = rs.getInt("quantity");
//                int total = rs.getInt("total");
            ProductDetail productDetail =
                    new ProductDetail(Product.getProduct(productId), quantity);
            productDetails.add(productDetail);
        }
        return productDetails;
    }


    public static boolean insertProductDetail(ProductDetail productDetail, int orderDetailId) {
        String sql = "insert into product_detail (order_detail_id, product_id, quantity, total) values (?, ?, ?, ?)";
        int checkInsertSuccess = 0;
        try {
            PreparedStatement ps = Controller.getConnection().prepareStatement(sql);
            ps.setInt(1, orderDetailId);
            ps.setInt(2, productDetail.getProduct().getId());
            ps.setInt(3, productDetail.getQuantity());
            ps.setLong(4, productDetail.getTotal());
            checkInsertSuccess = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return  checkInsertSuccess > 0;
    }
}
