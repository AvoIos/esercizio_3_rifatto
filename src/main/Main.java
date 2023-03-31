package main;

import vehicle.VehicleManagement;

public class Main {
    public static void main(String[] args) {
        VehicleManagement vehicleManagement = new VehicleManagement((args.length > 0) ? args[0] : null);
        vehicleManagement.mainMenu();
    }
}