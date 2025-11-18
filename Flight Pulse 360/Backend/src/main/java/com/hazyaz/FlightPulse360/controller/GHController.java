package com.hazyaz.FlightPulse360.controller;

import com.hazyaz.FlightPulse360.model.GroundHandling;
import com.hazyaz.FlightPulse360.model.Vendor;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GHController {

    // CONTROLLERS FOR seeing all the ground handling requests
    @Operation(tags = "SV: Ground Handling" ,description = "shows all the ground handling service in the list")
    @GetMapping("/all-ground-handling")
    public String all_groundHandling(){
        return "This is a login screen";
    }

    // CONTROLLERS FOR adding new ground handling requests
    @Operation(tags = "SV: Ground Handling" ,description = "Helps in adding new ground handling service ")
    @PostMapping("/add-ground-handling")
    public String add_groundHandling(@RequestBody GroundHandling groundHandling){
        return "This is a registration screen";
    }

    // CONTROLLERS FOR UPDATING THE FIELD IN THE FUEL
    @Operation(tags = "SV: Ground Handling" ,description = "Helps in updating new fuel request")
    @PatchMapping("/update-ground-handling/{id}")
    public String update_ground_handling(@RequestParam String id, @RequestBody Map<String, Object> updates){
        return "This is a registration screen";
    }


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
