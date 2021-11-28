package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Flight;
import com.promineotech.flight.Constants;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.constraints.Pattern;
import java.util.List;

@Validated
@RequestMapping("/flight")
@OpenAPIDefinition(info = @Info(title = "Flight Service"),
        servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
public interface FlightController {

    // @formatter:off
    @Operation(summary = "Returns a list of flights",
            description = "Returns a list of flights departing from a given airport on a giaven date",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "A list of flights is returned",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Flight.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "The request parameters are invalid",
                            content = @Content(
                                    mediaType = "application/json")),
                    @ApiResponse(
                            responseCode = "404",
                            description = "No flights were found with the input criteria",
                            content = @Content(
                                    mediaType = "application/json")),
                    @ApiResponse(
                            responseCode = "500",
                            description = "An unplanned error occurred",
                            content = @Content(
                                    mediaType = "application/json"))},
            parameters = {
                    @Parameter(
                            name = "airportCode", allowEmptyValue = false, required = true,
                            description = "airport code (i.e. 'DEN')"),
                    @Parameter(
                            name = "departureDate", allowEmptyValue = false, required = true,
                            description = "departure date (i.e. '2011-12-02')")})

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Flight> fetchFlightsFromAirportOnDate(
            @Length(max = Constants.AIRPORT_CODE_MAX_LENGTH)
            @Length(min = Constants.AIRPORT_CODE_MIN_LENGTH)
            @Pattern(regexp = "[A-Z]{3}")
            @RequestParam(required = true)
                    String airportCode,
            @Length(max = Constants.DATE_MAX_LENGTH)
            @Length(min = Constants.DATE_MIN_LENGTH)
            @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
            @RequestParam(required = true)
                    String departureDate);
//@formatter:on

}
