package busbooking;

public class NoBusAvailableException extends Exception {
    public NoBusAvailableException(String message) {
        super(message);
    }
}