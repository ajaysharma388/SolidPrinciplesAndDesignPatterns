package LowLevelDesignProblems.DesignLLDParkingLot.types.Parking.Operations;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.VehicleType;

import java.util.HashMap;

public class ParkingRate {
    HashMap<VehicleType, Double> perHourRate;
    HashMap<VehicleType, Double> StartRate;

    public ParkingRate() {
        perHourRate = new HashMap<VehicleType, Double>();
        StartRate = new HashMap<VehicleType, Double>();
    }

    public double getCharges(int time, VehicleType vehicleType)
    {
        return this.StartRate.get(vehicleType) + time*this.perHourRate.get(vehicleType);
    }

    public void updateParkingRate(VehicleType vehicleType, double basePrice, double perHourPrice)
    {
        this.StartRate.put(vehicleType, basePrice);
        this.perHourRate.put(vehicleType, perHourPrice);
    }



}
