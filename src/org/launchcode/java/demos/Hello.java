package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {

        // primitive data types
        int year = 2022;
        double pi = 3.14;
        boolean isTuesday = true;
        char myChar = 'c';

        // object data types
        String name = "Chris Bay";
        Integer nextYear = 2023;
        Double longerPi = 3.14159;
        Boolean isWednesday = false;
        Character anotherChar = 'b';

        // arrays in Java have FIXED LENGTH
        String[] names = {"Chris", "Annie", "Jack"};
        names[0] = "Christopher";
        int[] years = new int[10];

        boolean isEqual = (year == 2000);

        // nextYear == 2000;
        nextYear.equals(2000);

    }
}
