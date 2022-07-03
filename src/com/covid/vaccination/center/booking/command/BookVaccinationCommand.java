package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.BookVaccination;
import com.covid.vaccination.center.booking.service.UserService;

public class BookVaccinationCommand implements ICommand {

    UserService userService = new UserService();

    @Override
    public <T> T create(String[] input) {
        return (T) new BookVaccination(input[1], input[2], input[3]);
    }

    @Override
    public <T> void execute(T vaccine) {
        userService.bookVaccine((BookVaccination) vaccine);
    }
}
