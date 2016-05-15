/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import org.nd4j.linalg.dataset.DataSet;

/**
 *
 * @author mkarjanm
 */
public class TrainingProgram {
    private TrainingSetup setup;
    private TrainingData dataset;

    public TrainingProgram(TrainingSetup setup, TrainingData dataset) {
        this.setup = setup;
        this.dataset = dataset;
    }
    
    public TrainingResults run()
    {
        return setup.getTrainer().train(dataset, setup);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(setup.toString());
        sb.append(dataset.toString());
        return sb.toString();
    }
}
