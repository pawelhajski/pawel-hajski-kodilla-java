package com.kodilla.good.patterns.food2door;

import java.util.Map;
import java.util.stream.Collectors;

public class FoodOrderProcessor {

    private Shop shop;
    private InformationService informationService;

    public FoodOrderProcessor(Shop shop, InformationService informationService) {
        this.informationService = informationService;
        this.shop = shop;
    }

    public void checkProducts() {
        String name = shop.getName();

        String products = shop.getProducts().entrySet().stream()
                .map(Map.Entry::toString)
                .collect(Collectors.joining(", "));

        System.out.println("Shop: " + name + "; available products: " + products);
    }

    public void orderProducts(String product, Integer quantity) {
        boolean orderStatus = shop.process(product, quantity);
        if(orderStatus) {
            informationService.inform("You have successfully ordered " + quantity + "x " + product + ".");
            System.out.println("Order confirmed.");
        } else {
            System.out.println("Error.");
        }
    }


}
