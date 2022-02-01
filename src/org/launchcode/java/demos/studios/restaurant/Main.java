package org.launchcode.java.demos.studios.restaurant;

/**
 * Created by Chris Bay
 */
public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        MenuItem falafel = new MenuItem(12, "Falafel sandwich w/ fries", "main course", false);
        MenuItem soup = new MenuItem(6, "Lentil soup w/ spices", "appetizer", false);
        MenuItem hummus = new MenuItem(8, "Deluxe hummus w/ fresh pita", "appetizer", true);

        menu.addItem(falafel);
        menu.addItem(soup);
        menu.addItem(hummus);

        System.out.println(menu);
    }

}
