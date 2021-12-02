// Erika Di Bella
package com.promineotech.flight.dao;

import com.promineotech.flight.entity.Phone;

public interface CustomerDao {
    void updateCustomerPhone(Phone phone, Long customerId) throws Exception;
}
