package com.kodilla.good.patterns.food2door;

import java.util.*;

public class ExtraFoodShop implements Shop {

    private String name = "Extra Food Shop";
    private Map<String, Integer> products = new HashMap<>();

    public ExtraFoodShop() {
        products.put("Salami Premium", 100);
        products.put("Chorizo Extra", 100);
        products.put("Super Cheese", 100);
    }

    public boolean process(String product, Integer quantity) {
        if ((products.containsKey(product)) && (products.get(product) >= quantity)) {
            return true;
        } else {
            System.out.println("Demanded product is not available or not enough quantity in warehouse.");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
