package com.covid.vaccination.center.booking;

import com.covid.vaccination.center.booking.command.Command;
import com.covid.vaccination.center.booking.command.ICommand;

import java.util.Scanner;

public class CovidVaccinationCenterBooking {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        ICommand command = Command.valueOf(inputArray[0]).getCommand();

        command.execute(inputArray);
    }
}
