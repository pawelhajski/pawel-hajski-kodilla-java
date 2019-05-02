package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Frankfurt", true);
        flights.put("Katmandu", false);
        flights.put("Havana", false);

        if(flights.containsKey(flight.getDepartureAirport()) && flights.containsKey(flight.getArrivalAirport())) {
            if((flights.get(flight.getArrivalAirport()).booleanValue() == true) && (flights.get(flight.getDepartureAirport()).booleanValue() == true)){
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is possible.");
            } else {
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not possible.");
            }
        } else {
            throw new RouteNotFoundException("Departure and/or arrival airport is not in database.");
        }
    }
}
