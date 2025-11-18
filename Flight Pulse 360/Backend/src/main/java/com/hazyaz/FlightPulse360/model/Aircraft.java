package com.hazyaz.FlightPulse360.model;


public class Aircraft {

    private Long acId;
    private String ac_TailNo;
    private String ac_Type;
    private String ac_Manufacturer;
    private String ac_Model;
    private String ac_YearManufactured;
    private String ac_PassengerCapacity;
    private String ac_MaxRange;
    private String ac_CruiseSpeed;
    private String ac_FuelCapcity;
    private String ac_WingSpan;


//    Operation and Regisration
    private String ac_HomeBase;
    private String ac_RegistrationDate;
    private String ac_InsuranceDetails;
    private String ac_Notes;

    //    figure out a way to store all the list of documents
    private String ac_documents;

//    Main link with the user
    private String uxUniversalLicense;

}
