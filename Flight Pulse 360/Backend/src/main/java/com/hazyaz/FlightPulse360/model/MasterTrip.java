package com.hazyaz.FlightPulse360.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class MasterTrip {

        @Id
        @GeneratedValue(generator = "Id-Generator")
        @GenericGenerator(name = "Id-Generator", strategy = "com.hazyaz.FlightPulse360.util.UniqueIdGenerator")
        private String uxTripId;

        private String uxCompanyId;          // used for filtering for each company portal

        private String mt_tripNumber;       // human-readable trip ref

        // Trip profile
        private String mt_tripType;         // SINGLE_LEG, MULTI_LEG
        private String mt_purpose;          // BUSINESS, PERSONAL, EVAC, MEDICAL, etc.
        private String mt_status;           // DRAFT, PLANNED, CONFIRMED, IN_PROGRESS, COMPLETED, CANCELLED

        // Airports
        private String mt_fromAirport;
        private String mt_toAirport;

        // TIMES - UTC and Local
        private LocalDateTime mt_scheduledDepartureUtc;
        private LocalDateTime mt_scheduledDepartureLocal;

        private LocalDateTime mt_scheduledArrivalUtc;
        private LocalDateTime mt_scheduledArrivalLocal;

        private String mt_departureTimezone;
        private String mt_arrivalTimezone;

        // Multi-leg
//        private List<TripLeg> mt_legs;
//
//        // Linked objects
//        private ClientSummary mt_client;
//        private AircraftSummary mt_aircraft;
//        private List<PassengerSummary> mt_passengers;
//        private List<CrewSummary> mt_crew;

        // Operational details
        private String mt_additionalNotes;

        // Any extra documents
        private String mt_additionalDocuments;

        // Services
//        private TripServices mt_services;

        // Additional trip notes / compliance
        private String mt_dispatcherNotes;
        private String mt_safetyNotes;
        private String mt_regulatoryNotes;

        // Getters and setters here...
        public String getPrefix() {
            return "MSTR";
        }


}
