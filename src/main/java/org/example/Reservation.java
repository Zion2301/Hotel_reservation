package org.example;

public class Reservation implements Runnable{
    private final Hotel hotel;
    private final String guestName;
    private final int roomNumber;

    public Reservation(Hotel hotel, String guestName, int roomNumber) {
        this.hotel = hotel;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    @Override
    public void run() {
        hotel.bookRooms(guestName, roomNumber);
    }
}
