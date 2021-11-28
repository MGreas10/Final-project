package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Flight;
import com.promineotech.flight.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BasicFlightController implements FlightController {

    @Autowired
    private FlightService flightService;

    public List<Flight> fetchFlightsFromAirportOnDate(String airportCode, String departureDate) {
        log.info("airportCode={}, departureDate={}", airportCode, departureDate);
        return flightService.fetchFlightsFromAirportOnDate(airportCode, departureDate);
    }
}
