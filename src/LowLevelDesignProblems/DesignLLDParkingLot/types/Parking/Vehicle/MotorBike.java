package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.VehicleType;

public class MotorBike extends Vehicle {
    public MotorBike(ParkingSpotType parkingSpotType) {
        super(VehicleType.MOTORBIKE);
    }
}