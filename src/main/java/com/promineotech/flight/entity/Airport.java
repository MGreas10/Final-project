package com.promineotech.flight.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Airport {

	  private Long id;
	  private String airportCode;
	  private String description;
}
