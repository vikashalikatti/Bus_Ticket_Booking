package busbooking;

public interface Bookable {
    boolean bookTicket(String source, String destination, String name, int age, String email) throws Exception;
}