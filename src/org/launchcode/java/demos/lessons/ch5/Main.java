package org.launchcode.java.demos.lessons.ch5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main (String[] args) {

        House house1 = new House(2, 1, 1200, false);
        House house2 = new House(3, 3, 2000, true);
        House house3 = new House(3, 3, 1800, true);

        ArrayList<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);

    }
}
