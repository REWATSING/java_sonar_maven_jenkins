package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int x = 5;
        int y = 0;
        try {
            int result = x / y;
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
            throw e;
        }
    }
}
