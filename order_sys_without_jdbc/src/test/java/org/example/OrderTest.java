package org.example;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class OrderTest {

    @Test
    public void customerCanMakeOrder() {
        Customer customer = new Customer();
        List<ProductDetail> productDetailList = Arrays.asList(
                new ProductDetail(new Product(1, "Laptop", 1000), 2),
                new ProductDetail(new Product(2, "Tivi", 3000), 3)
        );
        OrderDetail orderDetail = customer.makeOrder(productDetailList);
        assertThat(orderDetail).isNotNull();
    }

    @Test
    public void orderShouldContain2Products() {
        Customer customer = new Customer();
        List<ProductDetail> productDetailList = Arrays.asList(
                new ProductDetail(new Product(1, "Laptop", 1000), 2),
                new ProductDetail(new Product(2, "Tivi", 3000), 3)
        );
        OrderDetail orderDetail = customer.makeOrder(productDetailList);
        assertThat(orderDetail).isNotNull();
        assertThat(orderDetail.getProductDetailList().size()).isEqualTo(2);
    }

    @Test
    public void orderShouldCalculateTheTotalProductInCart() {
        Customer customer = new Customer();
        List<ProductDetail> productDetailList = Arrays.asList(
                new ProductDetail(new Product(1, "Laptop", 1000), 2),
                new ProductDetail(new Product(2, "Tivi", 3000), 3)
        );
        OrderDetail orderDetail = customer.makeOrder(productDetailList);
        assertThat(orderDetail).isNotNull();
        assertThat(orderDetail.getProductDetailList().size()).isEqualTo(2);
        assertThat(orderDetail.getTotal()).isEqualTo(11000);
    }

    @Test
    public void shouldGenerateHTML() throws IOException {
        Customer customer = new Customer("Phuoc");
        List<ProductDetail> productDetailList = Arrays.asList(
                new ProductDetail(new Product(1, "Laptop", 1000), 2),
                new ProductDetail(new Product(2, "Tivi", 3000), 3)
        );

        OutputStream out = new FileOutputStream(new File("./orderHTML.html"));
        customer.makeOrder(productDetailList).generate(out);

        List<String> contents = Files.readAllLines(Paths.get("./orderHTML.html"));
        assertThat(contents).isNotNull();
        assertThat(contents.size()).isGreaterThan(0);
        assertThat(contents.stream().filter(s -> s.contains("Phuoc")).count() == 1).isTrue();
    }

    @Test
    public void fileShouldContainsProductInIt() throws IOException {
        Customer customer = new Customer("Phuoc");
        List<ProductDetail> productDetailList = Arrays.asList(
                new ProductDetail(new Product(1, "Laptop", 1000), 2),
                new ProductDetail(new Product(2, "Tivi", 3000), 3)
        );

        OutputStream out = new FileOutputStream(new File("./orderHTML.html"));
        customer.makeOrder(productDetailList).generate(out);

        String contents = new String(Files.readAllBytes(Paths.get("./orderHTML.html")));
        assertThat(contents).isNotNull();
        assertThat(contents).contains("Laptop");
        assertThat(contents).contains("Tivi");
        assertThat(contents).contains("2000");
        assertThat(contents).contains("9000");
        assertThat(contents).containsOnlyOnce("Phuoc");
    }

    @Test
    public void fileShouldContainsTotal() throws IOException {
        Customer customer = new Customer("Phuoc");
        List<ProductDetail> productDetailList = Arrays.asList(
                new ProductDetail(new Product(1, "Laptop", 1000), 2),
                new ProductDetail(new Product(2, "Tivi", 3000), 3)
        );

        OutputStream out = new FileOutputStream(new File("./orderHTML.html"));
        customer.makeOrder(productDetailList).generate(out);

        String contents = new String(Files.readAllBytes(Paths.get("./orderHTML.html")));
        assertThat(contents).isNotNull();
        assertThat(contents).contains("Total");
        assertThat(contents).contains("11000");
    }

    @Test
    public void canGetOrderDetail() {
        OrderDetail orderDetail = OrderDetail.getOrderDetail(1);
        assertThat(orderDetail).isNotNull();
        assertThat(orderDetail.getProductDetailList().size() == 2).isTrue();
        assertThat(orderDetail.getCustomer().getName()).contains("Phuoc");
    }

    @Test
    public void canGetCustomer() {
        int customerId = 2;
        Customer customer = Customer.getCustomer(customerId);
        assertThat(customer.getId()).isEqualTo(customerId);
    }

    @Test
    public void canInsertOrderDetail() {
        Customer customer = Customer.getCustomer(2);
        List<ProductDetail> productDetails = Arrays.asList(
                new ProductDetail(Product.getProduct(2), 2),
                new ProductDetail(Product.getProduct(3), 3)
        );
        OrderDetail orderDetail = new OrderDetail(productDetails, customer);
        System.out.println(orderDetail.getOrderDetailId());
//        boolean checkInsert = OrderDetail.insertOrderDetail(orderDetail);
//        OrderDetail orderDetailGet = OrderDetail.getOrderDetail(orderDetail.getOrderDetailId());
//        assertThat(checkInsert).isEqualTo(true);
//        assertThat(orderDetailGet.getCustomer().getId()).isEqualTo(customer.getId());
    }
}
