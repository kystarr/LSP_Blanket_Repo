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
        String filename = "words.text"; 
        try (Scanner inputfile = new Scanner(new File(filename)))
        {
            HashMap<String, Integer> wordcounter = new HashMap<>();
            Pattern wordpattern = Pattern.compile("\\b[a-zA-Z]{4,}\\b");
            
            while (inputfile.hasNext()) 
            {
                String word = inputfile.next();
                word = word.toLowerCase(); 
                Matcher matcher = wordpattern.matcher(word);
                
                if (matcher.matches()) 
                {
            
                    wordcounter.put(word, wordcounter.getOrDefault(word, 0) + 1);
                }
            }
            
       
            for (Map.Entry<String, Integer> entry : wordcounter.entrySet()) 
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } 
    }
}
