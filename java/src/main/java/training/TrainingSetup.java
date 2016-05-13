/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import com.majesticbyte.neuralnets.NeuralNet;

/**
 *
 * @author mkarjanm
 */
public class TrainingSetup {
    private NetworkTrainer trainer;
    private int epochs;

    public TrainingSetup(NetworkTrainer trainer, int epochs) {
        this.trainer = trainer;
        this.epochs = epochs;
    }

    public NetworkTrainer getTrainer() {
        return trainer;
    }

    public int getEpochs() {
        return epochs;
    }
    
    
}
