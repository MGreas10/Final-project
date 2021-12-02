package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Airport;
import com.promineotech.flight.service.AirportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BasicAirportController implements AirportController {

    @Autowired
    private AirportService airportService;

    public List<Airport> fetchAirports() {
        log.info("Called");
        return airportService.fetchAirports();
    }

}
