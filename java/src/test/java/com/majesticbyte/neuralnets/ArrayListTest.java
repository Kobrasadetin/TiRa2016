/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majesticbyte.neuralnets;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mkarjanm
 */
public class ArrayListTest {
    
    public ArrayListTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        ArrayList instance = new ArrayList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }

    @Test
    public void testSize() {
        System.out.println("size");
        ArrayList instance = new ArrayList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayList instance = new ArrayList();
        instance.clear();
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        ArrayList instance = new ArrayList();
        boolean expResult = false;
        boolean result = instance.add(item);
        assertEquals(expResult, result);
    }

    @Test
    public void testIterator() {
        System.out.println("iterator");
        ArrayList instance = new ArrayList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
    }
    
}
