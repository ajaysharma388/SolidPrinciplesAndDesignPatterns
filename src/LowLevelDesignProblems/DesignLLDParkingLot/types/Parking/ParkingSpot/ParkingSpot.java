package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.ParkingSpot;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle.Vehicle;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;

public class ParkingSpot {
    private String id;
    private boolean isFree;
    private final ParkingSpotType parkingSpotType;

    public boolean isFree() {
        return isFree;
    }

    public ParkingSpot(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.isFree = false;
    }

    public void freeParkingSpot()
    {
        this.isFree = true;
    }

    public String getNumber() {
        return id;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}
