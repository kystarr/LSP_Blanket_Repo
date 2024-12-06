package org.howard.lsp.finalexam.question2;

//public class RandomNumberService {
//
//}

/**
 * Singleton service that allows switching between different random number generation strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {
        // Set default strategy to Java Random
        this.strategy = new JavaRandomStrategy();
    }

    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    public int generateRandomNumber() {
        return strategy.generateRandomNumber();
    }
}

//I used ChatGPT to help write this code