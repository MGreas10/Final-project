package com.promineotechs.flight.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.promineotechs.flight.support.FetchFlightTestSupport;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

class FetchFlightTest extends FetchFlightTestSupport {

	@Test
	void testThatListOfFlightsReturned() {
		// given: a valid departure and arrival airports
		
		
		// when: a connection is made
		
		// Then: a  success status code is returned 
	}

}
