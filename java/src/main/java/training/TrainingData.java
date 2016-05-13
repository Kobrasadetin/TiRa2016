/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import com.majesticbyte.neuralnets.ArrayList;
import com.majesticbyte.neuralnets.List;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.DataSet;

/**
 *
 * @author mkarjanm
 */
public class TrainingData {

    private final int size;
    private final int inputs;
    private final int outputs;
    private final List<List<Double>> input;
    private final List<List<Double>> output;

    public TrainingData(DataSet dataset) {
        this.size = dataset.numExamples();
        this.inputs = dataset.numInputs();
        this.outputs = dataset.numOutcomes();
        this.input = new ArrayList<List<Double>>();
        this.output = new ArrayList<List<Double>>();
        for (int i = 0; i < size; i++) {
            ArrayList features = INDArrayToDoubleList(dataset.get(i).getFeatures());
            ArrayList outcomes = INDArrayToDoubleList(dataset.get(i).getLabels());
            input.add(features);
            output.add(outcomes);
        }
    }

    public int numExamples() {
        return size;
    }

    public int numInputs() {
        return inputs;
    }

    public int numOutcomes() {
        return outputs;
    }
    
    
    
    public List<Double> getInput(int index)
    {
        return input.get(index);
    }
    
    public List<Double> getOutput(int index)
    {
        return output.get(index);
    }

    private ArrayList<Double> INDArrayToDoubleList(INDArray indArray) {
        ArrayList result = new ArrayList<Double>();
        int count = indArray.length();
        for (int a = 0; a < count; a++) {
            result.add(indArray.getDouble(a));
        }
        return result;
    }
}
