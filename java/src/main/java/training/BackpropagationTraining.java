/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import com.majesticbyte.neuralnets.ArrayList;
import com.majesticbyte.neuralnets.List;
import com.majesticbyte.neuralnets.NeuralNet;
import java.util.Iterator;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.DataSet;

/**
 *
 * @author mkarjanm
 */
public class BackpropagationTraining implements NetworkTrainer{

    private final NeuralNet net;
    public BackpropagationTraining(NeuralNet net) {
        this.net = new NeuralNet(net);
    }

    @Override
    public TrainingResults train(TrainingData dataset, TrainingSetup setup) {
        int inputs = dataset.numInputs();
        int outputs = dataset.numOutcomes();
        int length = dataset.numExamples();
        assert (inputs <= net.inputCount());       
        System.out.println("Training with "+inputs+ " inputs and "+outputs+" outputs. We have "+length+" examples.");
        for(int elapsedEpochs = 0; elapsedEpochs<setup.getEpochs(); elapsedEpochs++)
        {
            int datapoint = elapsedEpochs%length;
            List<Double> input = dataset.getInput(datapoint); 
            List<Double> output = dataset.getOutput(datapoint); 
            //System.out.print("input length "+input.size()+", output length "+output.size());
            //System.out.println(input);
            List<Double> result = net.getResult(input);
            //System.out.println(result);
            double[] error = new double[outputs];
            for (int i = 0; i<outputs; i++)
            {
                error[i] = result.get(i)-output.get(i);
            }
            //TODO
            
        }
        return new TrainingResults(net);
    }
    
    

}
