package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAAATest {

    @Test
    public void testAddition() {

        // Arrange
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(20, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        Calculator calculator = new Calculator();
        int a = 15;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(10, result);
    }
}