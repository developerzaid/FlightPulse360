package com.hazyaz.FlightPulse360.controller;

import com.hazyaz.FlightPulse360.dto.UserLogin;
import com.hazyaz.FlightPulse360.model.Crew;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrewController {


    // CONTROLLERS for all the crews
    @Operation(tags = "ET: Crew" ,description = "Shows the list of all crews")
    @GetMapping("/all-crew")
    public String all_crew(){
        return "This is a login screen";
    }

    // CONTROLLERS adding new crew
    @Operation(tags = "ET: Crew" ,description = "add the new crews")
    @PostMapping("/add-crew")
    public String add_crew(@RequestBody Crew crew) {
        return "This is a login screen";
    }



}
