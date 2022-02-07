package org.launchcode.java.demos.exercises.technology.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.exercises.technology.Laptop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Chris Bay
 */
public class TestLaptop {

    private Laptop laptop;

    @Before
    public void setUp() {
        this.laptop = new Laptop("Apple", "Macbook Pro", 8, 2019, false);
    }

    @Test
    public void testUpgradeMemoryWithValidUpgrade() {
        this.laptop.upgradeMemory(4);
        assertEquals(12, this.laptop.getRamInGb());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeMemoryWithInvalidUpgrade() {
        this.laptop.upgradeMemory(10);
        fail("upgradeMemory should throw an exception when upgrading to more than 16 GB");
    }

}
