/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Iterator;
import org.nd4j.linalg.dataset.DataSet;

/**
 *
 * @author mkarjanm
 */
public class BackpropagationTraining {

    public BackpropagationTraining(DataSet dataSet) {
        Iterator<DataSet> dataSetIterator = dataSet.iterator(); 
        while (dataSetIterator.hasNext())
        {
            DataSet dataset = dataSetIterator.next();
            System.out.println("DATASET");
            System.out.println(dataset.asList());
        }
    }   
    
}
