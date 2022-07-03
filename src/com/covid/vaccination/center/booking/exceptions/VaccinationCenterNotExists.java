package com.covid.vaccination.center.booking.exceptions;

public class VaccinationCenterNotExists extends RuntimeException {
    public VaccinationCenterNotExists(String message) {
        super(message);
    }
}
