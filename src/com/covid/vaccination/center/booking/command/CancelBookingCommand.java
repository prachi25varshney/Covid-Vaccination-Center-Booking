package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.CancelVaccination;

public class CancelBookingCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new CancelVaccination();
    }

    @Override
    public void execute(String[] input) {

    }
}
