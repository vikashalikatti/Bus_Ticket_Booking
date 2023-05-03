package busbooking;

public class Booking implements Ticket {
    Passenger passenger;
    Bus bus;

    public Booking(Passenger passenger, Bus bus) {
        this.passenger = passenger;
        this.bus = bus;
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking done..");
        System.out.println("Passenger Name: " + passenger.name);
        System.out.println("Passenger Age: " + passenger.age);
        System.out.println("Date of Booking: " + passenger.dateOfBooking);
        System.out.println("Bus Number: " + bus.busNumber);
        System.out.println("Source: " + bus.source);
        System.out.println("Destination: " + bus.destination);
        System.out.println("Price: ₹" + bus.price);
    }
}


