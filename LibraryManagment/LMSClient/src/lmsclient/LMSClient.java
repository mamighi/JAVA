/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmsclient;

import java.rmi.Naming;
import java.rmi.RemoteException;
import IntefacePackage.LMSInterface;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author mohammad
 */
public class LMSClient {

    /**
     * @param args the command line arguments
     */
    
    public static LMSInterface look_up;
    static MainFrame mf;
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        // TODO code application logic here
        Registry reg=LocateRegistry.getRegistry("localhost",1099);
        look_up = (LMSInterface) reg.lookup("MYSERVER");
        mf=new MainFrame();
        mf.setVisible(true);
    }
    
}
