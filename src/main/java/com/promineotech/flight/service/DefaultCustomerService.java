package com.promineotech.flight.service;

import com.promineotech.flight.dao.CustomerDao;
import com.promineotech.flight.entity.Phone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class DefaultCustomerService implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Transactional
    public void updateCustomerPhone(Phone phone, Long customerId) throws Exception {
        log.info("phone={}, customerId={}", phone, customerId);
        customerDao.updateCustomerPhone(phone, customerId);
    }
}
