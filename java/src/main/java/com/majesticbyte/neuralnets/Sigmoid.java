package com.majesticbyte.neuralnets;

/**
 *
 * @author mkarjanm
 */
public class Sigmoid implements ActivationFunction {

    @Override
    public double calculate(double input) {
        return (1 / (1 + Math.exp(-input)));
    }

    @Override
    public double derivative(double input) {
        return (calculate(input) * (1 - calculate(input)));
    }
}
