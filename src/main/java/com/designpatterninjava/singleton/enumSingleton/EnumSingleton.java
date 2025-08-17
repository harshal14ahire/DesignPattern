package com.designpatterninjava.singleton.enumSingleton;

public enum EnumSingleton {
    // The single instance is declared as a constant.
    INSTANCE;

    // A field or method to be part of your singleton's functionality.
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void showMessage() {
        System.out.println("Hello from Enum Singleton! Current value is: " + this.getValue());
    }
}