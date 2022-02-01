package org.launchcode.java.demos.lessons.ch5;


import java.util.Date;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class House {

    private static int numHouses = 0;

    private final int id;
    private int numBedrooms;
    private int numBaths;
    private int sqFeet;
    private boolean hasGarage;
    private final Date dateBuilt;

    public House(int numBedrooms, int numBaths, int sqFeet, boolean hasGarage) {
        this.numBedrooms = numBedrooms;
        this.numBaths = numBaths;
        this.sqFeet = sqFeet;
        this.hasGarage = hasGarage;
        dateBuilt = new Date();
        numHouses++;
        id = numHouses;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBaths() {
        return numBaths;
    }

    public void setNumBaths(int numBaths) {
        this.numBaths = numBaths;
    }

    public int getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public static int getNumHouses() {
        return numHouses;
    }

    public Date getDateBuilt() {
        return dateBuilt;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", sqFeet=" + sqFeet +
                ", dateBuilt=" + dateBuilt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
