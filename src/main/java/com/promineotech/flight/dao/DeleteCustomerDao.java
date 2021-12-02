// Marianne Greas
package com.promineotech.flight.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DeleteCustomerDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void deleteCustomerById(Long customerId) throws Exception {
        log.debug("DeleteCustomerDao: erase method is called");

        final String sql = "DELETE FROM customer WHERE id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", customerId);

        long rowsAffected = jdbcTemplate.update(sql, params);
        if (0 == rowsAffected) {
            throw new Exception("Customer ID Invalid");
        }
    }
}
