package org.example.dao;

import org.example.entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDAO {

    private final Session session;

    public ProductDAO(Session session) {
        this.session = session;
    }

    public Product insertProductHibernate(Product product) {
        session.save(product);
        return product;
    }

    public List<Product> getAllProduct() {
        return session.createQuery("from Product").list();
    }

    public Product getProductById(int productId) {
        return session.get(Product.class, productId);
    }
}
