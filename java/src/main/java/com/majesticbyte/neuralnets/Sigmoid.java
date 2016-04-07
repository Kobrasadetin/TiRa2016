/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.majesticbyte.neuralnets;

/**
 *
 * @author mkarjanm
 */
public class Sigmoid implements ActivationFunction {
    @Override
    public double calculate(double input)
    {
        return (1 / (1 + Math.exp(-input)));
    }
}
