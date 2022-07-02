package com.covid.vaccination.center.booking.entity;

public class VaccinationCenter {

    private final String stateName;
    private final String districtName;
    private final String centerId;

    public VaccinationCenter(String stateName, String districtName, String centerId) {
        this.stateName = stateName;
        this.districtName = districtName;
        this.centerId = centerId;
    }

    public String getStateName() {
        return stateName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getCenterId() {
        return centerId;
    }
}
