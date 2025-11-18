package com.hazyaz.FlightPulse360.dto;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class UserRegistration {

//    ur is for USER

    private String ur_id;

    private String ur_firstName;
    private String ur_lastName;
    private String ur_email;
    private String ur_companyName;
    private String ur_password;
    private String ur_country;
    private String ur_phone;

    private int ur_noOfSeats;

    private int ur_activeSeats;

    public String getUr_id() {
        return ur_id;
    }

    public void setUr_id(String ur_id) {
        this.ur_id = ur_id;
    }

    public String getUr_firstName() {
        return ur_firstName;
    }

    public void setUr_firstName(String ur_firstName) {
        this.ur_firstName = ur_firstName;
    }

    public String getUr_lastName() {
        return ur_lastName;
    }

    public void setUr_lastName(String ur_lastName) {
        this.ur_lastName = ur_lastName;
    }

    public String getUr_email() {
        return ur_email;
    }

    public void setUr_email(String ur_email) {
        this.ur_email = ur_email;
    }

    public String getUr_companyName() {
        return ur_companyName;
    }

    public void setUr_companyName(String ur_companyName) {
        this.ur_companyName = ur_companyName;
    }

    public String getUr_password() {
        return ur_password;
    }

    public void setUr_password(String ur_password) {
        this.ur_password = ur_password;
    }

    public String getUr_country() {
        return ur_country;
    }

    public void setUr_country(String ur_country) {
        this.ur_country = ur_country;
    }

    public String getUr_phone() {
        return ur_phone;
    }

    public void setUr_phone(String ur_phone) {
        this.ur_phone = ur_phone;
    }

    public int getUr_noOfSeats() {
        return ur_noOfSeats;
    }

    public void setUr_noOfSeats(int ur_noOfSeats) {
        this.ur_noOfSeats = ur_noOfSeats;
    }

    public int getUr_activeSeats() {
        return ur_activeSeats;
    }

    public void setUr_activeSeats(int ur_activeSeats) {
        this.ur_activeSeats = ur_activeSeats;
    }

    public Instant getUr_purchaseDate() {
        return ur_purchaseDate;
    }

    public void setUr_purchaseDate(Instant ur_purchaseDate) {
        this.ur_purchaseDate = ur_purchaseDate;
    }

    public Instant getUr_renewalDate() {
        return ur_renewalDate;
    }

    public void setUr_renewalDate(Instant ur_renewalDate) {
        this.ur_renewalDate = ur_renewalDate;
    }

    public String getUr_status() {
        return ur_status;
    }

    public void setUr_status(String ur_status) {
        this.ur_status = ur_status;
    }

    private Instant ur_purchaseDate;
    private Instant ur_renewalDate;

    private String ur_status;


}
