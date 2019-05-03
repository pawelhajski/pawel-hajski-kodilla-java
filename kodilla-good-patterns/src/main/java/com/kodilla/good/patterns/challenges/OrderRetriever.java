package com.kodilla.good.patterns.challenges;

public class OrderRetriever {

    public OrderRequest retrieve() {
        User user = new User("Adam", "Smith");
        String productName = "Tooth brush";
        int quantity = 2;

        return new OrderRequest(user, productName, quantity);
    }
}
