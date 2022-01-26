package org.launchcode.java.demos.exercises;

import java.util.Scanner;

/**
 * Created by Chris Bay
 */
public class HelloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name);
    }

}
