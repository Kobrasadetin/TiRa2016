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
public interface ActivationFunction {

    double calculate(double input);
    double derivative(double input);
}
