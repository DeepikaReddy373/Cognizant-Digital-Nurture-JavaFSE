package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5,5));
    }

    @Test
    void testSubtraction() {
        assertEquals(4, calculator.subtract(10,6));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4,5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(20,4));
    }

    @Test
    void testNotNull() {
        assertNotNull(calculator);
    }

    @Test
    void testTrue() {
        assertTrue(20 > 10);
    }

    @Test
    void testFalse() {
        assertFalse(5 > 10);
    }
}