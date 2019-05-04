package com.kodilla.good.patterns.food2door;

public class FoodServiceMain {

    public static void main(String[] args) {
        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new ExtraFoodShop(), new InformationProcessor());
        foodOrderProcessor.checkProducts();
        foodOrderProcessor.orderProducts("Salami Premium", 50);
    }
}
