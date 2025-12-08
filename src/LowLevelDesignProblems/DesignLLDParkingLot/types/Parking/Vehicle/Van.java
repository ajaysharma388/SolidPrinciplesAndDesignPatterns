package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.VehicleType;

public class Van extends Vehicle {
    public Van(ParkingSpotType parkingSpotType) {
        super(VehicleType.VAN);
    }
}
