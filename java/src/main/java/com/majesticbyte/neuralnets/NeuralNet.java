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

    /**
     *
     * @param structure
     * @param activationFunction
     * @param rng
     */
    public NeuralNet(List<Integer> structure, ActivationFunction activationFunction, Random rng) {
        assert (structure.size() >= 2);
        this.activationFunction = activationFunction;
        layers = new ArrayList();
        for (int i = 1; i < structure.size(); i++) {
            layers.add(new Layer(structure.get(i - 1), structure.get(i), rng));
        }
    }
    
    public  NeuralNet(NeuralNet other)
    {
        this.activationFunction = other.activationFunction;
        this.layers = new ArrayList(other.layers);
    }
    
    public int inputCount()
    {
        return layers.get(0).size();
    }

    /**
     *
     * @param input
     * @return
     */
    public List<Double> getResult(List<Double> input) {
        return recursiveGetResult(input, layers.size() - 1);
    }

    private List<Double> recursiveGetResult(List<Double> input, int layer) {
        if (layer == 0) {
            return layers.get(0).getResult(input, activationFunction);
        } else {
            return layers.get(layer).getResult(recursiveGetResult(input, layer -1), activationFunction);
        }
    }
    
    public void backpropagateError(double[] error)
    {         
        int layerCount = layers.size();
        double[][] deltas = new double[layerCount+1][];
        deltas[layerCount] = error;
        recursiveBackprop(deltas, layers.size()-1);
    }
    
    private void recursiveBackprop(double[][] deltas, int layer) {
        deltas[layer] = new double[layers.get(layer).size()];
        layers.get(layer).backpropagateError(deltas[layer+1], deltas[layer], activationFunction );
        if (layer > 0) {
            recursiveBackprop(deltas, layer-1);
        }
    }
}
