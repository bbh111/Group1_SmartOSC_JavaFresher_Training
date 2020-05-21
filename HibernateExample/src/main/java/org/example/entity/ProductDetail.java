package org.example.entity;

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
}
