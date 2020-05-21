package org.example;

import javax.persistence.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderDetail makeOrder(List<ProductDetail> productDetailList) {
        return new OrderDetail(productDetailList, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    ///////////////////////////////////////////////////////////////////

    public static Customer getCustomer(int customerId) {
        String sql = "select * from customer where id = ?";
        Customer customer = null;
        try (PreparedStatement ps = Controller.getConnection().prepareStatement(sql)) {
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();
            rs.first();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            customer = new Customer(id, name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }
}
