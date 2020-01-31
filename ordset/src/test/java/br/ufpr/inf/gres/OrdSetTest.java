/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.inf.gres;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class OrdSetTest {

    /**
     * Test of constructor method, of class OrdSet
     */
    @Test
    public void testConstructor() {
        int[] array = new int[]{0, 3, 1, 10, 33, 500, 99, 100};
        OrdSet instance = new OrdSet(array);
        assertEquals("0 1 3 10 33 99 100 500 ", instance.toString());

        array = new int[]{97, 62, 7, 11, 34, 38, 95, 82, 45, 32, 33, 72, 53, 97, 37, 77, 94, 5, 31, 75, 70, 9, 53, 64, 62, 12, 49, 5, 31, 33, 62, 98, 32, 91, 67, 89, 14, 25, 66, 77, 23, 28, 12, 18, 56, 73, 97, 34, 78, 35, 70, 18, 40, 89, 33, 44, 24, 39, 6, 52, 29, 71, 45, 19, 54, 17, 86, 76, 74, 66, 56, 14, 23, 69, 93, 21, 5, 28, 71, 52, 57, 78, 77, 63, 58, 85, 40, 72, 9, 41, 97, 85, 98, 59, 53, 93, 37, 88, 43, 69};
        instance = new OrdSet(array);
        assertEquals("7 11 32 33 34 37 38 45 53 62 72 77 82 94 95 97 ", instance.toString());
    }

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
     *
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
    public void testGetSetElements() {        
        try {
            OrdSet s2 = new OrdSet(9);
            s2.add(0);
            s2.add(1);
            s2.add(2);
            s2.add(3);
            s2.add(4);
            s2.add(5);
            s2.add(6);
            s2.add(7);
            s2.add(8);

            OrdSet expResult = new OrdSet(9);
            expResult.add(0);
            expResult.add(1);
            expResult.add(2);
            expResult.add(3);
            expResult.add(4);
            expResult.add(5);
            expResult.add(6);
            expResult.add(7);
            expResult.add(8);            
            
            assertEquals(Arrays.toString(expResult.getSetElements()), Arrays.toString(s2.getSetElements()));
        } catch (Exception e) {
            assertTrue(false);
        }
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
        try {
            OrdSet s2 = new OrdSet(9);
            s2.add(0);
            s2.add(1);
            s2.add(2);
            s2.add(3);
            s2.add(4);
            s2.add(5);
            s2.add(6);
            s2.add(7);
            s2.add(8);
            OrdSet instance = new OrdSet(9);
            instance.add(0);
            instance.add(1);
            instance.add(2);
            instance.add(3);
            instance.add(4);
            instance.add(5);
            instance.add(6);
            instance.add(7);
            instance.add(8);

            assertEquals(0, instance.equals(s2));

            instance.remove(4);

            assertEquals(-1, instance.equals(s2));

            instance.add(4);
            instance.remove(8);
            assertEquals(-1, instance.equals(s2));

            s2 = new OrdSet(0);
            instance = new OrdSet(0);
            assertEquals(0, instance.equals(s2));

            s2.add(1);
            s2.add(3);
            instance.add(2);
            instance.add(3);
            assertEquals(1, instance.equals(s2));

        } catch (Exception e) {
            assertTrue(false);
        }
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
        try {
            OrdSet s2 = new OrdSet(9);
            s2.add(0);
            s2.add(1);
            s2.add(2);
            s2.add(3);
            s2.add(4);
            s2.add(5);
            s2.add(6);
            s2.add(7);
            s2.add(8);
            OrdSet instance = new OrdSet(9);
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

            assertEquals(true, instance.contains(s2));
            assertEquals(false, s2.contains(instance));
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    /**
     * Test of remove method, of class OrdSet.
     *
     * @throws br.ufpr.inf.gres.OverflowException
     */
    @Test(expected = OverflowException.class)
    public void testRemove() throws OverflowException {
        OrdSet instance = new OrdSet(3);

        try {
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
        } catch (OverflowException e) {
            instance.remove(0);
        }
    }

    /**
     * Test of add method, of class OrdSet.
     *
     * @throws br.ufpr.inf.gres.OverflowException
     */
    @Test(expected = OverflowException.class)
    public void testAdd() throws OverflowException {
        OrdSet instance = new OrdSet(3);

        try {
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
        } catch (OverflowException e) {
            instance.add(0);
        }
    }

    /**
     * Test of elementAt method, of class OrdSet.
     */
    @Test
    public void testElementAt() {
        try {           
            OrdSet instance = new OrdSet(0);                        
            assertEquals(-1, instance.elementAt(0));

            instance = new OrdSet(9);
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
            
            assertEquals(-1, instance.elementAt(50));
            assertEquals(-1, instance.elementAt(-1));
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    /**
     * Test of union method, of class OrdSet.
     */
    @Test
    public void testUnion() {
        try {
            OrdSet s2 = new OrdSet(9);
            s2.add(0);
            s2.add(1);
            s2.add(2);
            s2.add(3);
            s2.add(4);
            s2.add(5);
            s2.add(6);
            s2.add(7);
            s2.add(8);

            OrdSet instance = new OrdSet(7);
            instance.add(9);
            instance.add(10);
            instance.add(11);
            instance.add(12);
            instance.add(13);
            instance.add(14);
            instance.add(15);

            OrdSet expResult = new OrdSet(16);
            expResult.add(0);
            expResult.add(1);
            expResult.add(2);
            expResult.add(3);
            expResult.add(4);
            expResult.add(5);
            expResult.add(6);
            expResult.add(7);
            expResult.add(8);
            expResult.add(9);
            expResult.add(10);
            expResult.add(11);
            expResult.add(12);
            expResult.add(13);
            expResult.add(14);
            expResult.add(15);

            OrdSet result = instance.union(s2);
            assertEquals(Arrays.toString(expResult.getSetElements()), Arrays.toString(result.getSetElements()));

            result = s2.union(instance);
            assertEquals(Arrays.toString(expResult.getSetElements()), Arrays.toString(result.getSetElements()));

            s2.remove(8);
            s2.add(15);
            expResult.remove(8);
            expResult.add(15);
            result = s2.union(instance);
            assertEquals(expResult.toString(), result.toString());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    /**
     * Test of toString method, of class OrdSet.
     */
    @Test
    public void testToString() {
        try {
            OrdSet instance = new OrdSet(0);
            String expResult = "";
            assertEquals(expResult, instance.toString());

            instance = new OrdSet(7);
            instance.add(9);
            instance.add(10);
            instance.add(11);
            instance.add(12);
            instance.add(13);
            instance.add(14);
            instance.add(15);

            expResult = "9 10 11 12 13 14 15 ";
            assertEquals(expResult, instance.toString());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

}
