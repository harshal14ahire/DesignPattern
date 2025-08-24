package com.designpatterninjava.factory;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the factory
        VehicleFactory factory = new VehicleFactory();

        // Create a car and a motorcycle using the factory
        Vehicle car = factory.createVehicle("car");
        Vehicle motorcycle = factory.createVehicle("motorcycle");

        // Use the created objects
        car.drive();
        motorcycle.drive();
    }
}