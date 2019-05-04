package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface Shop {
    boolean process(String prodcut, Integer quantity);
    Map<String, Integer> getProducts();
    String getName();
}
