package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        Flight warsawToFrankfurt = new Flight("Warsaw", "Frankfurt");
        Flight frankfurtToKatmandu = new Flight("Frankfurt", "Katmandu");
        Flight havanaToWarsaw = new Flight("Havana", "Warsaw");
        Flight londonToFrankfurt = new Flight("London", "Frankfurt");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(londonToFrankfurt);
        } catch (RouteNotFoundException e) {
            System.out.println("One of airports is not in database. Please type another values.");
        }
    }
}
