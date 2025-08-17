package com.designpatterninjava.singleton.threadSafe;

class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;

    }

    public static void main(String[] args) {
        ThreadSafeSingleton lazySingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton lazySingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println("Lazy Singleton Check: " + (lazySingleton1 == lazySingleton2));
        lazySingleton1.showMessage();
    }

    private void showMessage() {
        System.out.println("Hello World from ThreadSafeSingleton");
    }
}