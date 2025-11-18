package com.hazyaz.FlightPulse360.controller;

import com.hazyaz.FlightPulse360.dto.UserLogin;
import com.hazyaz.FlightPulse360.model.Aircraft;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AircraftController {


    @Operation(tags = "ET: Aircraft" ,description = "Allows the user to add new aircraft")
    @PostMapping("/add-aircraft")
    public String add_aircraft(@RequestBody Aircraft aircraft){
        return "This is a login screen";
    }

    @Operation(tags = "ET: Aircraft" ,description = "Allows the user to see all the aircraft")
    @GetMapping("/all-aircraft")
    public String all_aircraft(){
        return "This is a login screen";
    }



}
