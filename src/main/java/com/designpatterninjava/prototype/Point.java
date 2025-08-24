package com.designpatterninjava.prototype;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point clone() {
        return new Point(this.x, this.y);
    }
}

class Circle implements Shape {
    private String color;
    private Point center;

    public Circle(String color, Point center) {
        this.color = color;
        this.center = center;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + center.x + ", " + center.y + ")");
    }

    public Point getCenter() {
        return center;
    }
}

class Rectangle implements Shape {
    private String color;
    private Point topLeft;

    public Rectangle(String color, Point topLeft) {
        this.color = color;
        this.topLeft = topLeft;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle clonedRectangle = (Rectangle) super.clone();
        clonedRectangle.topLeft = this.topLeft.clone();
        return clonedRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle at (" + topLeft.x + ", " + topLeft.y + ")");
    }

    public Point getTopLeft() {
        return topLeft;
    }
}