package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.VaccinationCenter;
import com.covid.vaccination.center.booking.service.AdminService;

public class AddVaccinationCenterCommand implements ICommand {

    AdminService adminService = new AdminService();

    @Override
    public <T> T create(String[] input) {
        return (T) new VaccinationCenter(input[1], input[2], input[3]);
    }

    @Override
    public <T> void execute(T center) {
        adminService.addVaccinationCenter((VaccinationCenter) center);
    }
}
