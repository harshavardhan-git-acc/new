package com.demos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testFactorial() {
        assertEquals(120, App.factorial(5));
        assertEquals(1, App.factorial(0));
        assertEquals(1, App.factorial(1));
    }
}