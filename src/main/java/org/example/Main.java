package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("*******************************************");
            System.out.println("*                                         *");
            System.out.println("*   Welcome to Aptech Hotel  *");
            System.out.println("*                                         *");
            System.out.println("*******************************************");
            System.out.println();
            System.out.println("   1. ➤ Book Room");
            System.out.println("   2. ➤ See Available Rooms");
            System.out.println("   3. ➤ Cancel your booking");
            System.out.println("   4. ➤ Exit");
            System.out.println();
            System.out.println("*******************************************");
            System.out.println("*   Please select an option   *");
            System.out.println("*******************************************");

            int choice = scan.nextInt(); scan.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scan.nextInt();
                    scan.nextLine();  // Consume newline
                    System.out.print("Enter your name: ");
                    String customerName = scan.nextLine();
                    hotel.bookRooms(customerName, roomNumber);
                    break;

                case 2:
                    hotel.showAvailable();
                    break;

                case 3:
                    System.out.print("Enter room number to cancel: ");
                    int roomNumberToCancel = scan.nextInt();
                    hotel.removeBook(roomNumberToCancel);
                    break;

                case 4:
                    System.out.println("exiting now........");
                    scan.close();
                    return;


                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}