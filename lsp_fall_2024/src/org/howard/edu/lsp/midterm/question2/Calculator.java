package org.howard.edu.lsp.midterm.question2;

/**
 *This class sums numbers. 
 */
public class Calculator {
	/**
     * Sums two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values.
     *
     * @param a the first double value
     * @param b the second double value
     * @return the sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all elements in an array of integers.
     *
     * @param numbers an array of integers to sum
     * @return the sum of all integers in the array
     * @throws NullPointerException if the provided array is null
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}

//used chatGPT and Notebook LM to help with this question