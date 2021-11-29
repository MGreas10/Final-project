package com.promineotech.flight.service;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.entity.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultCustomerService implements CustomerService {
    public Customer updateCustomerPhone(Phone phone, Long customerId) {
        log.info("phone={}, customerId={}", phone, customerId);
        return null;
    }
}
