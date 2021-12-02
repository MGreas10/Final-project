package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Airport;
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
public class DefaultAirportDao implements AirportDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Airport> fetchAirports() {
        log.info("Called");

        //@formatter:off
        String sql = ""
                + "SELECT * "
                + "FROM airport";
        //@formatter:on

        Map<String, Object> params = new HashMap<String, Object>();

        return jdbcTemplate.query(sql, params, new RowMapper<>() {
            public Airport mapRow(ResultSet rs, int rowNum) throws SQLException {
                // @formatter : off
                return Airport.builder()
                        .id(rs.getLong("id"))
                        .airportCode(rs.getString("airport_code"))
                        .description(rs.getString("description"))
                        .build();
                //@formatter: on
            }
        });
    }
}
