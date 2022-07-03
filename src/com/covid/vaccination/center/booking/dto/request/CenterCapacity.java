package com.covid.vaccination.center.booking.dto.request;

public class CenterCapacity {
    private final String centerId;
    private final String day;
    private final String capacity;

    public CenterCapacity(String centerId, String day, String capacity) {
        this.centerId = centerId;
        this.day = day;
        this.capacity = capacity;
    }

    public String getCenterId() {
        return centerId;
    }

    public String getDay() {
        return day;
    }

    public String getCapacity() {
        return capacity;
    }
}
