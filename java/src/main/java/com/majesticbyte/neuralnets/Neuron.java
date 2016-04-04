package com.majesticbyte.neuralnets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Neurons are neurons. Later there will be interfaces.
 * @author mkarjanm
 */
public class Neuron {

    private List<Double> weights;

    public Neuron(int inputs) {
        Random r = new Random();
        weights = new ArrayList();
        // init all inputs plus bias weight
        for (int i = 0; i < inputs + 1; i++) {
            weights.add(r.nextDouble() * 2 - 1);
        }
    }

    public Neuron(Neuron other) {
        assert (false);//not implemented
    }

    public double getResult(List<Double> input) {
        double sum = 0;
        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i) * weights.get(i);
        }
        sum += weights.get(weights.size() - 1); //bias
        return sigmoid(sum);
    }

    private double sigmoid(double input) {
        return (1 / (1 + Math.exp(-input)));
    }
}
