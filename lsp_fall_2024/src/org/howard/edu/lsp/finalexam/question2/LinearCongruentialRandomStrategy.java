package org.howard.edu.lsp.finalexam.question2;

import org.howard.edu.lsp.finalexam.question2.RandomNumberStrategy;

/**
 * Concrete strategy that uses a simple linear congruential generator (LCG) algorithm.
 * Formula: Xn+1 = (a * Xn + c) % m
 */
public class LinearCongruentialRandomStrategy implements RandomNumberStrategy {
    private static final int a = 1664525; // Multiplier
    private static final int c = 1013904223; // Increment
    private static final int m = (int) Math.pow(2, 32); // Modulus (2^32)
    private int seed;

    public LinearCongruentialRandomStrategy(int seed) {
        this.seed = seed;
    }

    @Override
    public int generateRandomNumber() {
        seed = (a * seed + c) % m;
        return Math.abs(seed); // Ensure the number is positive
    }
}

//I used ChatGPT to help write this code