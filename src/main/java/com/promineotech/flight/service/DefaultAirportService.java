package com.promineotech.flight.service;

import com.promineotech.flight.dao.AirportDao;
import com.promineotech.flight.dao.FlightDao;
import com.promineotech.flight.entity.Airport;
import com.promineotech.flight.entity.Flight;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Slf4j
public class DefaultAirportService implements AirportService {

    @Autowired
    private AirportDao airportDao;

    @Transactional(readOnly = true)
    public List<Airport> fetchAirports() {
        log.info("Called");

        List<Airport> airports = airportDao.fetchAirports();

        if ((airports == null) || airports.isEmpty()) {
            throw new NoSuchElementException("No airports found");
        }

        return airports;
    }

}
