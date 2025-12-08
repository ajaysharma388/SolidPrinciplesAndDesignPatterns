package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.VehicleType;

public class Vehicle {
    private String number_plate;
    private final VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
}
