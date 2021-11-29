package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Flight;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class DefaultFlightDao implements FlightDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Flight> fetchFlightsFromAirportOnDate(String airportCode, String departureDate) {
        log.info("airportCode={}, departureDate={}", airportCode, departureDate);

        //@formatter:off
        String sql = ""
                + "SELECT flight.* "
                + "FROM flight, airport "
                + "WHERE departure_airport_id = airport.id"
                + "  AND airport_code = :airport_code"
                + "  AND departure_date_time like :departure_date";
        //@formatter:on

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("airport_code", airportCode);
        params.put("departure_date", departureDate + "%");

        return jdbcTemplate.query(sql, params, new RowMapper<>() {
            public Flight mapRow(ResultSet rs, int rowNum) throws SQLException {
                // @formatter : off
                return Flight.builder()
                        .id(rs.getLong("id"))
                        .arrivalAirportId(rs.getLong("arrival_airport_id"))
                        .arrivalDateTime(rs.getString("arrival_date_time"))
                        .depatureAirportId(rs.getLong("departure_airport_id"))
                        .departureDateTime(rs.getString("departure_date_time"))
                        .description(rs.getString("description"))
                        .equipmentId(rs.getLong("equipment_id"))
                        .build();
                //@formatter: on
            }
        });
    }
}
