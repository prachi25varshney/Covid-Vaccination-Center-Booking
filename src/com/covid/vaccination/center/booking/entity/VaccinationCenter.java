package com.covid.vaccination.center.booking.entity;

public class VaccinationCenter {

    String stateName;
    String districtName;
    String centerId;

    public VaccinationCenter(String stateName, String districtName, String centerId) {
        this.stateName = stateName;
        this.districtName = districtName;
        this.centerId = centerId;
    }
}
