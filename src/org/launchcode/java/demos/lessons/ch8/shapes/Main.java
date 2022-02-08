package org.launchcode.java.demos.lessons.ch8.shapes;

import java.util.ArrayList;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(2.5, 7));
        shapes.add(new Square(6.159));
        shapes.add(new Triangle(3, 5));

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

    }

}
