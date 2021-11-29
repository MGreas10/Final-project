package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Customer;
import com.promineotech.flight.entity.Phone;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping("/customer/{customerId}")
@OpenAPIDefinition(info = @Info(title = "Customer Service"),
        servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
public interface CustomerController {
    // @formatter:off
    @Operation(summary = "Updates a customer's phone number",
            description = "Updates a customer's phone number given customer table id field value",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "A customer's phone number was updated",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Customer.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "The request parameters are invalid",
                            content = @Content(
                                    mediaType = "application/json")),
                    @ApiResponse(
                            responseCode = "404",
                            description = "No customer was found with the input criteria",
                            content = @Content(
                                    mediaType = "application/json")),
                    @ApiResponse(
                            responseCode = "500",
                            description = "An unplanned error occurred",
                            content = @Content(
                                    mediaType = "application/json"))},
            parameters = {})

    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    Customer updateCustomerPhone(@Valid @RequestBody Phone phone, @PathVariable Long customerId);
//@formatter:on
}
