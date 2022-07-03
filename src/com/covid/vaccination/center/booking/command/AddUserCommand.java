package com.covid.vaccination.center.booking.command;

import com.covid.vaccination.center.booking.dto.request.User;
import com.covid.vaccination.center.booking.service.UserService;

public class AddUserCommand implements ICommand {


    UserService userService = new UserService();

    @Override
    public <T> T create(String[] input) {
        return (T) new User(input[1], input[2], input[3], Integer.parseInt(input[4]), input[5], input[6]);
    }

    @Override
    public <T> void execute(T user) {
        userService.addUser((User) user);
    }
}
