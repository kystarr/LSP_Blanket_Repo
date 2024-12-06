package org.howard.edu.lsp.finalexam.question2;



import java.util.Random;

/**
 * Concrete strategy that uses Java's built-in Random class to generate a random number.
 */
public class JavaRandomStrategy implements RandomNumberStrategy {
    private Random random;

    public JavaRandomStrategy() {
        random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensures positive number
    }
}

//I used ChatGPT to help write this code