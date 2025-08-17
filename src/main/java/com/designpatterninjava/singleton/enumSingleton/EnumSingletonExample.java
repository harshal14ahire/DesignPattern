package com.designpatterninjava.singleton.enumSingleton;

public class EnumSingletonExample {

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        singleton1.setValue(100);
        singleton1.showMessage();
        System.out.println("Value from singleton2: " + singleton2.getValue());
        System.out.println("Are both references the same instance? " + (singleton1 == singleton2));
    }
}