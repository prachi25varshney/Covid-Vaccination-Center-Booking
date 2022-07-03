package com.covid.vaccination.center.booking.dto.response;

public class Capacity {

    private final String day;
    private int capacity;

    public Capacity(String day, int capacity) {
        this.day = day;
        this.capacity = capacity;
    }


    public int getDay() {
        return Integer.parseInt(day);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
