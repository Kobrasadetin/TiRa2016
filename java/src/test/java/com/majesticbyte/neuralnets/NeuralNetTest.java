/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majesticbyte.neuralnets;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mkarjanm
 */
public class NeuralNetTest {

    NeuralNet instance;

    public NeuralNetTest() {
    }

    @Before
    public void setUp() {
        List<Integer> structure = new ArrayList();
        structure.add(4);
        structure.add(2);
        structure.add(1);
        ActivationFunction activationFunction = new Sigmoid();
        instance = new NeuralNet(structure, activationFunction, new Random());
    }

    @Test
    public void testGetResult() {
        System.out.println("getResult");
        List<Double> input = new ArrayList();
        for (int i = 0; i < 4; i++) {
            input.add(1d);
        }
        List<Double> result = instance.getResult(input);
        assertTrue(result != null);
    }
    @Test
    public void testCopyConstructor() {
        System.out.println("getResult");
        List<Double> input = new ArrayList();
        for (int i = 0; i < 4; i++) {
            input.add(1d);
        }
        NeuralNet copy = new NeuralNet(instance);
        List<Double> result = instance.getResult(input);
        List<Double> result2 = copy.getResult(input);       
        assertEquals(result.get(0), result2.get(0));
    }

}
