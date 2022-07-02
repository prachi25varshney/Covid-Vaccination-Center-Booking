package com.covid.vaccination.center.booking.entity;

public class User {
    String userId;
    String name;
    String gender;
    int age;
    String current_state;
    String current_district;

    public User(String userId, String name, String gender, int age, String current_state, String current_district) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.current_state = current_state;
        this.current_district = current_district;
    }
}
