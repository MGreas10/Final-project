package com.promineotech.flight.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Flight {
    private Long id;
    private Long arrivalAirportId;
    private String arrivalDateTime;
    private Long depatureAirportId;
    private String departureDateTime;
    private String description;
    private Long equipmentId;
}
