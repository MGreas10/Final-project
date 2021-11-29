package com.promineotech.flight.service;

import com.promineotech.flight.dao.FlightDao;
import com.promineotech.flight.entity.Flight;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Slf4j
public class DefaultFlightService implements FlightService {

    @Autowired
    private FlightDao flightDao;

    @Transactional(readOnly = true)
    public List<Flight> fetchFlightsFromAirportOnDate(String airportCode, String departureDate) {
        log.info("airportCode={}, departureDate={}", airportCode, departureDate);

        List<Flight> flights = flightDao.fetchFlightsFromAirportOnDate(airportCode, departureDate);

        if ((flights == null) || flights.isEmpty()) {
            String msg = String.format("No flights found with airportCode = %s and date = %s", airportCode, departureDate);
            throw new NoSuchElementException(msg);
        }

        return flights;
    }
}
