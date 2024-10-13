package org.example;

public class Room {
   private int number;
   private String customer;
   private boolean booked;

    public Room(int number) {
        this.number = number;
        this.booked = false;
    }

    public int getNumber() {
        return number;
    }



    public String getCustomer() {
        return customer;
    }



    public boolean isBooked() {
        return booked;
    }


    public synchronized void bookRoom(String customer){
         if (!booked){
             this.customer = customer;
             this.booked = true;
             System.out.println("Booking successful");
         } else {
             System.out.println("Room is booked already");
         }
    }

    public void cancel(){
        if (booked){
            System.out.println("Booking has been cancelled");
            this.customer = null;
            this.booked = false;
        } else {
            System.out.println("This room isnt booked yet");
        }
    }

    @Override
    public String toString() {
        return "Room " + number + " - " + (booked ? "Booked by " + customer : "Available");
    }
}
