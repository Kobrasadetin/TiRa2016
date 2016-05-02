/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import com.majesticbyte.neuralnets.NeuralNet;
import java.util.Iterator;
import org.nd4j.linalg.dataset.DataSet;

/**
 *
 * @author mkarjanm
 */
public class BackpropagationTraining {

    public BackpropagationTraining(DataSet dataSet, NeuralNet net) {
        int inputs = dataSet.numInputs();
        int outputs = dataSet.numOutcomes();
        assert (inputs <= net.inputCount());
        System.out.println(inputs);
        System.out.println(outputs);
    }

}
