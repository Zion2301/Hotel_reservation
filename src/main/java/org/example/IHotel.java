package org.example;

public interface IHotel {
    public void bookRooms(String guestName, int roomNumber);
    public void showAvailable();
    public void removeBook(int roomNumber);
}
