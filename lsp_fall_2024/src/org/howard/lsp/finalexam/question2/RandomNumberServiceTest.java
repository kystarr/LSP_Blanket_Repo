package org.howard.lsp.finalexam.question2;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberServiceTest {

    @Test
    void testGenerateRandomNumberJava() {
        RandomNumberService service = RandomNumberService.getInstance();
        service.setStrategy(new JavaRandomStrategy());
        int result = service.generateRandomNumber();
        assertTrue(result > 0, "The result should be a positive integer");
    }

    @Test
    void testGenerateRandomNumberLCG() {
        RandomNumberService service = RandomNumberService.getInstance();
        service.setStrategy(new LinearCongruentialRandomStrategy(123456789));
        int result = service.generateRandomNumber();
        assertTrue(result > 0, "The result should be a positive integer");
    }
}

// I used ChatGPT to help write this code