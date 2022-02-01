package org.launchcode.java.demos.lessons.ch5;

/**
 * Created by Chris Bay
 */
public class Main {

    public static final double PI = 3.14;

    public static void main (String[] args) {

        System.out.println(House.getNumHouses());

        House house1 = new House(2, 1, 1200, false);
        System.out.println(House.getNumHouses());

        House house2 = new House(3, 3, 2000, true);
        System.out.println(House.getNumHouses());

        House house3 = new House(3, 3, 2000, true);
        System.out.println(House.getNumHouses());

        System.out.println(house1);

    }
}
