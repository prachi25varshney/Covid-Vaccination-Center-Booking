package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.User;

public class AddUserCommand implements ICommand {


    @Override
    public <T> T create(String[] input) {
        return (T) new User(input[1],input[2],input[3],Integer.parseInt(input[4]),input[5],input[6]);
    }

    @Override
    public <T> void execute(T input) {

    }
}
