package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.entity.Flight;
import com.promineotech.flight.entity.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class DefaultCustomerDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Customer updateCustomerPhone(Phone phone, Long customerId) {
        log.info("phone={}, customerId={}", phone, customerId);
        return null;
    }
}
