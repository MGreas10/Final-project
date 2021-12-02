// Marianne Greas
package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.service.NewCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DefaultNewCustomerController implements NewCustomerController {

    @Autowired
    private NewCustomerService newCustomerService;

    @Override
    public Customer createNewCustomer(Customer customer) {
        log.debug("Default: createNewCustomer method is called");

        return newCustomerService.createANewCustomer(customer);
    }

}
