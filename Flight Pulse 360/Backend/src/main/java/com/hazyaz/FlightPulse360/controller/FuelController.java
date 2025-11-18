package com.hazyaz.FlightPulse360.controller;

import com.hazyaz.FlightPulse360.model.Fuel;
import com.hazyaz.FlightPulse360.model.Vendor;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class FuelController {

    // CONTROLLERS FOR LOGING IN USER
    @Operation(tags = "SV: Fuel" ,description = "Shows all the fuel request")
    @GetMapping("/fuel-request")
    public String all_fuel_request(){
        return "This is a login screen";
    }

    // CONTROLLERS FOR SIGNING UP NEW USER
    @Operation(tags = "SV: Fuel" ,description = "Helps in adding new fuel request")
    @PostMapping("/add-fuel-requests")
    public String add_fuel_request(@RequestBody Fuel fuel){
        return "This is a registration screen";
    }

    // CONTROLLERS FOR UPDATING THE FIELD IN THE FUEL
    @Operation(tags = "SV: Fuel" ,description = "Helps in updating new fuel request")
    @PatchMapping("/update-fuel-requests/{id}")
    public String update_fuel_request(@RequestParam String id, @RequestBody Map<String, Object> updates){
        return "This is a registration screen";
    }

// for the service layer
    //    @PatchMapping("/trip/{id}")
//    public Trip patchTrip(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
//        Trip trip = tripRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Trip not found"));
//
//        updates.forEach((key, value) -> {
//            switch (key) {
//                case "status": trip.setStatus((String) value); break;
//                case "departure": trip.setDeparture((String) value); break;
//                // fields not included in updates stay unchanged
//            }
//        });
//
//        return tripRepository.save(trip);
//    }

}
