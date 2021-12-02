// Erika Di Bella
package com.promineotech.flight.service;

import com.promineotech.flight.entity.Phone;

public interface CustomerService {
    void updateCustomerPhone(Phone phone, Long customerId) throws Exception;
}
