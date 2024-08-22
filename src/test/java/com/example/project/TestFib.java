package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TestFib {

    @Test
    public void testCalculateFibonacci() {
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597};
        long[] result = Fibonacci.calculateFibonacci(18);
        
        // Using a simple loop to compare arrays
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != result[i]) {
                throw new AssertionError("Arrays differ at index " + i + 
                    ". Expected: " + expected[i] + ", but got: " + result[i]);
            }
        }
    }
}
