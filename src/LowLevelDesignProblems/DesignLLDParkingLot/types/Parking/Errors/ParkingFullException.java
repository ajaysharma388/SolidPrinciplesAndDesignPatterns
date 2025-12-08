package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Errors;

public class ParkingFullException extends Exception {

    // Recommended: Add a constructor that accepts a message
    public ParkingFullException(String message) {
        super(message);
    }

    // Optional: Add a constructor for chained exceptions
    public ParkingFullException(String message, Throwable cause) {
        super(message, cause);
    }
}