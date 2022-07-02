package com.covid.vaccination.center.booking.entity;

public class CancelVaccination {
    String centerId;
    String bookingId;
    String userId;

    public CancelVaccination(String centerId, String bookingId, String userId) {
        this.centerId = centerId;
        this.bookingId = bookingId;
        this.userId = userId;
    }
}
