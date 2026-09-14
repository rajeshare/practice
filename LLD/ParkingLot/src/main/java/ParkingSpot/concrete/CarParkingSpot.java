package ParkingSpot.concrete;

import ParkingSpot.ParkingSpot;
import VehicleFactoryPattern.Vehicle;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

     @Override
    public boolean canParkVehicle(Vehicle vehicle) {
         return "Car".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
