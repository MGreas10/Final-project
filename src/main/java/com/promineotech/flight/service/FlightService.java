package com.promineotech.flight.service;

import com.promineotech.flight.entity.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> fetchFlightsFromAirportOnDate(String airportCode, String departureDate);

}
