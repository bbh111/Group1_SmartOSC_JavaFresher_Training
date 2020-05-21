package org.example;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.entity.Product;
import org.example.service.ProductService;
import org.example.util.HibernateUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HibernateTest {
    @Test
    public void isShouldGetSessionNotNull() {
        assertThat(HibernateUtil.getSession()).isNotNull();
    }

    @Test
    public void isShouldInsertProductReturnProductId() {
        Product product = new Product("cacao", 2);
        Product productResult = new ProductService().insertProductHibernate(product);
        assertThat(productResult.getId()).isEqualTo(product.getId());
    }

    @Test
    public void isShouldGetAllProductReturnAllProduct() {
        List<Product> products = new ProductService().getAllProduct();
        assertThat(products).isNotNull();
    }

    @Test
    public void isShouldGetProductByIdReturnProductIsTrue() {
        int productId = 1;
        Product product = new ProductService().getProductById(productId);
        assertThat(product.getId()).isEqualTo(productId);
    }

    @Test
    public void isShouldGetProductByIdThrowProductException() {
        int productId = 9;
        Exception exception = assertThrows(ProductService.ProductException.class,
                () -> new ProductService().getProductById(productId));
        String messenger = "get product by id field!";
        String actualMessenger = exception.getMessage();
        assertTrue(actualMessenger.contains(messenger));
    }
}
