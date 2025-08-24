package com.designpatterninjava.builder;

public class Computer {
    // Required parameters
    private String cpu;
    private String ram;
    private String storage;

    // Optional parameters
    private String graphicsCard;
    private String soundCard;
    private String operatingSystem;

    // Private constructor to be used only by the Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.soundCard = builder.soundCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Getters for all fields
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getSoundCard() { return soundCard; }
    public String getOperatingSystem() { return operatingSystem; }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
                ", Graphics Card=" + graphicsCard + ", Sound Card=" + soundCard +
                ", OS=" + operatingSystem + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters (typically same as Product)
        private String cpu;
        private String ram;
        private String storage;

        // Optional parameters (with default values or null)
        private String graphicsCard = "Integrated";
        private String soundCard = "Onboard";
        private String operatingSystem = "Windows";

        // Builder constructor for required parameters
        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // Methods to set optional parameters, returning the Builder for chaining
        public Builder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder withSoundCard(String soundCard) {
            this.soundCard = soundCard;
            return this;
        }

        public Builder withOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // The build() method that creates and returns the final Product
        public Computer build() {
            return new Computer(this);
        }
    }
}