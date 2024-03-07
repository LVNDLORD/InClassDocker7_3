package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {

        assertEquals("Adding two positive numbers should be correct", 10, App.add(7, 3));

        assertEquals("Adding zero should not change the number", 4, App.add(0, 4));
    }

    @Test
    public void testSubtract() {

        assertEquals("Subtracting smaller from bigger number should be correct", 8, App.subtract(15, 7));

        assertEquals("Subtracting zero should not change the number", 6, App.subtract(6, 0));
    }
}
