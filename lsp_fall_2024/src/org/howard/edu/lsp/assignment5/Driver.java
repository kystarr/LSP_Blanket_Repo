package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
        // Create first IntegerSet
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
     // Display the contents of set1
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Create second IntegerSet
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
     // Display the contents of set2
        System.out.println("Value of Set2 is: " + set2.toString());

        // Perform union of set1 and set2
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());

        set1.union(set2); // union of set1 and set2
        System.out.println("Result of union of Set1 and Set2");
        System.out.println("Result: " + set1.toString()); // result of union of set1 and set2
    }
}
	


