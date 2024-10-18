package org.howard.edu.lsp.midterm.question4;


import java.util.HashMap;

/**
 * A utility class for operations on HashMaps.
 */

public class MapUtilities {
	
	/**
     * Counts the number of common key/value pairs between two HashMaps.
     *
     * @param map1 the first HashMap to compare
     * @param map2 the second HashMap to compare
     * @return the number of common key/value pairs; returns 0 if either map is empty
     */
	
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0; // Return 0 if either map is empty
        }
        
        int count = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                count++; // Increment count if both key and value match
            }
        }
        return count;
    }
}

//used chatGPT and Notebook LM to help with this question