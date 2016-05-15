/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.majesticbyte.neuralnets.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import training.TrainingProgram;

/**
 *
 * @author mkarjanm
 */
public class ProgramLister implements ListModel<String>{
    
    private ArrayList<TrainingProgram> list;
    private final ArrayList<ListDataListener> listeners;

    public ProgramLister() {
        this.list = new ArrayList();
        this.listeners = new ArrayList();
    }
    
    public void setList(ArrayList<TrainingProgram> list)
    {
        this.list = list;
        listChanged();
    }
    
    public void listChanged()
    {
        for (ListDataListener ll: listeners)
        {
            ll.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, getSize()));
        }
    }
   
    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public String getElementAt(int i) {
        return list.get(i).toString();
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
        listeners.add(ll);
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
