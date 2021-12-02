// Marianne Greas
package com.promineotech.flight.controller;

import com.promineotech.flight.service.DeleteCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DefaultDeleteCustomerController implements DeleteCustomerController{

    @Autowired
    private DeleteCustomerService customerService;

    public void deleteCustomer(Long customerId) throws Exception {
        log.debug("DeletController: deleteCustomer method is called");
        customerService.removeCustomer(customerId);
    }
}
