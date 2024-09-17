package com.google.classes;

public class Vehicle{

    public int vehicleID =10;

    public Vehicle() {
        System.out.println("Vehicle constructor called");

    }

    public String getVehicleID(){
        System.out.println("Vehicle id is "+ vehicleID);
        return Integer.toString(vehicleID);
    }
}