package com.majesticbyte.neuralnets;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

/**
 * Neurons are neurons. Later there will be interfaces.
 * @author mkarjanm
 */
public class Neuron {

    private List<Double> weights;

    /**
     * creates a new neuron with random weights
     * @param inputs number of inputs
     */
    public Neuron(int inputs, Random rng) {
        weights = new ArrayList();
        // init all inputs plus bias weight
        for (int i = 0; i < inputs + 1; i++) {
            weights.add(rng.nextDouble() * 2 - 1);
        }
    }

    /**
     * copy constructor
     * @param other
     */
    public Neuron(Neuron other) {
        this.weights = new ArrayList(other.weights);     
    }

    /**
     * generates output from given input
     * @param input the input. Required: input.size() < neuron weights count.
     * @return output
     */
    public double getResult(List<Double> input, ActivationFunction activationFunction) {
        int inputSize = input.size();
        assert (inputSize < weights.size());
        double sum = 0;
        for (int i = 0; i < inputSize; i++) {
            sum += input.get(i) * weights.get(i);
        }
        sum += weights.get(weights.size() - 1); //bias
        return activationFunction.calculate(sum);
    }
}
