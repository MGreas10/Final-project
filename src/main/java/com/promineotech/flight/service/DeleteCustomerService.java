// Marianne Greas
package com.promineotech.flight.service;

import com.promineotech.flight.dao.DeleteCustomerDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeleteCustomerService {

    @Autowired
    private DeleteCustomerDao deleteCustomerDao;

    public void removeCustomer(Long customerId) throws Exception {
        deleteCustomerDao.deleteCustomerById(customerId);
        log.debug("DeletService: remove method is called");
    }
}
