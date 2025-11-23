package com.hazyaz.FlightPulse360.service;

import com.hazyaz.FlightPulse360.model.MasterTrip;
import com.hazyaz.FlightPulse360.repository.MasterTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MasterTripService {

    @Autowired
    MasterTripRepository masterTripRepository;

    public MasterTrip getSingleMasterTrip(String tripId) {
        // Implementation here
        return masterTripRepository.findByUxTripId(tripId);
    }

    public List<MasterTrip> getAllMasterTrip(String companyId) {
        // Implementation here
        return masterTripRepository.findAllByUxCompanyId(companyId); // Add filtering by companyId as needed
    }

    public MasterTrip addMasterTrip(MasterTrip masterTrip) {
        // Implementation here
        return masterTripRepository.save(masterTrip);
    }

    public String deleteMasterTrip(String tripId) {
        // Implementation here
        masterTripRepository.deleteById(tripId);
        return "Master Trip Deleted";
    }
//
//    public Map<String, Object> updateMasterTrip(String tripId, Map<String, Object> masterUpdates) {
//
//
//    }
}
