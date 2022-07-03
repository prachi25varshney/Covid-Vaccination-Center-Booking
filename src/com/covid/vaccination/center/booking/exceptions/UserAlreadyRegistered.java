package com.covid.vaccination.center.booking.exceptions;

public class UserAlreadyRegistered extends RuntimeException{
    public UserAlreadyRegistered(String message){
        super(message);
    }
}
