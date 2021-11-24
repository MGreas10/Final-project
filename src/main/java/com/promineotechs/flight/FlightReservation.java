package com.promineotechs.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.promineotechs.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class FlightReservation {

	public static void main(String[] args) {
		SpringApplication.run(FlightReservation.class, args);

	}

}
