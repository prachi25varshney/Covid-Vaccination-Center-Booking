package com.covid.vaccination.center.booking.service;

import com.covid.vaccination.center.booking.dto.request.User;
import com.covid.vaccination.center.booking.exceptions.UserAlreadyRegistered;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        String userId = user.getUserId();
        if (users.containsKey(userId))
            throw new UserAlreadyRegistered("User Already Exists");
        users.put(userId, user);
    }
}
