/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majesticbyte.neuralnets;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mkarjanm
 */
public class NeuronTest {
    
    public NeuronTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGetResult() {
        System.out.print("getResult: ");
        List<Double> input = new ArrayList<Double>();
        input.add(1000.0);
        Neuron instance = new Neuron(3, new Random());
        double result = instance.getResult(input, new Sigmoid());
        assertTrue(result <= 1 && result >= -1);
        System.out.println(result);
    }
    
    @Test
    public void testCopyContructor() {
        System.out.println("copy constructor");
        List<Double> input = new ArrayList<Double>();
        input.add(1.0);
        input.add(-1.0);
        input.add(0.5);
        Neuron instance = new Neuron(3, new Random());
        Neuron copy = new Neuron(instance);
        double result1 = instance.getResult(input, new Sigmoid());     
        double result2 = copy.getResult(input, new Sigmoid());   
        assertEquals(result1, result2, 0.001);
    }
    
}
