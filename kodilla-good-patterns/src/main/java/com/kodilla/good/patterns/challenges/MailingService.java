package com.kodilla.good.patterns.challenges;

public class MailingService implements InformationService {

    public void inform(User user, String productName, int quantity) {
        System.out.println("You have ordered product: " + productName + ", quantity: " + quantity + ".");
    }
}
