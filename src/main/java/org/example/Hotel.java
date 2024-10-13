package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements IHotel{
    private final List<Room> rooms = new ArrayList<>();

    public Hotel () {
        for (int i = 1; i <= 15; i++) {
            rooms.add(new Room(i));
        }
    }

    @Override
    public void bookRooms(String guestName, int roomNumber) {
          Room room = getRoomByNumber(roomNumber);
          if (room != null){
              room.bookRoom(guestName);
          } else {
              System.out.println("Room doesnt exist");
          }
    }

    @Override
    public void showAvailable() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isBooked()) {
                System.out.println(room);
            }
        }
    }

    @Override
    public void removeBook(int roomNumber) {
        Room room = getRoomByNumber(roomNumber);
        if (room != null) {
            room.cancel();
        } else {
            System.out.println("Room " + roomNumber + " does not exist.");
        }
    }

    private Room getRoomByNumber(int number) {
        for (Room room : rooms) {
            if (room.getNumber() == number) {
                return room;
            }
        }
        return null;
    }
}
