package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.VaccinationCenterList;

public class ListVaccinationCentersCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new VaccinationCenterList(input[1]);
    }

    @Override
    public <T> void execute(T input) {

    }
}
