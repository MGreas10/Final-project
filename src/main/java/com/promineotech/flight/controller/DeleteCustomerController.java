// Marianne Greas
package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Customer;
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
@OpenAPIDefinition(info = @Info(title = "Delete Customer"), servers = {
        @Server(url = "http://localhost:8080", description = "Local server.")})
public interface DeleteCustomerController {
    // @formatter:off
    @Operation(summary = "Delete a customer",
            description = "Delete a customer given customer id value",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "A customer was successfully deleted",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Customer.class))),

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

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteCustomer(@Valid @PathVariable Long customerId) throws Exception;
    //@formatter:on
}
