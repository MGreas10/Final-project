// Erika Di Bella
package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Phone;
import com.promineotech.flight.service.CustomerService;
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

    public void updateCustomerPhone(@Valid @RequestBody Phone phone, @PathVariable Long customerId) throws Exception {
        log.debug("phone={}, customerId={}", phone, customerId);
        customerService.updateCustomerPhone(phone, customerId);
    }
}
