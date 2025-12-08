package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck(ParkingSpotType parkingSpotType) {
        super(VehicleType.TRUCK);
    }
}