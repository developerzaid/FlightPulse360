package com.hazyaz.FlightPulse360.controller;

import com.hazyaz.FlightPulse360.model.Client;
import com.hazyaz.FlightPulse360.model.Crew;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    // CONTROLLERS for all the crews
    @Operation(tags = "ET: Client", description = "Shows the list of all client")
    @GetMapping("/all-client")
    public String all_client() {
        return "This is a login screen";
    }

    // CONTROLLERS adding new crew
    @Operation(tags = "ET: Client", description = "add the new client")
    @PostMapping("/add-client")
    public String add_client(@RequestBody Client client) {
        return "This is a login screen";
    }
}