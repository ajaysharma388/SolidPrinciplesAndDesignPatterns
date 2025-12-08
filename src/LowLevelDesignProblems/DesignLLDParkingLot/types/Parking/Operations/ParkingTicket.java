package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.ParkingSpot.ParkingSpot;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle.Vehicle;

public class ParkingTicket {
    private Vehicle vehicle;
    private ParkingSpot spot;
    private String ticket_id;

    public ParkingTicket(String id, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.spot = parkingSpot;
        this.ticket_id = id;
    }

    public void saveInDB()
    {
        System.out.println("Saving Parking Ticket");
    }

    public String getTicket_id() {
        return ticket_id;
    }
}
