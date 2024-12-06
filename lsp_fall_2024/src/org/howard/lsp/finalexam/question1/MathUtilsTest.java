package org.howard.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    private MathUtils mathUtils = new MathUtils();

    // factorial method Tests
    @Test
    void testFactorialPositiveInteger() {
        // Testing factorial of positive number
        assertEquals(720, mathUtils.factorial(6), "Factorial of 5 should be 120");
    }

    @Test
    void testFactorialZero() {
        // Testing factorial of 0 (should be 1)
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    void testFactorialNegative() {
        // Testing factorial for negative number (should throw exception)
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1),
                "Factorial of a negative number should throw IllegalArgumentException");
    }

    // isPrime() tests
    @Test
    void testIsPrimePositive() {
        // Testing a prime number
        assertTrue(mathUtils.isPrime(7), "7 should be identified as a prime number");
    }

    @Test
    void testIsPrimeNegative() {
        //Testing a non-prime number (negative case)
        assertFalse(mathUtils.isPrime(4), "4 should not be identified as a prime number");
        assertFalse(mathUtils.isPrime(10), "10 should not be identified as a prime number");
    }

    @Test
    void testIsPrimeEdgeCase() {
        //Testing a number less than or equal to 1
        assertFalse(mathUtils.isPrime(0), "0 should not be identified as a prime number");
        assertFalse(mathUtils.isPrime(1), "1 should not be identified as a prime number");
    }

    // gcd method test
    @Test
    void testGcdCommonScenario() {
        //Testing GCD of two numbers
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(4, mathUtils.gcd(20, 12), "GCD of 20 and 12 should be 4");
    }

    @Test
    void testGcdWithZero() {
        // Testing GCD where one number is zero
        assertEquals(5, mathUtils.gcd(0, 5), "GCD of 0 and 5 should be 5");
    }

    @Test
    void testGcdBothZero() {
        //Testing GCD of both numbers being zero (should throw exception)
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0),
                "GCD of both numbers being zero should throw IllegalArgumentException");
    }
}


//I used ChatGPT to help write this code