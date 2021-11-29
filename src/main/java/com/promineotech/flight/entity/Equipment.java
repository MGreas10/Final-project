package com.promineotech.flight.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Equipment {
    private Long id;
    private String description;
    private Long numberOfSeats;
    private String tailNumber;
}
