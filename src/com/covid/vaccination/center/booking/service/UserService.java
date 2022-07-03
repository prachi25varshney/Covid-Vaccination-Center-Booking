package com.covid.vaccination.center.booking.service;

import com.covid.vaccination.center.booking.dto.request.User;
import com.covid.vaccination.center.booking.dto.request.VaccinationCenterList;
import com.covid.vaccination.center.booking.dto.response.Center;
import com.covid.vaccination.center.booking.exceptions.UserAlreadyRegistered;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        String userId = user.getUserId();
        if (users.containsKey(userId))
            throw new UserAlreadyRegistered("User Already Exists");
        users.put(userId, user);
    }

    public void listVaccinationCenters(VaccinationCenterList vaccinationCenterList) {
        String district = vaccinationCenterList.getDistrictName();
        List<Center> centerList = AdminService.vaccinationCenterListInDistrict.get(district);
        centerList.forEach(x -> x.getCapacityList().forEach(y -> System.out.println(x.getCenterId() + " " + y.getDay()
                + " " + y.getCapacity())));
    }
}
