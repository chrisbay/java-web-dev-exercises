package org.launchcode.java.demos.exercises;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How much gas have you used?");
        double gallons = input.nextDouble();
        System.out.println("Your gas mileage is: " + (miles / gallons));
    }

}
