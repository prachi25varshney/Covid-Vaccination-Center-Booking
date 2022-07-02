package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.entity.User;

public class AddUserCommand implements ICommand {


    @Override
    public <T> T create(String[] input) {
        return (T) new User();
    }

    @Override
    public <T> void execute(T input) {

    }
}
