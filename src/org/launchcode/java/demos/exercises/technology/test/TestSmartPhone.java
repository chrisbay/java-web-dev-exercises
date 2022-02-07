package org.launchcode.java.demos.exercises.technology.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.exercises.technology.SmartPhone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Chris Bay
 */
public class TestSmartPhone {

    private SmartPhone phone;

    @Before
    public void setUp() {
        phone = new SmartPhone("Apple", "iPhone X Max", 8, 2018, true);
    }

    @Test
    public void testUnlockSuccess () {
        String passcode = "1234";
        phone.setPasscode(passcode);
        boolean success = phone.unlock(passcode);
        assertTrue(success);
    }

    @Test
    public void testUnlockFail () {
        String passcode = "1234";
        phone.setPasscode(passcode);
        boolean success = phone.unlock("4321");
        assertFalse(success);
    }

}
