package com.hazyaz.FlightPulse360.controller;

import com.hazyaz.FlightPulse360.dto.UserLogin;
import com.hazyaz.FlightPulse360.dto.UserRegistration;
import com.hazyaz.FlightPulse360.model.Vendor;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {

    // CONTROLLERS FOR LOGING IN USER
    @Operation(tags = "ET: Vendor" ,description = "shows all the vendors in the list")
    @GetMapping("/all-vendor")
    public String all_vendor(){
        return "This is a login screen";
    }

    // CONTROLLERS FOR SIGNING UP NEW USER
    @Operation(tags = "ET: Vendor" ,description = "Helps in adding new vendor")
    @PostMapping("/add-vendor")
    public String add_vendor(@RequestBody Vendor vendor){
        return "This is a registration screen";
    }



}
