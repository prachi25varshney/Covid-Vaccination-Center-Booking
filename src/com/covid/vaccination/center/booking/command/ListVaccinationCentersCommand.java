package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.VaccinationCenterList;
import com.covid.vaccination.center.booking.service.UserService;

public class ListVaccinationCentersCommand implements ICommand {

    UserService userService = new UserService();

    @Override
    public <T> T create(String[] input) {
        return (T) new VaccinationCenterList(input[1]);
    }

    @Override
    public <T> void execute(T input) {
        userService.listVaccinationCenters((VaccinationCenterList) input);
    }
}
