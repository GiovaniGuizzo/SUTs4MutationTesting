/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.inf.gres;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        instance.add(0, "AAA");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals(instance.modificationCount, 7);
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
    public void test4() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals(true, instance.repOK());
    }

    @Test
    public void test5() {
        DoubleLinkedList instance = new DoubleLinkedList();
        assertEquals(true, instance.repOK());
    }

    @Test
    public void test6() {
        DoubleLinkedList instance = new DoubleLinkedList();
        ArrayList<String> instance2 = new ArrayList<>();
        instance2.add("ABC");
        instance2.add("DEF");
        instance2.add("FGH");
        instance2.add("IJK");
        instance2.add("LMN");
        instance2.add("OPQ");
        instance.addAll(instance2);
        assertEquals(6, instance.size());
    }

    @Test
    public void test7() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        DoubleLinkedList instance2 = null;
        try {
            instance2 = (DoubleLinkedList) instance.clone();
        } catch (CloneNotSupportedException ex) {
            assertTrue(false);
        }
        assertEquals(instance2.size(), instance.size());
    }

    @Test
    public void test8() {
        DoubleLinkedList instance = new DoubleLinkedList();
        DoubleLinkedList instance2 = null;
        try {
            instance2 = (DoubleLinkedList) instance.clone();
        } catch (CloneNotSupportedException ex) {
            assertTrue(false);
        }
        assertEquals(instance2.size(), instance.size());
    }

    @Test
    public void test9() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals(true, instance.contains("LMN"));
    }

    @Test
    public void test10() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals(true, instance.containsAllInOrder(new String[]{"ABC", "DEF", "FGH", "IJK", "LMN", "OPQ"}));
    }

    @Test
    public void test11() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals(false, instance.containsAllInOrder(new String[]{"DEF", "ABC", "FGH", "IJK", "LMN", "OPQ"}));
    }

    @Test
    public void test12() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals("IJK", instance.get(3));
    }

    @Test
    public void test13() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals("ABC", instance.getFirst());
    }

    @Test
    public void test14() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        assertEquals("OPQ", instance.getLast());
    }

    @Test(expected = NoSuchElementException.class)
    public void test15() {
        DoubleLinkedList instance = new DoubleLinkedList();
        assertEquals("ABC", instance.getFirst());
    }

    @Test(expected = NoSuchElementException.class)
    public void test16() {
        DoubleLinkedList instance = new DoubleLinkedList();
        assertEquals("OPQ", instance.getLast());
    }

    @Test
    public void test17() {
        try {
            DoubleLinkedList instance = new DoubleLinkedList();

            Constructor<?> constructor = getEntryConstructor();

            // Parameters
            Object element = null;    // parameter 1
            Class<?> next = null;     // parameter 2
            Class<?> previous = null; // parameter 3

            Object child = constructor.newInstance(element, next, previous);

            Class<?> innerClass = getEntryClass();

            //invoking method on inner class object
            Method method = instance.getClass().getDeclaredMethod("inList", new Class<?>[]{innerClass});
            method.setAccessible(true);//in case of unaccessible method
            boolean result = (boolean) method.invoke(instance, new Object[]{child});

            assertEquals(false, result);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void test18() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        instance.add("OPQ");
        assertEquals(5, instance.indexOf("OPQ"));
    }

    @Test
    public void test19() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        instance.add("OPQ");
        assertEquals(6, instance.lastIndexOf("OPQ"));
    }

    @Test
    public void test20() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");

        ListIterator list = instance.listIterator(2);
        assertEquals("FGH", list.next().toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test21() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");

        ListIterator list = instance.listIterator(-1);
        assertEquals("", list.next());
    }

    @Test
    public void test22() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");

        instance.remove("ABC");
        assertEquals(5, instance.size());
    }

    @Test
    public void test23() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");

        instance.remove(5);

        assertEquals(5, instance.size());
    }

    @Test
    public void test24() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");

        assertEquals("ABC", instance.removeFirst());
    }

    @Test
    public void test25() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");

        assertEquals("OPQ", instance.removeLast());
    }

    @Test(expected = NoSuchElementException.class)
    public void test26() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.removeFirst();
        assertEquals(true, instance.repOK());
    }

    @Test
    public void test27() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.removeFirst();
        instance.removeLast();
        assertEquals(true, instance.repOK());
    }

    @Test
    public void test28() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.removeFirst();
        instance.addFirst("FGH");
        instance.removeLast();
        assertEquals("FGH", instance.getFirst());
    }

    @Test
    public void test29() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.removeFirst();
        instance.addFirst("FGH");
        instance.addLast("FGH");
        instance.removeLast();
        assertEquals("FGH", instance.getLast());
    }

    @Test
    public void test30() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");

        instance.set(1, "AAA");

        assertEquals("AAA", instance.get(1));
    }

    @Test
    public void test31() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");

        instance.set(1, "AAA");

        assertEquals(3, instance.size());
    }

    @Test
    public void test32() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");

        assertEquals(true, instance.test(instance, "AAA"));
    }

    @Test
    public void test33() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");

        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH"}, instance.toArray());
    }

    @Test
    public void test34() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");

        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH"}, instance.toArray(new Object[]{"ABC"}));
    }

    @Test
    public void test35() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");

        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH", null}, instance.toArray(new Object[]{"ABC", "DEF", "FGH", "IJK"}));
    }

    @Test
    public void test36() {
        DoubleLinkedList instance = new DoubleLinkedList();
        Object[] expResult = new Object[]{};
        Object[] result = instance.toArray();
        assertEquals(expResult.length, result.length);
    }

    @Test
    public void test37() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(0, "B");
        list.add(1, "C");
        list.add(2, "D");
        list.add(3, "A");

        assertEquals(list.indexOf("A"), 3);

        list.remove(3);
        assertEquals(list.get(0), "B");
        assertEquals(list.size(), 3);
        assertEquals(list.indexOf("C"), 1);

        Object removed = list.remove(1);
        assertNotNull(removed);
        assertTrue(removed.equals("C"));

        list.add(1, "E");
        assertEquals(list.size(), 3);
        assertNotNull(list.get(1));
        assertTrue(list.get(1).equals("E"));

        list.set(1, "F");
        assertNotNull(list.get(1));
        assertTrue(list.get(1).equals("F"));

        list.add(0, "G");
        assertEquals(4, list.size());

        ListIterator iterator = list.listIterator(0);

        assertEquals(iterator.next().toString(), "G");
        assertEquals(iterator.next().toString(), "B");
        assertEquals(iterator.previous().toString(), "B");
        assertEquals(iterator.previous().toString(), "G");
        assertEquals(iterator.next().toString(), "G");
    }

    @Test
    public void test38() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");
        instance.remove(null);
        assertEquals(2, instance.size());
    }

    @Test
    public void test39() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");
        assertEquals(false, instance.remove("HHH"));
    }

    @Test
    public void test40() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");

        assertEquals(1, instance.lastIndexOf(null));
    }

    @Test
    public void test41() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");

        assertEquals(-1, instance.lastIndexOf("HH"));
    }

    @Test
    public void test42() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");

        assertEquals(1, instance.indexOf(null));
    }

    @Test
    public void test43() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");

        assertEquals(-1, instance.indexOf("HH"));
    }

    @Test
    public void test44() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add("OPQ");
        instance.clear();
        assertEquals(0, instance.size());
    }

    @Test
    public void test45() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");

        assertEquals(false, instance.contains("HH"));
    }

    @Test
    public void test46() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add(null);
        instance.add("FGH");

        assertEquals(true, instance.contains(null));
    }

    @Test
    public void test47() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add(null);
        assertEquals(5, instance.indexOf(null));
    }

    @Test
    public void test48() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add("LMN");
        instance.add(null);
        assertEquals(5, instance.lastIndexOf(null));
    }

    @Test
    public void test49() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add(null);
        instance.add("LMN");
        assertEquals(4, instance.indexOf(null));
    }

    @Test
    public void test50() {
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.add("ABC");
        instance.add("DEF");
        instance.add("FGH");
        instance.add("IJK");
        instance.add(null);
        instance.add("LMN");
        assertEquals(4, instance.lastIndexOf(null));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test51() {
        DoubleLinkedList instance = new DoubleLinkedList();
        ArrayList<String> instance2 = new ArrayList<>();
        instance2.add("ABC");
        instance2.add("DEF");
        instance2.add("FGH");
        instance2.add("IJK");
        instance2.add("LMN");
        instance2.add("OPQ");
        instance.addAll(-1, instance2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test52() {
        DoubleLinkedList instance = new DoubleLinkedList();
        ArrayList<String> instance2 = new ArrayList<>();
        instance2.add("ABC");
        instance2.add("DEF");
        instance2.add("FGH");
        instance2.add("IJK");
        instance2.add("LMN");
        instance2.add("OPQ");
        instance.addAll(10, instance2);
    }

    @Test
    public void test53() {

        ArrayList<String> instance2 = new ArrayList<>();
        instance2.add("ABC");
        instance2.add("DEF");
        instance2.add("FGH");
        instance2.add("IJK");
        instance2.add("LMN");
        instance2.add("OPQ");

        DoubleLinkedList instance = new DoubleLinkedList(instance2);
        assertEquals(instance2.size(), instance.size());
    }

    @Test
    public void test54() {
        ArrayList<String> instance2 = new ArrayList<>();
        DoubleLinkedList instance = new DoubleLinkedList();
        assertEquals(false, instance.addAll(instance2));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void test55() {
        DoubleLinkedList instance = new DoubleLinkedList();
        Object o1 = 1;
        instance.add(o1);
        ListIterator e = instance.listIterator(0);
        e.next();
        Object o2 = 2;
        instance.add(o2);

        e.remove();
    }

    @Test
    public void test56() {
        DoubleLinkedList list = new DoubleLinkedList();
        ListIterator e = list.listIterator(0);
        Object o = 1;
        e.add(o);
        e.previous();
        e.next();
        e.remove();
        e.add(o);
        assertTrue(o.equals(list.get(0)));
    }

    @Test
    public void test57() {
        DoubleLinkedList q = new DoubleLinkedList();
        q.add("ABC");
        q.add("DEF");
        q.add("FGH");
        q.add("IJK");
        q.add(null);
        q.add("LMN");

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(q);
            out.flush();
            byte[] yourBytes = bos.toByteArray();

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(yourBytes));
            DoubleLinkedList q2 = (DoubleLinkedList) ois.readObject();

            assertEquals(q.size(), q2.size());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            assertTrue(false);
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                assertTrue(false);
            }
        }
    }

//    @Test
//    public void test38() {
//        //private writeObject
////        DoubleLinkedList instance = new DoubleLinkedList();
////        instance.add("ABC");
////        instance.add("DEF");
////        instance.add("FGH");
////
////        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH", null}, instance.toArray(new Object[]{"ABC", "DEF", "FGH", "IJK"}));
//    }
//      @Test
//    public void test39() {
//        //private readObject
////        DoubleLinkedList instance = new DoubleLinkedList();
////        instance.add("ABC");
////        instance.add("DEF");
////        instance.add("FGH");
////
////        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH", null}, instance.toArray(new Object[]{"ABC", "DEF", "FGH", "IJK"}));
//    }
}
