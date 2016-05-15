
import com.majesticbyte.neuralnets.ArrayList;
import gui.MainFrame;
import gui.ProgramLister;
import training.TrainingProgram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mkarjanm
 */
public class NetworkTester {
    private final ArrayList<TrainingProgram> programs;
    private MainFrame mainFrame;
    private ProgramLister lister;
    public NetworkTester()
    {
        programs = new ArrayList();
        mainFrame = new MainFrame();
        mainFrame.setList(programs);
        mainFrame.setVisible(true);
        
    }
    public void addProgram(TrainingProgram program)
    {
        programs.add(program);
        mainFrame.getLister().listChanged();
    }
   
}
