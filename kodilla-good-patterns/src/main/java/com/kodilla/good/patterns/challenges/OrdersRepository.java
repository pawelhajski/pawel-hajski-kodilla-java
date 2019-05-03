package com.kodilla.good.patterns.challenges;

public interface OrdersRepository {

    boolean createOrder(User user, String productName, int quantity);
}
