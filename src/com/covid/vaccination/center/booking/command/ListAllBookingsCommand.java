package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.BookingList;

public class ListAllBookingsCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new BookingList(input[1],input[2]);
    }

    @Override
    public <T> void execute(T input) {

    }
}
