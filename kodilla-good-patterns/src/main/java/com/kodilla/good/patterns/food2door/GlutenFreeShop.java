package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop {

    private String name = "Gluten Free Shop";
    private Map<String, Integer> products = new HashMap<>();

    public GlutenFreeShop() {
        products.put("Gluten Free Bread", 100);
        products.put("Gluten Free Pasta", 100);
        products.put("Gluten Free Flour", 100);
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
