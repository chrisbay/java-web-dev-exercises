package org.launchcode.java.demos.exercises.technology;

/**
 * Created by Chris Bay
 */
public class Computer extends AbstractEntity {

    private final String manufacturer;
    private final String model;
    private int ramInGb;
    private final int yearManufactured;

    public Computer(String manufacturer, String model, int ramInGb, int yearManufactured) {
        super();
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramInGb = ramInGb;
        this.yearManufactured = yearManufactured;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamInGb() {
        return ramInGb;
    }

    public void setRamInGb(int ramInGb) {
        this.ramInGb = ramInGb;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    @Override
    public String toString() {
        return this.manufacturer + " " + this.model + " (" + this.yearManufactured + ")";
    }
}
