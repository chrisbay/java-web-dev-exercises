package org.launchcode.java.demos.lessons.ch8.shapes;

/**
 * Created by Chris Bay
 */
public class Circle implements Shape {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
