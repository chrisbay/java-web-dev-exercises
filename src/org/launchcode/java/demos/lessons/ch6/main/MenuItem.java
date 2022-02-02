package org.launchcode.java.demos.lessons.ch6.main;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date created = new Date();

    private static final int NEW_ITEM_DURATION_DAYS = 30;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public MenuItem(double price, String description, String category, Date created) {
        this(price, description, category);
        this.created = created;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getCreated() {
        return created;
    }

    public boolean isNew() {
        Date now = new Date();
        long diff = now.getTime() - created.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        return days < NEW_ITEM_DURATION_DAYS && days >= 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.getDescription() + " - $" + this.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), price) == 0 && Objects.equals(description, menuItem.getDescription()) && Objects.equals(category, menuItem.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }
}