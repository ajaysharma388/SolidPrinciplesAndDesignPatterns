package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Floors;

import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.ParkingSpot.*;
import LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Vehicle.Vehicle;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.ParkingSpotType;

import java.util.HashMap;

public class ParkingFloor {
    private String name;
    private HashMap<String, ParkingSpot> handicappedSpots;
    private HashMap<String, ParkingSpot> compactSpots;
    private HashMap<String, ParkingSpot> largeSpots;
    private HashMap<String, ParkingSpot> motorbikeSpots;
    private HashMap<String, ParkingSpot> electricSpots;


    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot spot) {
        switch (spot.getParkingSpotType()) {
            case ParkingSpotType.COMPACT:
                compactSpots.put(spot.getNumber(), spot);
                break;
            case ParkingSpotType.LARGE:
                largeSpots.put(spot.getNumber(), spot);
                break;
            case ParkingSpotType.MOTORBIKE:
                motorbikeSpots.put(spot.getNumber(), spot);
                break;
            case ParkingSpotType.ELECTRIC:
                electricSpots.put(spot.getNumber(), spot);
                break;
            case ParkingSpotType.HANDICAPPED:
                handicappedSpots.put(spot.getNumber(), spot);
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
        spot.assignVehicle(vehicle);
        switch (spot.getParkingSpotType()) {
            case ParkingSpotType.HANDICAPPED:
                updateDisplayBoardForHandicapped(spot);
                break;
            case ParkingSpotType.COMPACT:
                updateDisplayBoardForCompact(spot);
                break;
            case ParkingSpotType.LARGE:
                updateDisplayBoardForLarge(spot);
                break;
            case ParkingSpotType.MOTORBIKE:
                updateDisplayBoardForMotorbike(spot);
                break;
            case ParkingSpotType.ELECTRIC:
                updateDisplayBoardForElectric(spot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    public void freeSpot(ParkingSpot spot) {
        spot.freeParkingSpot();
        switch (spot.getParkingSpotType()) {
            case ParkingSpotType.HANDICAPPED:
                freeHandicappedSpotCount++;
                break;
            case ParkingSpotType.COMPACT:
                freeCompactSpotCount++;
                break;
            case ParkingSpotType.LARGE:
                freeLargeSpotCount++;
                break;
            case ParkingSpotType.MOTORBIKE:
                freeMotorbikeSpotCount++;
                break;
            case ParkingSpotType.ELECTRIC:
                freeElectricSpotCount++;
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }
}
