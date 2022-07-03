package com.covid.vaccination.center.booking.dto.request;

public class VaccinationCenterList {
    private final String districtName;

    public VaccinationCenterList(String districtName) {
        this.districtName = districtName;
    }

    public String getDistrictName() {
        return districtName;
    }
}
