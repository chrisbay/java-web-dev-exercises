package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

/**
 * Created by Chris Bay
 */
public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
    }
}
