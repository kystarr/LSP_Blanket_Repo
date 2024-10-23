package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet  {
	/**
	 * Store the set of elements in an ArrayList
	 */
	private List<Integer> set = new ArrayList<Integer>();

	/**
	 *  Default Constructor, that initializes an empty IntegerSet
	 */
	public IntegerSet() {
	}

	/**
	 *  Constructor if you want to pass in already initialized
	 * @param set an ArrayList of integers to initialize the IntegerSet
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
		for (int item : set) {
			add(item);
		}
	}

/**
 *  Clears the internal representation of the set. 
 */
public void clear() {
	set.clear();
};

/**
 *  Returns the length of the set. 
 * @return the length of the set
 */
public int length() {
	return set.size(); // returns the length of the set
}; 

/**
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class. 
 * 
 * @param o the object to compare with this IntegerSet
 * @return true if this set is equal to the specified object; false if not
*/

@Override
public boolean equals(Object o) {
	if (this == o) return true;   // checks to see if the objects are the same
	if (!(o instanceof IntegerSet)) return false;
    IntegerSet other = (IntegerSet) o;
    return set.containsAll(other.set) && other.set.containsAll(set);
}; 

/**
 * 
 * Returns true if the set contains the value, otherwise false.
 * @param value 
 * @return true if set contains value, false if it doesn't
 */
public boolean contains(int value) {
	return set.contains(value);
};    
/**
 * Returns the largest item in the set.
 * @return largest integer in set
 * @throws IllegalStateException if the set is empty
 */
public int largest()  {
	if (isEmpty()) throw new IllegalStateException("Set is empty");
    return set.stream().max(Integer::compareTo).orElseThrow();
}; 


/** 
 * Returns the smallest item in the set.
 * 
 * @return the smallest integer in the set
 * @throws IllegalStateException if the set is empty
 */
public int smallest()  {
	if (isEmpty()) throw new IllegalStateException("Set is empty");
    return set.stream().min(Integer::compareTo).orElseThrow();
};

	
/** 
 * Adds an item to the set or does nothing if it is already present.
 * 
 * @param item the integer value to add to the set
 */
 
public void add(int item) {
 	if (!contains(item)) {
           set.add(item);
       }
 }; // adds item to the set or does nothing if it is in set

 /** 
  * Removes an item from the set or does nothing if it is not there.
  * @param item the integer value to remove from the set
  */	
public void remove(int item) {
	set.remove(Integer.valueOf(item));
}; 

/** 
 * Sets Union
 * @param intSetb the other IntegerSet to union with
 */
public void union(IntegerSet intSetb) {
	for (int item : intSetb.set) {
        add(item);
    }
};

/**
 * Set intersection, all elements in s1 and s2. 12 pts.
 * @param intSetb the other IntegerSet to intersect with
 */
public void intersect(IntegerSet intSetb) {
	set.retainAll(intSetb.set);
}; 

/**
 * Set difference, i.e., s1 –s2.
 * @param intSetb
 */
public void diff(IntegerSet intSetb) {
	set.removeAll(intSetb.set);// set difference, i.e. s1 - s2
};

/**
 * Set complement, all elements not in s1. 11 pts.
 * @param intSetb the other IntegerSet to compare against
 */
public void complement(IntegerSet intSetb) {
	List<Integer> complementSet = new ArrayList<>();
    for (int item : intSetb.set) {
        if (!this.contains(item)) {
            complementSet.add(item);
        }
    }
    this.set = complementSet;
}

/**
 * Returns true if the set is empty, false otherwise.
 * @return true if set is empty, false otherwise
 */
boolean isEmpty() {
	return set.isEmpty();
}; 

/**
 *  Return String representation of your set.  
 *  This overrides the equal method from the Object class
 *  @return a string representation of the set
 */

//return String representation of your set
@Override
public String toString() {
	return set.toString();
};	
}
