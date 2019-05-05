package com.kodilla.good.patterns.flights;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlightSearcher {

    public void flightFrom(String departureCity) {
        System.out.println("From " + departureCity + " the available flight connections are as follow:");
        FlightDatabase flightDatabase = new FlightDatabase();
        List<Flight> from = flightDatabase.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(departureCity))
                .collect(toList());

        if(from.isEmpty()) {
            System.out.println("There is no such connection in database.");
        } else {
            from.forEach(System.out::println);
        }
    }

    public void flightTo(String arrivalCity) {
        System.out.println("To " + arrivalCity + " the available flight connections are as follow:");
        FlightDatabase flightDatabase = new FlightDatabase();
        List<Flight> to = flightDatabase.getFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalCity))
                .collect(toList());

        if(to.isEmpty()) {
            System.out.println("There is no such connection in database.");
        } else {
            to.forEach(System.out::println);
        }
    }

    public void flightFromToBy(String departureCity, String arrivalCity, String connectionCity) {
        System.out.println("From " + departureCity + " to " + arrivalCity + " through " + connectionCity + " the connections are as follow:");
        FlightDatabase flightDatabase = new FlightDatabase();

        List<Flight> to = flightDatabase.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(connectionCity) && f.getArrivalAirport().equals(arrivalCity))
                .collect(Collectors.toList());

        List<Flight> from = flightDatabase.getFlights().stream()
                .filter((f -> f.getDepartureAirport().equals(departureCity) && f.getArrivalAirport().equals(connectionCity)))
                .collect(toList());

        if(to.isEmpty() || from.isEmpty()) {
            System.out.println("There is no such connection in database.");
        } else {
            Stream.concat(from.stream(), to.stream())
                    .forEach(System.out::println);
        }
    }
}