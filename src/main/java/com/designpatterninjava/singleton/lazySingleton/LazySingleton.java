package com.designpatterninjava.singleton.lazySingleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World From Lazy Singleton...!");
    }

    public static void main(String[] args) {
        // in multithreading environment this leads to violets the property of the Singleton Design Pattern
        // multiple instances can exits in this case
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("Lazy Singleton Check: " + (lazySingleton1 == lazySingleton2));
        lazySingleton1.showMessage();
    }
}