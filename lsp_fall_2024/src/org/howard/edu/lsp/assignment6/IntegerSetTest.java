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

    @Test
    public void testAdd() {
        set.add(5);
        assertTrue(set.contains(5));
    }

    @Test
    public void testRemove() {
        set.add(10);
        set.remove(10);
        assertFalse(set.contains(10));
    }

    @Test
    public void testContains() {
        set.add(3);
        assertTrue(set.contains(3));
        assertFalse(set.contains(10));
    }

    @Test
    public void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(5);
        otherSet.add(3);
        set.add(3);
        set.add(5);
        assertTrue(set.equals(otherSet));

        set.remove(3);
        assertFalse(set.equals(otherSet));
    }

    @Test
    public void testLargest() {
        set.add(1);
        set.add(10);
        set.add(5);
        assertEquals(10, set.largest());
    }

    @Test
    public void testLargestEmptySet() {
        assertThrows(IllegalStateException.class, () -> set.largest());
    }

    @Test
    public void testSmallest() {
        set.add(1);
        set.add(10);
        set.add(5);
        assertEquals(1, set.smallest());
    }

    @Test
    public void testSmallestEmptySet() {
        assertThrows(IllegalStateException.class, () -> set.smallest());
    }

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

    @Test
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(5);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testClear() {
        set.add(5);
        set.add(10);
        set.clear();
        assertTrue(set.isEmpty());
    }
}

