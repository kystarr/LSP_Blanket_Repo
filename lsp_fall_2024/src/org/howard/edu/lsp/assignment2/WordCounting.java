package org.howard.edu.lsp.assignment2;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.FileNotFoundException;

public class WordCounting {

    public static void main(String[] args) throws FileNotFoundException 
    {
        String filename = "words.txt"; 
        try (Scanner inputfile = new Scanner(new File(filename)))      
        {
            HashMap<String, Integer> wordcounter = new HashMap<>();               // using HashMap to show the name: # of occurrences
            Pattern wordpattern = Pattern.compile("\\b[a-zA-Z]{4,}\\b");        // words must have at least 4 letters
            
            while (inputfile.hasNext())                // going through each word in the file
            {
                String word = inputfile.next();
                word = word.toLowerCase();                            // makes all words lower case, making sure the code is case-insesnsitive
                Matcher matcher = wordpattern.matcher(word);         
                
                if (matcher.matches())                                   // checking to see if words have 4 or less letters
                {
            
                    wordcounter.put(word, wordcounter.getOrDefault(word, 0) + 1);    // adding counter
                }
            }
            
       
            for (Map.Entry<String, Integer> entry : wordcounter.entrySet())    // iterating through HashMap
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());    // prints out word: # of occurrences
            }
        } 
    }
}

