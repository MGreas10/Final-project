package com.promineotech.flight.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Reservation {
	private Long id;
    private Long customerId;
    private Long flightId;
}
