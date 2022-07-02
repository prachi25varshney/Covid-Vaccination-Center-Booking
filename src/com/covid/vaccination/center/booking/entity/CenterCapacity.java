package com.covid.vaccination.center.booking.entity;

public class CenterCapacity {
    String centerId;
    String day;
    String capacity;

    public CenterCapacity(String centerId, String day, String capacity) {
        this.centerId = centerId;
        this.day = day;
        this.capacity = capacity;
    }
}
