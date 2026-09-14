package ParkingSpot;

import VehicleFactoryPattern.Vehicle;

public abstract  class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public abstract boolean canParkVehicle(Vehicle vehicle);
    public void parkVehicle(Vehicle vehicle) {
        // Check if the spot is already occupied
        if (isOccupied) {
            throw new IllegalStateException("Spot is already occupied.");
        }
        // Check if the vehicle can be parked in this spot
        if (!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException(
                    "This spot is not suitable for" + vehicle.getVehicleType());
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        // Check if the spot is already vacant
        if (!isOccupied) {
            throw new IllegalStateException("Spot is already vacant.");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }

    public ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public ParkingSpot(int spotNumber, boolean isOccupied, Vehicle vehicle, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = isOccupied;
        this.vehicle = vehicle;
        this.spotType = spotType;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotType() {
        return spotType;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setSpotType(String spotType) {
        this.spotType = spotType;
    }

    private String spotType;
}
