package com.promineotech.flight.service;

import com.promineotech.flight.dao.EquipmentDao;
import com.promineotech.flight.entity.Equipment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Slf4j
public class DefaultEquipmentService implements EquipmentService{

    @Autowired
    private EquipmentDao equipmentDao;

    @Transactional(readOnly = true)
    public List<Equipment> fetchEquipment() {
        log.info("Called");

        List<Equipment> equipment = equipmentDao.fetchEquipment();

        if ((equipment == null) || equipment.isEmpty()) {
            throw new NoSuchElementException("No equipment found");
        }

        return equipment;
    }
}
