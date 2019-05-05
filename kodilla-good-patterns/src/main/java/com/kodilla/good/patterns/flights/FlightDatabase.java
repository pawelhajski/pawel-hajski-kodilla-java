package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {

    private List<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        flights.add(new Flight("Warsaw", "Moscow"));
        flights.add(new Flight("Warsaw", "Kiev"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Warsaw", "Frankfurt"));
        flights.add(new Flight("Frankfurt", "Warsaw"));
        flights.add(new Flight("Frankfurt", "London"));
        flights.add(new Flight("Frankfurt", "New York"));
        flights.add(new Flight("Frankfurt", "Prague"));
        flights.add(new Flight("London", "Frankfurt"));
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("London", "Edinburgh"));
        flights.add(new Flight("New York", "Tokyo"));
        flights.add(new Flight("New York", "London"));
        flights.add(new Flight("New York", "Frankfurt"));

    }

    public List<Flight> getFlights() {
        return flights;
    }
}
