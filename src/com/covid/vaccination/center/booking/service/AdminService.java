package com.covid.vaccination.center.booking.service;

import com.covid.vaccination.center.booking.entity.VaccinationCenter;
import com.covid.vaccination.center.booking.exceptions.VaccinationCenterAlreadyExists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminService {

    Map<String, VaccinationCenter> vaccinationCenters = new HashMap<>();
    Map<String, List<VaccinationCenter>> vaccinationCenterListInDistrict = new HashMap<>();

    public void addVaccinationCenter(VaccinationCenter vaccinationCenter) {
        String centerId = vaccinationCenter.getCenterId();
        if (vaccinationCenters.containsKey(centerId))
            throw new VaccinationCenterAlreadyExists("Center Already Exists");
        vaccinationCenters.put(centerId, vaccinationCenter);
        addVaccinationCenterInDistrict(vaccinationCenter);
    }

    private void addVaccinationCenterInDistrict(VaccinationCenter vaccinationCenter) {
        String district = vaccinationCenter.getDistrictName();
        if (vaccinationCenterListInDistrict.containsKey(district))
            vaccinationCenterListInDistrict.put(district, new ArrayList<>());
        vaccinationCenterListInDistrict.get(district).add(vaccinationCenter);
    }
}
