// Erika Di Bella
package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Equipment;
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
public class DefaultEquipmentDao implements EquipmentDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Equipment> fetchEquipment() {
        log.info("Called");

        //@formatter:off
        String sql = ""
                + "SELECT * "
                + "FROM equipment";
        //@formatter:on

        Map<String, Object> params = new HashMap<String, Object>();

        return jdbcTemplate.query(sql, params, new RowMapper<>() {
            public Equipment mapRow(ResultSet rs, int rowNum) throws SQLException {
                // @formatter : off
                return Equipment.builder()
                        .id(rs.getLong("id"))
                        .description(rs.getString("description"))
                        .numberOfSeats(rs.getLong("number_of_seats"))
                        .tailNumber(rs.getString("tail_number"))
                        .build();
                //@formatter: on
            }
        });
    }
}
