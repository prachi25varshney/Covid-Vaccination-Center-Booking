package com.covid.vaccination.center.booking.dto.request;

public class BookingList {
    private final String centerId;
    private final String day;

    public BookingList(String centerId, String day) {
        this.centerId = centerId;
        this.day = day;
    }

    public String getCenterId() {
        return centerId;
    }

    public String getDay() {
        return day;
    }
}
