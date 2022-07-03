package com.covid.vaccination.center.booking.exceptions;

public class VaccinationCenterAlreadyExists extends RuntimeException {
    public VaccinationCenterAlreadyExists(String message) {
        super(message);
    }
}
