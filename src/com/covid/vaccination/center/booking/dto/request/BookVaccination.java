package com.covid.vaccination.center.booking.dto.request;

public class BookVaccination {
    private final String centerId;
    private final String day;
    private final String userId;

    public BookVaccination(String centerId, String day, String userId) {
        this.centerId = centerId;
        this.day = day;
        this.userId = userId;
    }

    public String getCenterId() {
        return centerId;
    }

    public int getDay() {
        return Integer.parseInt(day);
    }

    public String getUserId() {
        return userId;
    }
}
