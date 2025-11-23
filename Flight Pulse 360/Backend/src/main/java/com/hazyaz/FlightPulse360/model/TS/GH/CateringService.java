package com.hazyaz.FlightPulse360.model.TS.GH;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Data
public class CateringService {

    private String uxTripId; // Universal Trip ID for

    @Id
    @GeneratedValue(generator = "Id-Generator")
    @GenericGenerator(name = "Id-Generator", strategy = "com.hazyaz.FlightPulse360.util.UniqueIdGenerator")
    private String cs_serviceId;

    public String getPrefix() {
        return "TPSRV-CS";
    }

    private String cs_serviceName;

    // Catering for Private Jets
    private String cs_cateringCompany;
    private String cs_cateringContact;
    private String cs_cateringContactPhone;
    private Integer cs_numberOfMeals;
    private String cs_mealTypes; // breakfast, lunch, dinner, snacks
    private String cs_specialDietaryRequirements; // vegetarian, vegan, kosher, halal, allergies
    private LocalDateTime cs_cateringDeliveryTime;


    private List<String> cs_documents;
    private String cs_additionalNotes;
    private String cs_serviceStatus; // REQUESTED, CONFIRMED, IN_PROGRESS, COMPLETED, CANCELLED
    private String cs_payment; // Processing, Servicing, Invoiced, Payment received {This is for sales team}

}
