package com.rental.system;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Add vehicles
        agency.addVehicle(new Car("C001", "Toyota Corolla", 50, true));
        agency.addVehicle(new Motorcycle("M001", "Yamaha R1", 30, true));
        agency.addVehicle(new Truck("T001", "Ford F-150", 100, 2.5));

        // Add customer
        Customer customer = new Customer("John Doe", "CUST001");

        // Rent and return vehicles
        agency.rentVehicle("C001", customer, 5);
        agency.returnVehicle("C001");
    }
}
