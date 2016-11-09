/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.inf.gres;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class OrdSetTest {

    /**
     * Test of getResizedTimes method, of class OrdSet.
     */
    @Test
    public void testGetResizedTimes() {
        OrdSet instance = new OrdSet(0);
        int expResult = 0;
        int result = instance.getResizedTimes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getActualSize method, of class OrdSet.
     */
    @Test
    public void testGetActualSize() {
        try {
            OrdSet instance = new OrdSet(0);
            assertEquals(0, instance.getActualSize());
            instance.add(10);
            assertEquals(1, instance.getActualSize());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    /**
     * Test of OverflowException
     * @throws br.ufpr.inf.gres.OverflowException
     */
    @Test(expected = OverflowException.class)
    public void testOverflowException() throws OverflowException {
        // By default min size is 4 and max is 16
        OrdSet instance = new OrdSet(0);
        instance.add(0);
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.add(4);
        instance.add(5);
        instance.add(6);
        instance.add(7);
        instance.add(8);
        instance.add(9);        
        instance.add(10);
        instance.add(11);
        instance.add(12);
        instance.add(13);
        instance.add(14);
        instance.add(15);
        instance.add(16);
        instance.add(17);
    }

    /**
     * Test of getSetSize method, of class OrdSet.
     */
    @Test
    public void testGetSetSize() {
        OrdSet instance = new OrdSet(0);
        int expResult = 4; // Min set size
        int result = instance.getSetSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSetLast method, of class OrdSet.
     */
    @Test
    public void testGetSetLast() {
        OrdSet instance = new OrdSet(0);
        int expResult = -1;
        int result = instance.getSetLast();
        //TODO: Check 
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class OrdSet.
     */
    @Test
    public void testIsEmpty() {
        OrdSet instance = new OrdSet(0);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSetElements method, of class OrdSet.
     */
    @Test
    @Ignore
    public void testGetSetElements() {
        OrdSet instance = new OrdSet(0);
        int[] expResult = null;
        int[] result = instance.getSetElements();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of isOverflow method, of class OrdSet.
     */
    @Test
    public void testIsOverflow() {
        OrdSet instance = new OrdSet(0);
        boolean expResult = false;
        boolean result = instance.isOverflow();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class OrdSet.
     */
    @Test
    public void testEquals() {
        OrdSet x = new OrdSet(0);
        OrdSet instance = new OrdSet(0);
        int expResult = 0;
        int result = instance.equals(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class OrdSet.
     */
    @Test
    public void testContains_int() {
        int n = 0;
        OrdSet instance = new OrdSet(0);
        boolean expResult = false;
        boolean result = instance.contains(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class OrdSet.
     */
    @Test
    public void testContains_OrdSet() {

        OrdSet x = new OrdSet(0);
        OrdSet instance = new OrdSet(0);
        boolean expResult = true;
        boolean result = instance.contains(x);
        //TODO: Check
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class OrdSet.
     */
    @Test
    public void testRemove() throws Exception {
        int val = 0;
        OrdSet instance = new OrdSet(0);
        boolean expResult = false;
        boolean result = instance.remove(val);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class OrdSet.
     */
    @Test
    public void testAdd() throws Exception {
        int n = 0;
        OrdSet instance = new OrdSet(0);
        instance.add(n);
    }

    /**
     * Test of elementAt method, of class OrdSet.
     */
    @Test
    public void testElementAt() {
        int where = 0;
        OrdSet instance = new OrdSet(0);
        int expResult = -1;
        int result = instance.elementAt(where);
        //TODO: Check
        assertEquals(expResult, result);
    }

    /**
     * Test of union method, of class OrdSet.
     */
    @Test
    @Ignore
    public void testUnion() {
        OrdSet s2 = new OrdSet(0);
        OrdSet instance = new OrdSet(0);
        OrdSet expResult = new OrdSet(0);
        OrdSet result = instance.union(s2);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class OrdSet.
     */
    @Test
    public void testToString() {
        OrdSet instance = new OrdSet(0);
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
