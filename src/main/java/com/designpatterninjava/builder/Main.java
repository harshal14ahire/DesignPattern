package com.designpatterninjava.builder;

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel Core i9", "32GB DDR4", "1TB SSD")
                .withGraphicsCard("NVIDIA RTX 4080")
                .withSoundCard("Creative Sound Blaster")
                .withOperatingSystem("Windows 11")
                .build();
        System.out.println("Gaming PC: " + gamingPC);

        System.out.println();

        Computer officePC = new Computer.Builder("Intel Core i5", "8GB DDR4", "500GB SSD")
                .build();
        System.out.println("Office PC: " + officePC);
    }
}