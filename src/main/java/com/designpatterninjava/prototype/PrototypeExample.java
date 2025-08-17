package com.designpatterninjava.prototype;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("--- Shallow Copy Example (Circle) ---");
        Point circleCenter = new Point(10, 20);
        Circle originalCircle = new Circle("red", circleCenter);
        originalCircle.draw();

        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.draw();

        System.out.println("\nModifying cloned circle's center point...");
        clonedCircle.getCenter().x = 50;
        clonedCircle.getCenter().y = 60;

        System.out.println("Original Circle after modification:");
        originalCircle.draw();
        System.out.println("Cloned Circle after modification:");
        clonedCircle.draw();

        System.out.println("\n--- Deep Copy Example (Rectangle) ---");
        Point rectangleTopLeft = new Point(100, 200);
        Rectangle originalRectangle = new Rectangle("blue", rectangleTopLeft);
        originalRectangle.draw();

        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        clonedRectangle.draw();

        System.out.println("\nModifying cloned rectangle's top-left point...");
        clonedRectangle.getTopLeft().x = 500;
        clonedRectangle.getTopLeft().y = 600;

        System.out.println("Original Rectangle after modification:");
        originalRectangle.draw();
        System.out.println("Cloned Rectangle after modification:");
        clonedRectangle.draw();
    }
}