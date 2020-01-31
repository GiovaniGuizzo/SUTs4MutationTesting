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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class LinkedListTest {

    /**
     * Test of linkLast method, of class LinkedList.
     */
    @Test
    public void testLinkLast() {
        Object e = null;
        LinkedList instance = populatedQueue(SIZE);
        instance.linkLast(e);
        assertEquals(e, instance.getLast());
    }

    /**
     * Test of linkBefore method, of class LinkedList.
     */
    @Test
    public void testLinkBefore() {
        LinkedList instance = populatedQueue(SIZE);
        instance.add(0, 10);
        assertEquals(10, instance.get(0));
        assertEquals(0, instance.indexOf(10));
    }

    /**
     * The number of elements to place in collections, arrays, etc.
     */
    static final int SIZE = 20;

    /**
     * Create a queue of given size containing consecutive Integers 0 ... n.
     */
    private LinkedList populatedQueue(int n) {
        LinkedList q = new LinkedList();
        assertTrue(q.isEmpty());
        for (int i = 0; i < n; ++i) {
            assertTrue(q.offer(i));
        }
        assertFalse(q.isEmpty());
        assertEquals(n, q.size());
        return q;
    }

    /**
     * new queue is empty
     */
    @Test
    public void testConstructor1() {
        assertEquals(0, new LinkedList().size());
    }

    /**
     * Initializing from null Collection throws NPE
     */
    @Test
    public void testConstructor3() {
        try {
            LinkedList q = new LinkedList((Collection) null);
            assertTrue(false);
        } catch (NullPointerException success) {
            assertTrue(true);
        }
    }

    /**
     * Queue contains all elements of collection used to initialize
     *
     */
    @Test
    public void testConstructor6() {
        try {
            Integer[] ints = new Integer[SIZE];
            for (int i = 0; i < SIZE; ++i) {
                ints[i] = i;
            }
            LinkedList q = new LinkedList(Arrays.asList(ints));
            for (int i = 0; i < SIZE; ++i) {
                assertEquals(ints[i], q.poll());
            }
        } finally {
        }
    }

    /**
     * isEmpty is true before add, false after
     */
    @Test
    public void testEmpty() {
        LinkedList q = new LinkedList();
        assertTrue(q.isEmpty());
        q.add(1);
        assertFalse(q.isEmpty());
        q.add(2);
        q.remove();
        q.remove();
        assertTrue(q.isEmpty());
    }

    /**
     * size changes when elements added and removed
     */
    @Test
    public void testSize() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(SIZE - i, q.size());
            q.remove();
        }
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, q.size());
            q.add(i);
        }
    }

    /**
     * offer(null) succeeds
     */
    @Test
    public void testOfferNull() {
        try {
            LinkedList q = new LinkedList();
            q.offer(null);
            assertTrue(true);
        } catch (NullPointerException ie) {
            assertTrue(false);
        }
    }

    /**
     * Offer succeeds
     */
    @Test
    public void testOffer() {
        LinkedList q = new LinkedList();
        assertTrue(q.offer(0));
        assertTrue(q.offer(1));
    }

    /**
     * add succeeds
     */
    @Test
    public void testAdd() {
        LinkedList q = new LinkedList();
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, q.size());
            assertTrue(q.add(i));
        }
    }

    /**
     * addAll(null) throws NPE
     */
    @Test
    public void testAddAll1() {
        try {
            LinkedList q = new LinkedList();
            q.addAll(null);
            assertTrue(false);
        } catch (NullPointerException success) {
            assertTrue(true);
        }
    }

    /**
     * Queue contains all elements, in traversal order, of successful addAll
     */
    @Test
    public void testAddAll5() {
        try {
            Integer[] empty = new Integer[0];
            Integer[] ints = new Integer[SIZE];
            for (int i = 0; i < SIZE; ++i) {
                ints[i] = i;
            }
            LinkedList q = new LinkedList();
            assertFalse(q.addAll(Arrays.asList(empty)));
            assertTrue(q.addAll(Arrays.asList(ints)));
            for (int i = 0; i < SIZE; ++i) {
                assertEquals(ints[i], q.poll());
            }
        } finally {
        }
    }

    /**
     * addAll with too large an index throws IOOBE
     */
    @Test
    public void testAddAll2_IndexOutOfBoundsException() {
        try {
            LinkedList l = new LinkedList();
            l.add(new Object());
            LinkedList m = new LinkedList();
            m.add(new Object());
            l.addAll(4, m);
            assertTrue(false);
        } catch (IndexOutOfBoundsException success) {
            assertTrue(true);
        }
    }

    /**
     * addAll with negative index throws IOOBE
     */
    @Test
    public void testAddAll4_BadIndex() {
        try {
            LinkedList l = new LinkedList();
            l.add(new Object());
            LinkedList m = new LinkedList();
            m.add(new Object());
            l.addAll(-1, m);
            assertTrue(false);
        } catch (IndexOutOfBoundsException success) {
            assertTrue(true);
        }
    }

    /**
     * poll succeeds unless empty
     */
    @Test
    public void testPoll() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, ((Integer) q.poll()).intValue());
        }
        assertNull(q.poll());
    }

    /**
     * peek returns next element, or null if empty
     */
    @Test
    public void testPeek() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, ((Integer) q.peek()).intValue());
            q.poll();
            assertTrue(q.peek() == null
                    || i != ((Integer) q.peek()).intValue());
        }
        assertNull(q.peek());
    }

    /**
     * element returns next element, or throws NSEE if empty
     */
    @Test
    public void testElement() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, ((Integer) q.element()).intValue());
            q.poll();
        }
        try {
            q.element();
            assertTrue(false);
        } catch (NoSuchElementException success) {
            assertTrue(true);
        }
    }

    /**
     * remove removes next element, or throws NSEE if empty
     */
    @Test
    public void testRemove() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, ((Integer) q.remove()).intValue());
        }
        try {
            q.remove();
            assertTrue(false);
        } catch (NoSuchElementException success) {
            assertTrue(true);
        }
    }

    /**
     * remove(x) removes x and returns true if present
     */
    @Test
    public void testRemoveElement() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 1; i < SIZE; i += 2) {
            assertTrue(q.remove(new Integer(i)));
        }
        for (int i = 0; i < SIZE; i += 2) {
            assertTrue(q.remove(new Integer(i)));
            assertFalse(q.remove(new Integer(i + 1)));
        }
        assertTrue(q.isEmpty());
    }

    /**
     * contains(x) reports true when elements added but not yet removed
     */
    @Test
    public void testContains() {
        LinkedList q = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertTrue(q.contains(i));
            q.poll();
            assertFalse(q.contains(i));
        }
    }

    /**
     * clear removes all elements
     */
    @Test
    public void testClear() {
        LinkedList q = populatedQueue(SIZE);
        q.clear();
        assertTrue(q.isEmpty());
        assertEquals(0, q.size());
        q.add(1);
        assertFalse(q.isEmpty());
        q.clear();
        assertTrue(q.isEmpty());
    }

    /**
     * containsAll(c) is true when c contains a subset of elements
     */
    @Test
    public void testContainsAll() {
        LinkedList q = populatedQueue(SIZE);
        LinkedList p = new LinkedList();
        for (int i = 0; i < SIZE; ++i) {
            assertTrue(q.containsAll(p));
            assertFalse(p.containsAll(q));
            p.add(i);
        }
        assertTrue(p.containsAll(q));
    }

    /**
     * retainAll(c) retains only those elements of c and reports true if changed
     */
    @Test
    public void testRetainAll() {
        LinkedList q = populatedQueue(SIZE);
        LinkedList p = populatedQueue(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            boolean changed = q.retainAll(p);
            if (i == 0) {
                assertFalse(changed);
            } else {
                assertTrue(changed);
            }

            assertTrue(q.containsAll(p));
            assertEquals(SIZE - i, q.size());
            p.remove();
        }
    }

    /**
     * removeAll(c) removes only those elements of c and reports true if changed
     */
    @Test
    public void testRemoveAll() {
        for (int i = 1; i < SIZE; ++i) {
            LinkedList q = populatedQueue(SIZE);
            LinkedList p = populatedQueue(i);
            assertTrue(q.removeAll(p));
            assertEquals(SIZE - i, q.size());
            for (int j = 0; j < i; ++j) {
                Integer I = (Integer) (p.remove());
                assertFalse(q.contains(I));
            }
        }
    }

    /**
     * toArray contains all elements
     */
    @Test
    public void testToArray() {
        LinkedList q = populatedQueue(SIZE);
        Object[] o = q.toArray();
        Arrays.sort(o);
        for (int i = 0; i < o.length; i++) {
            assertEquals(o[i], q.poll());
        }
    }

    /**
     * toArray(a) contains all elements
     */
    @Test
    public void testToArray2() {
        LinkedList q = populatedQueue(SIZE);
        Integer[] ints = new Integer[SIZE];
        ints = (Integer[]) q.toArray(ints);
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            assertEquals(ints[i], q.poll());
        }
    }

    /**
     * toArray(null) throws NPE
     */
    @Test
    public void testToArray_BadArg() {
        try {
            LinkedList l = new LinkedList();
            l.add(new Object());
            Object o[] = l.toArray(null);
            assertTrue(false);
        } catch (NullPointerException success) {
            assertTrue(true);
        }
    }

    /**
     * toArray with incompatable aray type throws CCE
     */
    @Test
    public void testToArray1_BadArg() {
        try {
            LinkedList l = new LinkedList();
            l.add(new Integer(5));
            Object o[] = l.toArray(new String[10]);
            assertTrue(false);
        } catch (ArrayStoreException success) {
            assertTrue(true);
        }
    }

    /**
     * iterator iterates through all elements
     */
    @Test
    public void testIterator() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        Iterator it = q.iterator();
        while (it.hasNext()) {
            assertTrue(q.contains(it.next()));
            ++i;
        }
        assertEquals(i, SIZE);
    }

    /**
     * iterator iterates through all elements
     */
    @Test
    public void testDescendingIterator() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        Iterator it = q.descendingIterator();
        while (it.hasNext()) {
            assertTrue(q.contains(it.next()));
            it.remove();
            ++i;
        }
        assertEquals(i, SIZE);
    }

    /**
     * iterator ordering is FIFO
     */
    @Test
    public void testIteratorOrdering() {
        final LinkedList q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        int k = 0;
        for (Iterator it = q.iterator(); it.hasNext();) {
            int i = ((Integer) (it.next())).intValue();
            assertEquals(++k, i);
        }

        assertEquals(3, k);
    }

    /**
     * iterator.remove removes current element
     */
    @Test
    public void testIteratorRemove() {
        final LinkedList q = new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        Iterator it = q.iterator();
        it.next();
        it.remove();
        it = q.iterator();
        assertEquals(it.next(), 2);
        assertEquals(it.next(), 3);
        assertFalse(it.hasNext());
    }

    /**
     * iterator iterates through all elements
     */
    @Test
    public void testListIterator() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        ListIterator it = q.listIterator();
        while (it.hasNext()) {
            assertTrue(q.contains(it.next()));
            ++i;
            assertEquals(i, it.nextIndex());
        }
        assertEquals(i, SIZE);

        while (it.hasPrevious()) {
            assertTrue(q.contains(it.previous()));
            --i;
            assertEquals(i - 1, it.previousIndex());
        }

        q.clear();
        it = q.listIterator();
        it.add(1);
        assertEquals(0, it.previousIndex());
    }

    /**
     * iterator iterates through all elements
     */
    @Test(expected = ConcurrentModificationException.class)
    public void testListIterator2() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        ListIterator it = q.listIterator();
        q.remove();
        it.remove();
    }

    /**
     * iterator iterates through all elements
     */
    @Test(expected = IllegalStateException.class)
    public void testListIterator3() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        ListIterator it = q.listIterator();
        it.add(99);
        it.set(500);
        assertTrue(true);
    }

    /**
     * iterator iterates through all elements
     */
    @Test(expected = NoSuchElementException.class)
    public void testListIterator4() {
        LinkedList q = populatedQueue(SIZE);
        q.clear();
        ListIterator it = q.listIterator();
        Object o = it.previous();
    }

    /**
     * iterator iterates through all elements
     */
    @Test
    public void testListIterator5() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        ListIterator it = q.listIterator();
        it.next();
        it.set(500);
    }

    /**
     * iterator iterates through all elements
     */
    @Test(expected = IllegalStateException.class)
    public void testListIterator6() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        q.clear();
        ListIterator it = q.listIterator();
        it.remove();
    }

    /**
     * iterator iterates through all elements
     */
    @Test(expected = NoSuchElementException.class)
    public void testListIterator7() {
        LinkedList q = populatedQueue(SIZE);
        int i = 0;
        q.clear();
        ListIterator it = q.listIterator();
        it.next();
    }

    /**
     * toString contains toStrings of elements
     */
    @Test
    public void testToString() {
        LinkedList q = populatedQueue(SIZE);
        String s = q.toString();
        for (int i = 0; i < SIZE; ++i) {
            assertTrue(s.indexOf(String.valueOf(i)) >= 0);
        }
    }

    /**
     * peek returns element inserted with addFirst
     */
    @Test
    public void testAddFirst() {
        LinkedList q = populatedQueue(3);
        q.addFirst(4);
        assertEquals(4, q.peek());
    }

    @Test
    public void remove() {
        LinkedList q = populatedQueue(3);
        q.add(10);
        q.add(10);
        q.removeLastOccurrence(10);
        q.remove((Object) 10);
        q.remove(1);
        q.removeLast();
        assertFalse(q.removeLastOccurrence(2500));
        q.removeLastOccurrence(null);
        q.add(null);
        q.removeLastOccurrence(null);
        q.add(500);
        q.removeFirstOccurrence(500);
        q.removeFirst();
        q.clear();
        try {
            q.removeLast();
            assertTrue(false);
        } catch (NoSuchElementException e) {
            assertTrue(true);
        }
        q.add("ABC");
        q.add("DEF");
        q.add("GHI");
        q.add(null);
        q.add("JKL");
        q.add("MNO");
        q.remove("GHI");
        q.remove(null);
        q.clear();
        q.add(null);
        q.add("ABC");
        q.add("DEF");
        q.add("GHI");
        q.remove(null);
        assertTrue(true);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        LinkedList q = populatedQueue(3);
        q.get(-1);
    }

    @Test
    public void testIndex() {
        LinkedList q = new LinkedList();
        q.add("ABC");
        q.add("DEF");
        q.add("GHI");
        q.add("JKL");
        q.add("MNO");
        assertEquals(0, q.lastIndexOf("ABC"));
        q.clear();
        q.add("ABC");
        q.add(null);
        q.add(null);
        q.add("DEF");
        q.add("GHI");
        assertEquals(2, q.lastIndexOf(null));
        assertEquals(1, q.indexOf(null));
        assertEquals(-1, q.lastIndexOf("AAA"));
    }

    @Test
    public void testClone() {
        LinkedList q = populatedQueue(SIZE);
        LinkedList q2 = null;
        try {
            q2 = (LinkedList) q.clone();
        } catch (CloneNotSupportedException ex) {
            assertTrue(false);
        }
        assertEquals(q.size(), q2.size());
    }

    @Test
    public void testSerialize() {
        LinkedList q = populatedQueue(SIZE);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(q);
            out.flush();
            byte[] yourBytes = bos.toByteArray();

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(yourBytes));
            LinkedList q2 = (LinkedList) ois.readObject();

            assertEquals(q.size(), q2.size());
        } catch (IOException | ClassNotFoundException ex) {
            assertTrue(false);
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                assertTrue(false);
            }
        }
    }

    @Test
    public void testManipulation() {
        LinkedList q = populatedQueue(SIZE);
        q.set(0, 10);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(15);
        a.add(20);
        q.addAll(1, a);
        assertEquals(q.size(), 22);
        assertEquals(10, q.peekFirst());
        assertEquals(10, q.pollFirst());
        assertEquals(q.size(), 21);
        assertEquals(19, q.peekLast());
        assertEquals(19, q.pollLast());
        assertEquals(20, q.size());

        q.clear();
        q.add("ABC");
        q.add("DEF");
        q.add("FGH");

        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH"}, q.toArray(new Object[]{"ABC"}));
        assertArrayEquals(new Object[]{"ABC", "DEF", "FGH", null}, q.toArray(new Object[]{"ABC", "DEF", "FGH", "IJK"}));

        q.offer("AAA");
        assertEquals("AAA", q.getLast());
        q.offerFirst("YYY");
        assertEquals("YYY", q.getFirst());
        q.offerLast("YYY");
        assertEquals("YYY", q.getLast());
        
        q.clear();
        q.push("ABC");
        assertEquals("ABC", q.pollLast());
        q.add(0, "DEF");
        assertEquals(1, q.size());
        q.add(1, "XYZ");
        
        assertEquals("DEF", q.pop());
        q.clear();        
        q.add(null);
        q.add(null);
        q.add(null);
        q.add(null);
        q.add(null);
        q.add(0, null);
        q.add(1, "ABC");
        assertEquals(null, q.pollFirst());
        q = new LinkedList();
        assertEquals(null, q.pollFirst());
        assertEquals(null, q.peekFirst());
        assertEquals(null, q.pollLast());
        assertEquals(null, q.peekLast());
        assertEquals(false, q.remove(null));        
        assertEquals(-1, q.lastIndexOf(null));
        assertEquals(-1, q.indexOf(null));
        try {
            LinkedList q2 = (LinkedList)q.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(LinkedListTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test(expected = NoSuchElementException.class)
    public void getLast(){
        LinkedList q = new LinkedList();
        q.getLast();
    }
}
