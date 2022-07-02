package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.CenterCapacity;

public class AddCapacityCommand implements ICommand {
    @Override
    public <T> T create(String[] input) {
        return (T) new CenterCapacity(input[1],input[2],input[3]);
    }

    @Override
    public <T> void execute(T input) {

    }
}
