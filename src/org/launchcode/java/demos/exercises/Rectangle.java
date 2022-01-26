package org.launchcode.java.demos.exercises;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the width of your rectangle?");
        double width = input.nextDouble();
        System.out.println("What's the height of your rectangle?");
        double height = input.nextDouble();
        System.out.println("The area is: " + (width * height));
    }

}
