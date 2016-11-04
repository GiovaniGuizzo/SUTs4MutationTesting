/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.inf.gres;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class DoubleLinkedListTest {

    public Class<?> getListItrClass() throws ClassNotFoundException {
        return Class.forName("br.ufpr.inf.gres.DoubleLinkedList$ListItr");
    }

    public Constructor<?> getListItrConstructor() throws ClassNotFoundException, NoSuchMethodException {
        Constructor<?> constructor = getListItrClass().getDeclaredConstructor(DoubleLinkedList.class, int.class);//inner object must know type of outer class           
        constructor.setAccessible(true); //private inner class has private default constructor

        return constructor;
    }

    public Class<?> getEntryClass() throws ClassNotFoundException {
        return Class.forName("br.ufpr.inf.gres.DoubleLinkedList$Entry");
    }

    public Constructor<?> getEntryConstructor() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> innerClass = getEntryClass();
        Constructor<?> constructor = innerClass.getDeclaredConstructor(Object.class, innerClass, innerClass); //inner object must know type of outer class           
        constructor.setAccessible(true); //private inner class has private default constructor

        return constructor;
    }

    @Test
    public void test1() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(0, "DEF");
        assertEquals(instance.modificationCount, 2);
    }

    @Test
    public void test2() {
        try {
            DoubleLinkedList instance = new DoubleLinkedList();

            //creating inner class object
            Class<?> innerClass = getListItrClass();

            Constructor<?> constructor = getListItrConstructor();

            int index = 0; // parameter

            Object child = constructor.newInstance(instance, index);

            //invoking method on inner class object
            Method method = innerClass.getDeclaredMethod("hasNext", new Class<?>[]{});
            method.setAccessible(true);//in case of unaccessible method
            boolean result = (boolean) method.invoke(child, new Object[]{});

            assertSame(false, result);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void test3() {
        try {
            Constructor<?> constructor = getEntryConstructor();

            // Parameters
            Object element = null;    // parameter 1
            Class<?> next = null;     // parameter 2
            Class<?> previous = null; // parameter 3

            Object child = constructor.newInstance(element, next, previous);

            //creating inner class object
            Class<?> innerClass = getEntryClass();

            //invoking method on inner class object
            Method method = innerClass.getDeclaredMethod("nonNullPointers", new Class<?>[]{});
            method.setAccessible(true);//in case of unaccessible method
            boolean result = (boolean) method.invoke(child, new Object[]{});

            assertSame(false, result);
        } catch (Exception e) {            
            assertTrue(false);
        }
    }

    @Test
    public void testRepOK() {
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = true;
        boolean result = instance.repOK();
        assertEquals(expResult, result);
    }

    @Test
    public void testTest() {
        DoubleLinkedList dll = new DoubleLinkedList();
        Object o = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = true;
        boolean result = instance.test(dll, o);
        assertEquals(expResult, result);
    }

//    @Test
//    public void testInList() {
//        System.out.println("inList");
//        DoubleLinkedList.Entry e = null;
//        DoubleLinkedList instance = new DoubleLinkedList();        
//        boolean expResult = false;
//        boolean result = instance.inList(e);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//    @Test
//    public void testGetFirst() {
//        System.out.println("getFirst");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.getFirst();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetLast() {
//        System.out.println("getLast");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.getLast();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRemoveFirst() {
//        System.out.println("removeFirst");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.removeFirst();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRemoveLast() {
//        System.out.println("removeLast");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.removeLast();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddFirst() {
//        System.out.println("addFirst");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        instance.addFirst(o);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddLast() {
//        System.out.println("addLast");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        instance.addLast(o);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testContains() {
//        System.out.println("contains");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        boolean expResult = false;
//        boolean result = instance.contains(o);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSize() {
//        System.out.println("size");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        int expResult = 0;
//        int result = instance.size();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAdd_Object() {
//        System.out.println("add");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        boolean expResult = false;
//        boolean result = instance.add(o);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRemove_Object() {
//        System.out.println("remove");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        boolean expResult = false;
//        boolean result = instance.remove(o);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddAll_Collection() {
//        System.out.println("addAll");
//        Collection c = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        boolean expResult = false;
//        boolean result = instance.addAll(c);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAddAll_int_Collection() {
//        System.out.println("addAll");
//        int index = 0;
//        Collection c = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        boolean expResult = false;
//        boolean result = instance.addAll(index, c);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testClear() {
//        System.out.println("clear");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        instance.clear();
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGet() {
//        System.out.println("get");
//        int index = 0;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.get(index);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSet() {
//        System.out.println("set");
//        int index = 0;
//        Object element = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.set(index, element);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testAdd_int_Object() {
//        System.out.println("add");
//        int index = 0;
//        Object element = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        instance.add(index, element);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testRemove_int() {
//        System.out.println("remove");
//        int index = 0;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.remove(index);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testIndexOf() {
//        System.out.println("indexOf");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        int expResult = 0;
//        int result = instance.indexOf(o);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testLastIndexOf() {
//        System.out.println("lastIndexOf");
//        Object o = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        int expResult = 0;
//        int result = instance.lastIndexOf(o);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testListIterator() {
//        System.out.println("listIterator");
//        int index = 0;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        ListIterator expResult = null;
//        ListIterator result = instance.listIterator(index);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testClone() {
//        System.out.println("clone");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object expResult = null;
//        Object result = instance.clone();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testToArray_0args() {
//        System.out.println("toArray");
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object[] expResult = null;
//        Object[] result = instance.toArray();
//        assertArrayEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testContainsAllInOrder() {
//        System.out.println("containsAllInOrder");
//        Object[] objs = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        boolean expResult = false;
//        boolean result = instance.containsAllInOrder(objs);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testToArray_ObjectArr() {
//        System.out.println("toArray");
//        Object[] a = null;
//        DoubleLinkedList instance = new DoubleLinkedList();
//        Object[] expResult = null;
//        Object[] result = instance.toArray(a);
//        assertArrayEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
}
