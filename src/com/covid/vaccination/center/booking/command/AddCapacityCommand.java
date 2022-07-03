package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.CenterCapacity;
import com.covid.vaccination.center.booking.service.AdminService;

public class AddCapacityCommand implements ICommand {

    AdminService adminService = new AdminService();

    @Override
    public <T> T create(String[] input) {
        return (T) new CenterCapacity(input[1], input[2], input[3]);
    }

    @Override
    public <T> void execute(T capacity) {
        adminService.addCapacityToVaccinationCenter((CenterCapacity) capacity);
    }
}
