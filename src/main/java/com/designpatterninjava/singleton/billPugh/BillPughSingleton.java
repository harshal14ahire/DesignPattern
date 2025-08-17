package com.designpatterninjava.singleton.billPugh;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton singleton = BillPughSingleton.getInstance();
        singleton.showMessage();
    }

    private void showMessage() {
        System.out.println("Bill Pugh Singleton");
    }
}
