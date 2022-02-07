package org.launchcode.java.demos.exercises.technology;

/**
 * Created by Chris Bay
 */
public class SmartPhone extends Computer {

    private boolean isWaterproof = false;
    private String passcode;
    private boolean isUnlocked = true;

    public SmartPhone(String manufacturer, String model, int ramInGb, int yearManufactured) {
        super(manufacturer, model, ramInGb, yearManufactured);
    }

    public SmartPhone(String manufacturer, String model, int ramInGb, int yearManufactured, boolean isWaterproof) {
        super(manufacturer, model, ramInGb, yearManufactured);
        this.isWaterproof = isWaterproof;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setPasscode(String passcode) {

        try {
            Integer.parseInt(passcode);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid passcode. Passcodes may only contain digits.");
        }

        if (passcode.length() != 4) {
            throw new IllegalArgumentException("Invalid passcode. Passcodes must be 4 digits long");
        }

        this.passcode = passcode;
        this.isUnlocked = false;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public boolean unlock(String codeEntered) {
        if (codeEntered.equals(this.passcode)) {
            this.isUnlocked = true;
            return true;
        }
        return false;
    }

    public void lock() {
        this.isUnlocked = false;
    }
}
