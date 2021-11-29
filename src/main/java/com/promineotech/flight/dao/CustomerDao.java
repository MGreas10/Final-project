package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.entity.Phone;

public interface CustomerDao {
    Customer updateCustomerPhone(Phone phone, Long customerId);
}
