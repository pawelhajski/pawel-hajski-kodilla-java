package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    public User user;
    public String productName;
    public int quantity;

    public OrderRequest(User user, String productName, int quantity) {
        this.user = user;
        this.productName = productName;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
