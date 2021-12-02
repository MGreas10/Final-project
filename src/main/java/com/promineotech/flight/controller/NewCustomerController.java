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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Validated
@RequestMapping("/customer/add")
@OpenAPIDefinition(info = @Info(title = "Create Customer"), servers = {
        @Server(url = "http://localhost:8080", description = "Local server.")})
public interface NewCustomerController {
    // @formatter:off
    @Operation(summary = "Create a new customer",
            description = "Creat a new customer given first and last name and phone number values",
            responses = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "A new customer was successfully created",
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
            parameters = {
// TODO: There's no need for any parameters.  The new customer data is in the "RequestBody" below.
//                    @Parameter(name = "addNewClientRequest",
//                            required = true,
//                            description = "Add as json")
            })

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Customer createNewCustomer(@Valid @RequestBody Customer customer);
//@formatter:on
}
