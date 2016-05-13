/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import com.majesticbyte.neuralnets.NeuralNet;
import org.nd4j.linalg.dataset.DataSet;

/**
 *
 * @author mkarjanm
 */
public interface NetworkTrainer {
    public TrainingResults train(TrainingData dataSet, TrainingSetup setup);
}
