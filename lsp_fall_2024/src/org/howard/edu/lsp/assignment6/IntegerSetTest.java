package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {

    private IntegerSet set;

    @BeforeEach
    public void setUp() {
        // This method runs before each test. It initializes a new IntegerSet.
        set = new IntegerSet();
    }
    
    
    // adds an element to the set, and verifies that its contained in the set
    @Test
    public void testAdd() {
        set.add(25);
        assertTrue(set.contains(25));
    }

    // removes an element from the set, and checks to make sure its been removed
    @Test
    public void testRemove() {
        set.add(10);
        set.remove(10);
        assertFalse(set.contains(10));
    }

    // checks to see if an element is in the set
    @Test
    public void testContains() {
        set.add(3);
        assertTrue(set.contains(3));
        assertFalse(set.contains(10));
    }

    // checks whether of not two sets are equal
    @Test
    public void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(25);
        otherSet.add(30);
        set.add(30);
        set.add(25);
        assertTrue(set.equals(otherSet));

        set.remove(30);
        assertFalse(set.equals(otherSet));
    }

    // verifies the largest number in the set
    @Test
    public void testLargest() {
        set.add(1);
        set.add(10);
        set.add(5);
        assertEquals(10, set.largest());
    }

    // test to see if Largest method throws an exception. (it should)
    @Test
    public void testLargestEmptySet() {
        assertThrows(IllegalStateException.class, () -> set.largest());
    }

    // verifies the smallest number in the set
    @Test
    public void testSmallest() {
        set.add(1);
        set.add(10);
        set.add(5);
        assertEquals(1, set.smallest());
    }
    
    
    // checks to see if the Smallest method throws an exception (it should)
    @Test
    public void testSmallestEmptySet() {
        assertThrows(IllegalStateException.class, () -> set.smallest());
    }

    // checks the union of two sets
    @Test
    public void testUnion() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(10);
        otherSet.add(20);
        set.add(5);
        set.union(otherSet);
        assertTrue(set.contains(10));
        assertTrue(set.contains(20));
    }

    
    // checks the intersection of two sets
    @Test
    public void testIntersect() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(5);
        otherSet.add(10);
        set.add(5);
        set.add(10);
        set.add(20);
        set.intersect(otherSet);
        assertTrue(set.contains(5));
        assertTrue(set.contains(10));
        assertFalse(set.contains(20));
    }
    
    
    // verifies the set difference
    @Test
    public void testDiff() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(10);
        set.add(5);
        set.add(10);
        set.diff(otherSet);
        assertTrue(set.contains(5));
        assertFalse(set.contains(10));
    }
    
    // verifies that the set is empty
    @Test
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(5);
        assertFalse(set.isEmpty());
    }

    // verifies that the Clear method empties the set
    @Test
    public void testClear() {
        set.add(5);
        set.add(10);
        set.clear();
        assertTrue(set.isEmpty());
    }
}

