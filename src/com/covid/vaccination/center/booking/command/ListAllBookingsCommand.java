package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.BookingList;

public class ListAllBookingsCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new BookingList();
    }

    @Override
    public <T> void execute(T input) {

    }
}
