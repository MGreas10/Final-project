// Marianne Greas
package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NewCustomerDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Customer addNewCustomer(Customer customer) {

        log.debug("NewCustomerDao: createNewCustomer method is called");

        final String sql = "INSERT INTO customer (first_name, last_name, phone) "
                + "VALUES (:first_name, :last_name, :phone)";

        SqlParameterSource sqlPrams = new MapSqlParameterSource("first_name", customer.getFirstName())
                .addValue("last_name", customer.getLastName())
                .addValue("phone", customer.getPhone());

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(sql, sqlPrams, keyHolder);
        int id = keyHolder.getKey().intValue();
        return Customer.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .phone(customer.getPhone())
                .build();
    }

}
