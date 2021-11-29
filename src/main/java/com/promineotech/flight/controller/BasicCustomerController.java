package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.entity.Phone;
import com.promineotech.flight.service.CustomerService;
import com.promineotech.flight.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class BasicCustomerController implements CustomerController {

    @Autowired
    private CustomerService customerService;

    public Customer updateCustomerPhone(@Valid @RequestBody Phone phone, @PathVariable Long customerId) {
        log.debug("phone={}, customerId={}", phone, customerId);
        return customerService.updateCustomerPhone(phone, customerId);
    }
}
