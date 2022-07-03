package com.covid.vaccination.center.booking.exceptions;

public class CapacityIsFullException extends RuntimeException {
    public CapacityIsFullException(String message) {
        super(message);
    }
}
