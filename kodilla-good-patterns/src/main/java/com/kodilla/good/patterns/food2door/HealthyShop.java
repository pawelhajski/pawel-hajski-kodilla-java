package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop {

    private String name = "Healthy Shop";
    private Map<String, Integer> products = new HashMap<>();

    public HealthyShop() {
        products.put("Lactose Free Milk", 100);
        products.put("Fresh Apple", 100);
        products.put("Fat-less Sausage", 100);
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
