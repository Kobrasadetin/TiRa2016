
package com.majesticbyte.neuralnets;

import java.util.ArrayList;
import java.util.List;

/**
 * Layer contains Neurons
 * @author mkarjanm
 */
public class Layer {

    private final List<Neuron> neurons;

    Layer(int inputs, int size) {
        neurons = new ArrayList();
        for (int i = 0; i < size; i++) {
            neurons.add(new Neuron(inputs));
        }
    }

    public List<Double> getResult(List<Double> input) {
        ArrayList output = new ArrayList();
        for (Neuron neuron : neurons) {
            output.add(neuron.getResult(input));
        }
        return output;
    }

    public void backpropagateError(double error) {
        assert (false);//not implemented
    }

}
