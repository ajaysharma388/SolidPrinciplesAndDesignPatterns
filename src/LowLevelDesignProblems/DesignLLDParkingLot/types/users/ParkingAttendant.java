package LowLevelDesignProblems.DesignLLDParkingLot.types.users;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations.ParkingTicket;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle.Vehicle;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations.ParkingOperation;

public class ParkingAttendant implements ParkingOperation {
    private double commission;
    public ParkingAttendant() {
        commission = 0.0;
    }

    public void collectCommission(double commission) {
        this.commission += commission;
    }

    public double settleCommissionIntoAccount() {
        double settledCommission = this.commission;
        this.commission = 0.0;
        return settledCommission;
    }

    public boolean collectPayment(ParkingTicket ticket) {
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
