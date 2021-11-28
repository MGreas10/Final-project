package com.promineotech.flight.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.promineotech.flight.support.FetchFlightTestSupport;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

class FetchFlightTest extends FetchFlightTestSupport {

	@Test
	void testThatListOfFlightsReturned() {
		// given: a valid departure and arrival airports
		
		
		// when: a connection is made
		
		// Then: a  success status code is returned 
	}

}
