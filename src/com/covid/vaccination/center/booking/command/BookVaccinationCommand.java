package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.BookVaccination;

public class BookVaccinationCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new BookVaccination();
    }

    @Override
    public <T> void execute(T input) {

    }
}
