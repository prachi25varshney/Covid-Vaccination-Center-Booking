package com.covid.vaccination.center.booking.entity;

public class User {
    private final String userId;
    private final String name;
    private final String gender;
    private final int age;
    private final String current_state;
    private final String current_district;

    public User(String userId, String name, String gender, int age, String current_state, String current_district) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.current_state = current_state;
        this.current_district = current_district;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getCurrent_state() {
        return current_state;
    }

    public String getCurrent_district() {
        return current_district;
    }
}
