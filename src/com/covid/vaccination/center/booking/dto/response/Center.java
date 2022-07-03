package com.covid.vaccination.center.booking.dto.response;

import com.covid.vaccination.center.booking.dto.request.VaccinationCenter;

import java.util.ArrayList;
import java.util.List;

public class Center {

    private final String centerId;
    private final String stateName;
    private final String districtName;
    private final List<Capacity> capacityList;


    public Center(VaccinationCenter vaccinationCenter) {
        this.stateName = vaccinationCenter.getStateName();
        this.districtName = vaccinationCenter.getDistrictName();
        this.centerId = vaccinationCenter.getCenterId();
        this.capacityList = new ArrayList<>();
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

    public List<Capacity> getCapacityList() {
        return capacityList;
    }
}
