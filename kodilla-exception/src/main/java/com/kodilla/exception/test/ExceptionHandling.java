package com.kodilla.exception.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.0, 5.0);
        } catch (Exception e) {
            System.out.println("Wrong parameters values! Your numbers need to be: x > 2.0, y != 1.5");
        } finally {
            System.out.println("Time: " + LocalDate.now() + " " + LocalTime.now());
        }
    }
}
