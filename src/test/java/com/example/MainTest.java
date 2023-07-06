package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int x = 5;
        int y = 0;
        int result = x / y;
    }
}
