package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Equipment;
import com.promineotech.flight.service.EquipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BasicEquipmentController implements EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    public List<Equipment> fetchEquipment() {
        log.info("Called");
        return equipmentService.fetchEquipment();
    }
}
