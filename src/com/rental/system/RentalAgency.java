package com.rental.system;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                System.out.println("Vehicle rented: " + vehicle);
                System.out.println("Customer: " + customer);
                System.out.println("Rental Cost: $" + vehicle.calculateRentalCost(days));
                return;
            }
        }
        System.out.println("Vehicle not available for rental.");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailable()) {
                vehicle.setAvailable(true);
                System.out.println("Vehicle returned: " + vehicle);
                return;
            }
        }
        System.out.println("Vehicle not found or already available.");
    }
}
