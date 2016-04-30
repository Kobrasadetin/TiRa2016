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
    
    ArrayList<Double> instance;
    
    public ArrayListTest() {
    }
    
    @Before
    public void setUp() {
        instance = new ArrayList();
    }

    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        instance.add(6d);
        Object expResult = 6d;
        Object result = instance.get(index);
        assertEquals(expResult, result);
    }

    @Test
    public void testSize() {
        System.out.println("size");      
        int expResult = 256;
        for (int i = 0; i<256; i++)
        {
            instance.add(1d);
        }
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCopyconstructor() {
        System.out.println("copyConstructor");      
        int expResult = 256;
        for (int i = 0; i<256; i++)
        {
            instance.add(new Double(i+1233));
        }
        ArrayList copy = new ArrayList(instance);
        int i = 0;
        for(Double d : instance)
        {
             assertEquals(d, copy.get(i++));
        }
    }

    @Test
    public void testClear() {
        System.out.println("clear");
        for (int i = 0; i<256; i++)
        {
            instance.add(1d);
        }
        instance.clear();
        assertEquals(0, instance.size());
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = null;
        instance.add(1d);
        instance.add(2d);
        assertEquals((Double)1d, instance.get(0));
        assertEquals((Double)2d, instance.get(1));
    }

    @Test
    public void testIterator() {
        System.out.println("iterator");
        for (int i = 0; i<256; i++)
        {
            instance.add(new Double(i));
        }
        Iterator iterator = instance.iterator();
        int i = 0;
        while (iterator.hasNext())
        {
            assertEquals(new Double(i), iterator.next());
            i++;
        }
        assertEquals(256, i);
    }


    
}
