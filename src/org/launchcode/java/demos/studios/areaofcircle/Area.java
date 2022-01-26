package org.launchcode.java.demos.studios.areaofcircle;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
    }

}
