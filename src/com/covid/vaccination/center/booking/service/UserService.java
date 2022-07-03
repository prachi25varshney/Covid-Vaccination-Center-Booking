package com.covid.vaccination.center.booking.service;

import com.covid.vaccination.center.booking.dto.request.BookVaccination;
import com.covid.vaccination.center.booking.dto.request.User;
import com.covid.vaccination.center.booking.dto.request.VaccinationCenterList;
import com.covid.vaccination.center.booking.dto.response.Capacity;
import com.covid.vaccination.center.booking.dto.response.Center;
import com.covid.vaccination.center.booking.exceptions.CapacityIsFullException;
import com.covid.vaccination.center.booking.exceptions.UserAlreadyRegistered;
import kotlin.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {

    Map<String, User> users = new HashMap<>();
    Map<String, Pair<User,Center>> userBooking = new HashMap<>();
    static int bookingId=1;
    // Map<Pair<String,Integer>,> vaccinationBooking = new HashMap<>();

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


    public void bookVaccine(BookVaccination vaccine) {
        String centerId = vaccine.getCenterId();
        int day = vaccine.getDay();
        Center center = AdminService.vaccinationCenters.get(centerId);
        List<Capacity> capacityList= center.getCapacityList();
        for(Capacity capacity : capacityList){
            isCapacityAvailable(capacity, day);
            capacity.setCapacity(capacity.getCapacity()-1);
        }
        String userId = vaccine.getUserId();
        User user = users.get(userId);
        String bookingId = generateBookingId();
        userBooking.put(bookingId, new Pair<>(user, center));
    }

    private String generateBookingId() {
        return "BK" + bookingId++;
    }

    private void isCapacityAvailable(Capacity capacity, int day) {
        if(capacity.getDay()==day && !(capacity.getCapacity() >0))
            throw new CapacityIsFullException("The Capacity for the day Is Fulled");
    }
}
