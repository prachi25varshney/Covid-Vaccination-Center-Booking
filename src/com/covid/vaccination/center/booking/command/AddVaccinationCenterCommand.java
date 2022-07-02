package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.VaccinationCenter;

public class AddVaccinationCenterCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new VaccinationCenter();
    }

    @Override
    public void execute(String[] input) {

    }
}
