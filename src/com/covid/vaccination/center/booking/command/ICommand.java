package com.covid.vaccination.center.booking.command;

public interface ICommand {
    <T> T create(String[] input);
    void execute(String[] input);
}
