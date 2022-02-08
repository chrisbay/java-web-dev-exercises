package org.launchcode.java.demos.lessons.ch8.shapes;

/**
 * Created by Chris Bay
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

}
