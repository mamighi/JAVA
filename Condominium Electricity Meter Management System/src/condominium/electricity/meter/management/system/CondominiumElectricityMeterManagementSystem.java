/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominium.electricity.meter.management.system;

import java.io.FileNotFoundException;

/**
 *
 * @author mohammad
 */
public class CondominiumElectricityMeterManagementSystem {

    /**
     * @param args the command line arguments
     */
    static MainFrame mainFrame;
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        TaskManager ts= new TaskManager();
        ts.createFiles();
        mainFrame=new MainFrame();
        mainFrame.setVisible(true);
    }
    
}
