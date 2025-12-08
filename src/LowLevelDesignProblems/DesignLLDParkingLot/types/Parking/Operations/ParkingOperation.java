package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle.Vehicle;

public interface ParkingOperation {
    public ParkingTicket park(Vehicle vehicle);
    public Vehicle unPark(ParkingTicket ticket);
}
