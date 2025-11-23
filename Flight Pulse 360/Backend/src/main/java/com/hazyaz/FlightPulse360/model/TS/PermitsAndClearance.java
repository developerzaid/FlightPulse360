package com.hazyaz.FlightPulse360.model.TS;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Data
public class PermitsAndClearance {


    private String uxTripId; // Universal Trip ID for

    @Id
    @GeneratedValue(generator = "Id-Generator")
    @GenericGenerator(name = "Id-Generator", strategy = "com.hazyaz.FlightPulse360.util.UniqueIdGenerator")
    private String pac_serviceId;

    public String getPrefix() {
        return "TPSRV-PAC";
    }

    private String pac_serviceName;
    private String pac_diplomaticClearanceNumber;
    private String pac_nightFlightPermitNumber;
    private String pac_parkingPermitNumber;

    private String pac_pprAuthority;
    private String pac_pprReferenceNumber;

    private String pac_landingPermitNumber;

    private String pac_overflightCountries; // comma-separated ISO codes
    private String pac_overflightPermitNumber;

    private List<String> pac_documents;
    private String pac_additionalNotes;
    private String pac_serviceStatus; // REQUESTED, CONFIRMED, IN_PROGRESS, COMPLETED, CANCELLED
    private String pac_payment; // Processing, Servicing, Invoiced, Pa

}

