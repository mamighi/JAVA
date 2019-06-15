/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.ticket.selling.system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;

/**
 *
 * @author mohammad
 */
public class BUSTICKETSELLINGSYSTEM {

    /**
     * @param args the command line arguments
     */
    static MainFrame mainFrame;
    public static void main(String[] args) {
        // TODO code application logic here
        createFiles();
        mainFrame=new MainFrame();
        mainFrame.setVisible(true);
    }
    public static void createFiles()
    {
        File user= new File("User.txt");
        File book= new File("Book.txt");
        if(!user.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("User.txt");
                y.close();
            }catch(Exception ex){}
        }
        if(!book.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("Book.txt");
                y.close();
            }catch(Exception ex){}
        }
    }
}
