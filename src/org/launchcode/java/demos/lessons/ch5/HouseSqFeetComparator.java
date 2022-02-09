package org.launchcode.java.demos.lessons.ch5;

import java.util.Comparator;

/**
 * Created by Chris Bay
 */
public class HouseComparator implements Comparator<House> {

    // comparator.compare(house1, house2); -> house1 > house2
    @Override
    public int compare(House o1, House o2) {
        return o1.getSqFeet() - o2.getSqFeet();
    }
}
