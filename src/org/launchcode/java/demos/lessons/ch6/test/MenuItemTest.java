package org.launchcode.java.demos.lessons.ch6.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lessons.ch6.main.MenuItem;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Chris Bay
 */
public class MenuItemTest {

    private MenuItem genericItem;

    @Before
    public void setUp() {
        genericItem = new MenuItem(42, "chili", "soups");
    }

    @Test
    public void testConstructorSetsMainFields () {

        // arrange
        double price = 42;
        String description = "chili";
        String category = "soups";

        // act
        MenuItem item = new MenuItem(price, description, category);

        // assert
        assertEquals(price, item.getPrice(), 0.01);
        assertEquals(description, item.getDescription());
        assertEquals(category, item.getCategory());
    }

    @Test
    public void testConstructorSetsCreatedToNowByDefault() {
        Date now = new Date();
        assertTrue(now.getTime() - genericItem.getCreated().getTime() < 1000);
    }

    @Test
    public void testIsNewReturnsTrueBeforeThirtyDays() {
        Date recently = new Date(2022 - 1900, 0, 5);
        MenuItem item = new MenuItem(42, "chili", "soups", recently);
        assertTrue(item.isNew());
    }

    @Test
    public void testIsNewReturnsFalseAfterThirtyDays() {
        Date notSoRecently = new Date(2021 - 1900, 11, 25);
        MenuItem item = new MenuItem(42, "chili", "soups", notSoRecently);
        assertFalse(item.isNew());
    }

    @Test
    public void testEqualsIsTrueForSamePrimaryFields() {
        MenuItem anotherItem = new MenuItem(genericItem.getPrice(), genericItem.getDescription(), genericItem.getCategory());
        assertEquals(anotherItem, genericItem);
    }

    @Test
    public void testEqualsIsFalseForDifferentPrices() {}

}
