// Marianne Greas
package com.promineotech.flight.service;

import com.promineotech.flight.dao.NewCustomerDao;
import com.promineotech.flight.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NewCustomerService {

    @Autowired
    private NewCustomerDao createNewCustomerDao;

    public Customer createANewCustomer(Customer customer) {
        log.debug("CustomerService: createANewcustomer method is called");
        return createNewCustomerDao.addNewCustomer(customer);
    }
}
