package org.howard.lsp.finalexam.question2;

//public class RandomNumberClient {
//
//}

/**
 * Client program that demonstrates the use of the RandomNumberService with different strategies.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService randomNumberService = RandomNumberService.getInstance();

        // Using Java's built-in Random
        randomNumberService.setStrategy(new JavaRandomStrategy());
        System.out.println("Java Random Number: " + randomNumberService.generateRandomNumber());

        // Using Linear Congruential Generator
        randomNumberService.setStrategy(new LinearCongruentialRandomStrategy(123456789)); // Example seed
        System.out.println("LCG Random Number: " + randomNumberService.generateRandomNumber());
    }
}

//I used ChatGPT to help write this code