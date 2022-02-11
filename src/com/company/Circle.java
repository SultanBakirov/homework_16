package com.company;

public class Circle {
    private static double radius = 2;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    static void area() {
        double getRadius = 2;
        System.out.println(Math.PI * (getRadius * radius));
    }
    static void circumference() {
        System.out.println(Math.PI * 2 * radius);
    }
}
