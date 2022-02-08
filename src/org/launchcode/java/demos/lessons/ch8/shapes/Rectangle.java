package org.launchcode.java.demos.lessons.ch8.shapes;

/**
 * Created by Chris Bay
 */
public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

}
