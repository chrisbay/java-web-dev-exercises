package org.launchcode.java.demos.studios.restaurant;

import java.util.Date;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        MenuItem falafel = new MenuItem(12, "Falafel sandwich w/ fries", "main course");
        MenuItem falafel2 = new MenuItem(12, "Falafel sandwich w/ fries", "main course");
        MenuItem falafel3 = new MenuItem(12, "Falafel sandwich w/ fries", "appetizer");
        MenuItem soup = new MenuItem(6, "Lentil soup w/ spices", "appetizer");
        MenuItem hummus = new MenuItem(8, "Deluxe hummus w/ fresh pita", "appetizer");

        // create an old item
        MenuItem stalePita = new MenuItem(5, "Pita from 2 months ago", "appetizer", new Date(2021 - 1900, 11, 1));

        menu.addItem(falafel);
        menu.addItem(soup);
        menu.addItem(hummus);

        System.out.println(menu);

        System.out.println(falafel.equals(soup));
        System.out.println(falafel.equals(falafel2));
        System.out.println(falafel.equals(falafel3));

        System.out.println("Pita is new: " + stalePita.isNew());

    }

}
