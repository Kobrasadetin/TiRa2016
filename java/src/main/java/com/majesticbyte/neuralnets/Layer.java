
package com.majesticbyte.neuralnets;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

/**
 * Layer contains Neurons
 * @author mkarjanm
 */
public class Layer {

    private final List<Neuron> neurons;

    Layer(int inputs, int size, Random rng) {
        neurons = new ArrayList();
        for (int i = 0; i < size; i++) {
            neurons.add(new Neuron(inputs, rng));
        }
    }

    /**
     * returns calculation result for given input and activation function
     * @param input input vector
     * @param activationFunction activation function
     * @return
     */
    public List<Double> getResult(List<Double> input, ActivationFunction activationFunction) {
        ArrayList output = new ArrayList();
        for (Neuron neuron : neurons) {
            output.add(neuron.getResult(input, activationFunction));
        }
        return output;
    }

    /**
     * not implemented
     * @param error
     */
    public void backpropagateError(double error) {
        assert (false);//not implemented
    }

}
