package com.covid.vaccination.center.booking.dto.request;

public class CancelVaccination {
    private final String centerId;
    private final String bookingId;
    private final String userId;

    public CancelVaccination(String centerId, String bookingId, String userId) {
        this.centerId = centerId;
        this.bookingId = bookingId;
        this.userId = userId;
    }

    public String getCenterId() {
        return centerId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }
}
