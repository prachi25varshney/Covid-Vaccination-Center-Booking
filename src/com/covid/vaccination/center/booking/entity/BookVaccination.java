package com.covid.vaccination.center.booking.entity;

public class BookVaccination {
    String centerId;
    String day;
    String userId;

    public BookVaccination(String centerId, String day, String userId) {
        this.centerId = centerId;
        this.day = day;
        this.userId = userId;
    }
}
