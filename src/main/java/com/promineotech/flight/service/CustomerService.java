package com.promineotech.flight.service;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.entity.Phone;

public interface CustomerService {
    Customer updateCustomerPhone(Phone phone, Long customerId);
}
