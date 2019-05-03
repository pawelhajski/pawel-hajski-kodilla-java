package com.kodilla.good.patterns.challenges;

public class ServiceMain {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailingService(), new ItemOrderService(), new ProductOrderRepository());
        productOrderService.process(orderRequest);
    }
}
