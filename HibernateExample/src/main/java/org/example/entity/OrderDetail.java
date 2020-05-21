package org.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
