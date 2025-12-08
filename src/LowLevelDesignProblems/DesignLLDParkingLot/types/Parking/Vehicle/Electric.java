package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.VehicleType;

public class Electric extends Vehicle {
    public Electric(ParkingSpotType parkingSpotType) {
        super(VehicleType.CAR);
    }
}
