
import com.majesticbyte.neuralnets.ArrayList;
import com.majesticbyte.neuralnets.NeuralNet;
import com.majesticbyte.neuralnets.Sigmoid;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.deeplearning4j.datasets.iterator.impl.MnistDataSetIterator;
import training.BackpropagationTraining;

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
        Random rng = new Random();
        try {
            MnistDataSetIterator it = new MnistDataSetIterator(5, 100);
            ArrayList<Integer> netStructure = new ArrayList(Arrays.asList(784,256,10));
            NeuralNet net = new NeuralNet(netStructure, new Sigmoid(), rng);
            BackpropagationTraining bp = new BackpropagationTraining(it.next(), net);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
