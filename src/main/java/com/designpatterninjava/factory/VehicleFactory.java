package com.designpatterninjava.factory;

public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("motorcycle".equalsIgnoreCase(type)) {
            return new Motorcycle();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
