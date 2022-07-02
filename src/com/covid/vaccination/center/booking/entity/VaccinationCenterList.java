package com.covid.vaccination.center.booking.entity;

public class VaccinationCenterList {
    private final String districtName;

    public VaccinationCenterList(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictName() {
        return districtName;
    }
}
