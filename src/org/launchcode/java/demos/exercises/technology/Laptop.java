package org.launchcode.java.demos.exercises.technology;

/**
 * Created by Chris Bay
 */
public class Laptop extends Computer {

    private boolean hasTouchscreen;
    private static final int MAX_RAM = 16;

    public Laptop(String manufacturer,
                  String model,
                  int ramInGb,
                  int yearManufactured,
                  boolean hasTouchscreen) {
        super(manufacturer, model, ramInGb, yearManufactured);
        this.hasTouchscreen = hasTouchscreen;
    }

    public void upgradeMemory(int additionalRam) {
        if (this.getRamInGb() + additionalRam > MAX_RAM) {
            throw new IllegalArgumentException("Can't upgrade RAM. New RAM amount exceeds available space");
        }
        this.setRamInGb(this.getRamInGb() + additionalRam);
    }

    public boolean hasTouchscreen() {
        return hasTouchscreen;
    }

    public void setHasTouchscreen(boolean hasTouchscreen) {
        this.hasTouchscreen = hasTouchscreen;
    }
}
