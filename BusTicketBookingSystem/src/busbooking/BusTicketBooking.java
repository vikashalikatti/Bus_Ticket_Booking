package busbooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter source: ");
            String source = sc.nextLine();
            System.out.println("Enter destination: ");
            String destination = sc.nextLine();

            Bus[] buses = {
                    new Bus(source, destination, 1, 500),
                    new Bus(source, destination, 2, 600),
                    new Bus(source, destination, 3, 700),
                    new Bus(source, destination, 4, 800)
            };

            System.out.println("Available buses and prices:");
            for (Bus bus : buses) {
                System.out.println("Bus " + bus.busNumber + ": ₹" + bus.price);
            }

            System.out.println("Enter the bus number to book: ");
            int busNumber = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            Bus selectedBus = null;
            for (Bus bus : buses) {
                if (bus.busNumber == busNumber) {
                    selectedBus = bus;
                    break;
                }
            }

            if (selectedBus != null) {
                System.out.println("Enter passenger name: ");
                String name = sc.nextLine();
                System.out.println("Enter passenger age: ");
                int age = sc.nextInt();
                sc.nextLine(); // Consume newline left-over

                System.out.println("Enter date of booking (YYYY-MM-DD): ");
                String dateOfBooking = sc.nextLine();

                Passenger passenger = new Passenger(name, age, dateOfBooking);
                Booking booking = new Booking(passenger, selectedBus);
                booking.bookTicket();
            } else {
                System.out.println("Invalid bus number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type.");
        } finally {
            sc.close();
        }
    }
}
