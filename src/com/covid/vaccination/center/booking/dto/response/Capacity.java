package com.covid.vaccination.center.booking.dto.response;

public class Capacity {

    private final String day;
    private final int capacity;

    public Capacity(String day, int capacity) {
        this.day = day;
        this.capacity = capacity;
    }


    public String getDay() {
        return day;
    }

    public int getCapacity() {
        return capacity;
    }
}
