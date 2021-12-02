// Erika Di Bella
package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Airport;

import java.util.List;

public interface AirportDao {
    List<Airport> fetchAirports();
}
