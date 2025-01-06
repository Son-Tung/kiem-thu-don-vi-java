package com.example.test;

import com.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
