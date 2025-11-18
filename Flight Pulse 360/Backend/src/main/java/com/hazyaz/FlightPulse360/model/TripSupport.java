package com.hazyaz.FlightPulse360.model;


// Trip Support is more towards
public class TripSupport {

    private String t_Id;
    private String t_flightNumber;
    private String t_status;
    private String t_fromAirport;
    private String t_toAirport;
    private String t_fromCity;
    private String t_toCity;
    private String t_terminal;
    private String t_gate;
    private String t_routeCode;
    private String t_distance;
    private String t_duration;
    private String t_startTime;
    private String t_endTime;
    private String t_boardingTime;
    private String t_landingTime;
    private String t_actualDepartureTime;
    private String t_actualArrivalTime;

    private String t_timeZone;

    private String t_planeModel;
    private String t_planeOperator;
    private String t_aircraftRegNo;

    private String t_aircraftDetails; // FK to AC table

    private String t_paxQty;
    private String t_bookedSeats;
    private String t_passengers;
    private String t_availableSeats;

    private String t_pilotId; // FK to PILOT table
    private String t_groundHandlingId; // FK to MAINTENANCE table
    private String t_fuelBy; // FK to FUEL table
    private String t_tailNo;
    private String t_sector;
    private String t_date;
    private String t_requestDate;
    private String t_crewDetails;
    private String t_approvals;
    private String t_multiCity;

    private String fl_createdAt;
    private String fl_createdBy;
    private String fl_lastModifiedAt;
    private String fl_lastModifiedBy;

}
