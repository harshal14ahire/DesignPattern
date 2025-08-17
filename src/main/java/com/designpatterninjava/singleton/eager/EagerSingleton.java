package com.designpatterninjava.singleton.eager;


class EagerSingleton {
    // The instance is created at the time of class loading
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent direct instantiation
    private EagerSingleton() {
    }

    // Public method to provide the global access point
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
}

class SingletonMain {
    public static void main(String[] args) {
        // Get the single instance of the class
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        // Check if both references point to the same object
        System.out.println("Eager Singleton Check: " + (singleton1 == singleton2));
        singleton1.showMessage();
    }
}