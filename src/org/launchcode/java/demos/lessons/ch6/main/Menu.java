package org.launchcode.java.demos.lessons.ch6.main;

import org.launchcode.java.demos.studios.restaurant.MenuItem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Chris Bay
 */
public class Menu {

    private Date lastUpdated;
    private final ArrayList<org.launchcode.java.demos.studios.restaurant.MenuItem> items;

    public Menu() {
        this.lastUpdated = new Date();
        this.items = new ArrayList<>();
    }

    public Menu(ArrayList<org.launchcode.java.demos.studios.restaurant.MenuItem> items) {
        this();
        this.items.addAll(items); // instead of this.items = items;
    }

    public void addItem(org.launchcode.java.demos.studios.restaurant.MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem(org.launchcode.java.demos.studios.restaurant.MenuItem item) {
        this.items.remove(item);
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedFormatted() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d, YYYY");
        return dateFormat.format(this.lastUpdated);
    }

    public ArrayList<org.launchcode.java.demos.studios.restaurant.MenuItem> getItems() {
        // create and return a copy
        return items;
    }

    @Override
    public String toString() {
        String str = "Menu (last updated " + this.getLastUpdatedFormatted() + ")\n";
        str += "----------------------\n\n";

        for (MenuItem item : this.getItems()) {
            str += item.toString() + "\n";
        }

        return str;
    }
}
