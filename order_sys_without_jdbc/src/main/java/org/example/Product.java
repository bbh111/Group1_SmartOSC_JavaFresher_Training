package org.example;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private long price;

    public Product() {
    }

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                price == product.price &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    ////////////////////////////////////////////////////////////////
    public static Product getProduct(int productId) {
        String sql = "select * from product where id = ?";
        Product product = null;
        try {
            PreparedStatement ps = Controller.getConnection().prepareStatement(sql);
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            rs.first();
            String name = rs.getString("name");
            int price = rs.getInt("price");
            product =  new Product(productId, name, price);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return product;
    }

    public static boolean insertProduct(Product product){
        String sql = "insert into Product(name, price) values (?, ?)";
        int checkInsertSuccess = 0;
        try {
            PreparedStatement ps = Controller.getConnection().prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setLong(2, product.getPrice());
            checkInsertSuccess = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return checkInsertSuccess > 0;

    }
}