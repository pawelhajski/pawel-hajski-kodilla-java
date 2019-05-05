package com.kodilla.good.patterns.flights;

public class Processor {

    public static void main(String[] args) {
        FlightSearcher flightSearcher =  new FlightSearcher();
        flightSearcher.flightFrom("Katowice");
        flightSearcher.flightTo("Katowice");
        flightSearcher.flightFromToBy("Katowice", "Kiev", "Warsaw");
    }
}
