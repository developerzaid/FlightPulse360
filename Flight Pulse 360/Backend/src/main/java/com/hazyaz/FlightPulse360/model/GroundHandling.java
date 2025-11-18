package com.hazyaz.FlightPulse360.model;

import java.util.List;
import java.util.Map;
// to be added in the database class   @Entity
//    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
//    public class GroundHandlingService extends Service {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//        // Other fields like ghs_requestDate, ghs_tailNumber, etc.
//
//        @Type(type = "jsonb")
//        @Column(columnDefinition = "jsonb")
//        private Map<String, Boolean> groundServices;

//}
public class GroundHandling {



    private String ghs_Id;
//    So when its single only ghs_id but if multiple legs, List of multiple ids stored in the list and treated as one.
    private List<String> ghs_multiLegId;
    private String ghs_flightDate;
    private String ghs_departureFrom;
    private String ghs_departureTime;
    private String ghs_arrivalTo;
    private String ghs_arrivalTime;
    private String ghs_serviceStation;

    private String ghs_additionalServices;

    private Vendor ghs_vendor; // Airport in this case, or some private company managing it
    private List<String> ghs_crew;  // list of id of the crew
    private List<String> ghs_client; // FK TO CLIENTS, list of the id the client
    private String ghs_aircraft; // FK to aircraft, id of the aircraft

    // Ground handler details and approvals
    private String ghs_groundHandlerName;
    private String ghs_groundHandlerContact;
    private String ghs_groundHandlerEmail;

    /*
     * groundServices Map contains the following key-value pairs (Boolean):
     *
     * "aircraftMarshalling"    - Aircraft safely marshalled into parking spot
     * "gpu"                    - Ground Power Unit available
     * "airStart"               - Air start available if needed
     * "parkingConfirmed"       - Parking slot confirmed
     * "landingFee"             - amount
     * "crewTransport"          - Crew transport arranged
     * "passengerTransport"     - Passenger transport arranged
     * "wheelchairService"      - Wheelchair service available
     * "meetAndGreet"           - Meet & greet arranged for passengers
     * "vipLoungeAccess"        - VIP lounge access confirmed
     * "customsClearance"       - Customs cleared (for international flights)
     * "securityScreening"      - Security screening completed
     * "flightPlanFiled"        - Flight plan submitted and approved
     * "fuelRequested"          - Fuel request approved
     * "cateringService"        - Catering requested
     * "cateringConfirmed"      - Catering confirmed by vendor
     * "lavatoryService"        - Lavatory service completed
     * "waterService"           - Water service completed
     * "deicing"                - Deicing performed if required
     * "antiIcing"              - Anti-icing performed if required
     * "cabinCleaning"          - Cabin cleaned
     * "exteriorCleaning"       - Exterior cleaned
     *
     * These are the important operational approvals and checks required
     * for a private aviation flight's ground handling.
     */
    private Map<String, Boolean> groundServices;


    //   Amazon S3 would be used for the storage of the files
    private List<String> ghs_documents;
    private String vn_additionalNotes;

    private String fl_createdAt;
    private String fl_createdBy;
    private String fl_lastModifiedAt;
    private String fl_lastModifiedBy;

    // These would be in all the services
    private String fl_requestMode;    // whatsapp, email, call
    private String fl_requestDate;

    private String fl_status; // processing, ongoing  {This is for ops team}
    private String fl_payment; // Processing, Servicing, Invoiced, Payment received {This is for sales team}

}
