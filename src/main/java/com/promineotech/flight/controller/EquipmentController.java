package com.promineotech.flight.controller;

import com.promineotech.flight.entity.Equipment;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Validated
@RequestMapping("/equipment")
@OpenAPIDefinition(info = @Info(title = "Equipment Service"),
        servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
public interface EquipmentController {
    // @formatter:off
    @Operation(summary = "Returns a list of equipment",
            description = "Returns a list of all equipment",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "A list of equipment is returned",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Equipment.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "The request parameters are invalid",
                            content = @Content(
                                    mediaType = "application/json")),
                    @ApiResponse(
                            responseCode = "404",
                            description = "No airports were found with the input criteria",
                            content = @Content(
                                    mediaType = "application/json")),
                    @ApiResponse(
                            responseCode = "500",
                            description = "An unplanned error occurred",
                            content = @Content(
                                    mediaType = "application/json"))},
            parameters = {})

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Equipment> fetchEquipment();
//@formatter:on
}
