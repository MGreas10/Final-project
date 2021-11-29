package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DefaultCustomerDao implements CustomerDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void updateCustomerPhone(Phone phone, Long customerId) throws Exception {
        log.info("phone={}, customerId={}", phone, customerId);

        // @formatter:off
        String sql = ""
                + "UPDATE customer "
                + "SET phone = :phone "
                + "WHERE id = :customer_id";
        // @formatter:on

        MapSqlParameterSource source = new MapSqlParameterSource();
        source.addValue("phone", phone.getPhone());
        source.addValue("customer_id", customerId);

        KeyHolder keyHolder = new GeneratedKeyHolder();
        if (0 == jdbcTemplate.update(sql, source, keyHolder)) {
            throw new Exception("Customer ID Invalid");
        }
    }
}
