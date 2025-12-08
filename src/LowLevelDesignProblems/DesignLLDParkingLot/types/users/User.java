package LowLevelDesignProblems.DesignLLDParkingLot.types.users;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations.ParkingTicket;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle.Vehicle;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations.ParkingOperation;

public class User extends Account implements ParkingOperation {

    @Override
    boolean resetAccountPwd(String password) {
        return false;
    }

    @Override
    public ParkingTicket park(Vehicle vehicle) {
        return null;
    }

    @Override
    public Vehicle unPark(ParkingTicket ticket) {
        return null;
    }
}
