package com.majesticbyte.neuralnets;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;

/**
 * NeuralNet consists of Layers
 * @author mkarjanm
 */
public class NeuralNet {

    private final List<Layer> layers;
    private ActivationFunction activationFunction;

    public NeuralNet(List<Integer> structure, ActivationFunction activationFunction, Random rng) {
        assert (structure.size() >= 2);
        this.activationFunction = activationFunction;
        layers = new ArrayList();
        for (int i = 1; i < structure.size() - 1; i++) {
            layers.add(new Layer(structure.get(i - 1), structure.get(i), rng));
        }
    }

    public List<Double> getResult(List<Double> input) {
        return recursiveGetResult(input, layers.size() - 1);
    }

    private List<Double> recursiveGetResult(List<Double> input, int layer) {
        if (layer == 0) {
            return layers.get(0).getResult(input, activationFunction);
        } else {
            return layers.get(layer).getResult(recursiveGetResult(input, layer), activationFunction);
        }
    }
}
