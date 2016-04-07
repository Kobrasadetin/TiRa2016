
import java.io.IOException;
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
        try {
            MnistDataSetIterator it = new MnistDataSetIterator(5, 100);
            BackpropagationTraining bp = new BackpropagationTraining(it.next());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
