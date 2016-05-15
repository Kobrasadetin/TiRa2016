
import com.majesticbyte.neuralnets.ArrayList;
import com.majesticbyte.neuralnets.NeuralNet;
import com.majesticbyte.neuralnets.Sigmoid;
import gui.MainFrame;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.deeplearning4j.datasets.iterator.impl.MnistDataSetIterator;
import org.nd4j.linalg.dataset.DataSet;
import training.BackpropagationTraining;
import training.TrainingData;
import training.TrainingProgram;
import training.TrainingSetup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mkarjanm
 */
public class Main {
    
    public static void main(String args[])
    {
        NetworkTester tester = new NetworkTester();       
        Random rng = new Random();
        try {
            MnistDataSetIterator it = new MnistDataSetIterator(5, 100);
            ArrayList<Integer> netStructure = new ArrayList(Arrays.asList(784,256,10));
            NeuralNet net = new NeuralNet(netStructure, new Sigmoid(), rng);
            BackpropagationTraining bp = new BackpropagationTraining(net);
            TrainingSetup setup = new TrainingSetup(bp, 5);
            DataSet set = it.next();
            TrainingProgram p =  new TrainingProgram(setup, new TrainingData(set));
            tester.addProgram(p);

            
            p.run();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
