package org.example.service;

import org.example.entity.Product;
import org.example.dao.ProductDAO;
import org.example.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class ProductService {
    private final Session session = HibernateUtil.getSession();
    private final ProductDAO productDAO = new ProductDAO(session);

    public Product insertProductHibernate(Product product) {
        Transaction transaction = null;
        Optional<Product> optionalProduct = Optional.empty();
        try {
            transaction = session.beginTransaction();
            optionalProduct = Optional.of(productDAO.insertProductHibernate(product));
            transaction.commit();
        } catch (HibernateException ex) {
            if (transaction != null)
                transaction.rollback();
            ex.printStackTrace();
        }
        return optionalProduct.orElseThrow(() -> new ProductException("insert product field!"));
    }

    public List<Product> getAllProduct() {
        return this.productDAO.getAllProduct();
    }

    public Product getProductById(int productId) {
        Optional<Product> optionalProduct = Optional.empty();
        optionalProduct = Optional.ofNullable(productDAO.getProductById(productId));
        return optionalProduct.orElseThrow(() -> new ProductException("get product by id field!"));
    }

    public static class ProductException extends RuntimeException {
        public ProductException(String messenger) {
            super(messenger);
        }
    }
}

