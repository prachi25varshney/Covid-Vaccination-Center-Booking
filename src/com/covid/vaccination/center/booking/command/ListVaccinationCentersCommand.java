package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.VaccinationCenterList;

public class ListVaccinationCentersCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new VaccinationCenterList();
    }

    @Override
    public <T> void execute(T input) {

    }
}
