package LowLevelDesignProblems.DesignLLDParkingLot.types.users;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Floors.ParkingFloor;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.ParkingSpot.ParkingSpot;

public class Admin extends Account {

    public boolean addParkingFloor(ParkingFloor floor) {
        return false;
    }

    public boolean removeParkingFloor(ParkingFloor floor) {
        return false;
    }

    public boolean addParkingAttendant(Account attendant) {
        return false;
    }

    public boolean removeParkingAttendant(Account attendant) {
        return false;
    }

    public boolean addParkingSpot(int floor_id, ParkingSpot spot) {
        return false;
    }

    public boolean modifyParkingSpot(int floor_id, ParkingSpot spot) {
        return false;
    }

    public boolean removeParkingSpot(int floor_id, int spot_id) {
        return false;
    }

    @Override
    boolean resetAccountPwd(String password) {
        return false;
    }
}
