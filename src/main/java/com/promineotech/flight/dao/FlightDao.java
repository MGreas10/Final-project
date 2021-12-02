// Erika Di Bella
package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Flight;

import java.util.List;

public interface FlightDao {
    List<Flight> fetchFlightsFromAirportOnDate(String airportCode, String departureDate);
}
