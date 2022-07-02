package com.covid.vaccination.center.booking.command;

public enum Command {
    ADD_USER(new AddUserCommand()),
    ADD_VACCINATION_CENTER(new AddVaccinationCenterCommand()),
    ADD_CAPACITY(new AddCapacityCommand()),
    LIST_VACCINATION_CENTERS(new ListVaccinationCentersCommand()),
    BOOK_VACCINATION(new BookVaccinationCommand()),
    LIST_ALL_BOOKINGS(new ListAllBookingsCommand()),
    CANCEL_BOOKING(new CancelBookingCommand());

    private final ICommand command;

    Command(ICommand command) {
        this.command = command;
    }

    public ICommand getCommand() {
        return command;
    }
}
