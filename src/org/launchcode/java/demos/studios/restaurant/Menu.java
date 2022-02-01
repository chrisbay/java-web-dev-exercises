package org.launchcode.java.demos.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Chris Bay
 */
public class Menu {

    private Date lastUpdated;
    private final ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = new Date();
        this.items = new ArrayList<>();
    }

    public Menu(ArrayList<MenuItem> items) {
        this();
        this.items.addAll(items); // instead of this.items = items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        // create and return a copy
        return items;
    }
}

