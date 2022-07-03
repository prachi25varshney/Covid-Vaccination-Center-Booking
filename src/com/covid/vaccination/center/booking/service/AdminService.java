package com.covid.vaccination.center.booking.service;

import com.covid.vaccination.center.booking.dto.request.CenterCapacity;
import com.covid.vaccination.center.booking.dto.request.VaccinationCenter;
import com.covid.vaccination.center.booking.dto.response.Capacity;
import com.covid.vaccination.center.booking.dto.response.Center;
import com.covid.vaccination.center.booking.exceptions.VaccinationCenterAlreadyExists;
import com.covid.vaccination.center.booking.exceptions.VaccinationCenterNotExists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminService {

    Map<String, Center> vaccinationCenters = new HashMap<>();
    Map<String, List<Center>> vaccinationCenterListInDistrict = new HashMap<>();

    public void addVaccinationCenter(VaccinationCenter vaccinationCenter) {
        String centerId = vaccinationCenter.getCenterId();
        if (vaccinationCenters.containsKey(centerId))
            throw new VaccinationCenterAlreadyExists("Center Already Exists");

        Center newCenter = new Center(vaccinationCenter);
        vaccinationCenters.put(centerId, newCenter);
        addVaccinationCenterInDistrict(newCenter);
    }

    public void addCapacityToVaccinationCenter(CenterCapacity centerCapacity) {
        String centerId = centerCapacity.getCenterId();
        if (!vaccinationCenters.containsKey(centerId))
            throw new VaccinationCenterNotExists("Vaccination Center Does not Exists");
        String day = centerCapacity.getDay();
        int cap = Integer.parseInt(centerCapacity.getCapacity());
        Capacity capacity = new Capacity(day, cap);
        vaccinationCenters.get(centerId).getCapacityList().add(capacity);
    }

    private void addVaccinationCenterInDistrict(Center center) {
        String district = center.getDistrictName();
        if (vaccinationCenterListInDistrict.containsKey(district))
            vaccinationCenterListInDistrict.put(district, new ArrayList<>());
        vaccinationCenterListInDistrict.get(district).add(center);
    }
}
