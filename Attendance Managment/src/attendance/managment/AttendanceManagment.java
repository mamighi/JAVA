/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.managment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;

/**
 *
 * @author mohammad
 */
public class AttendanceManagment {

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
        File tUser=new File("tUser.txt");
        if(!user.exists())
        {
            try
            {
                
                final Formatter y;
                y= new Formatter ("User.txt");
                y.close();
                BufferedWriter fw= new BufferedWriter(new FileWriter(user,true));
                fw.write("admin"+" "+"admin"+" "+"AD");
                fw.close();
            }catch(Exception ex){}
        }
        if(!tUser.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("tUser.txt");
                y.close();
            }catch(Exception ex){}
        }
        File intake= new File("Intake.txt");
        if(!intake.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("Intake.txt");
                y.close();
            }catch(Exception ex){}
        }
        File subject= new File("subject.txt");
        if(!subject.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("subject.txt");
                y.close();
            }catch(Exception ex){}
        }
        File Student= new File("Student.txt");
        if(!Student.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("Student.txt");
                y.close();
            }catch(Exception ex){}
        }
        File tStudent= new File("tStudent.txt");
        if(!tStudent.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("tStudent.txt");
                y.close();
            }catch(Exception ex){}
        }
        File reason= new File("reason.txt");
        if(!reason.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("reason.txt");
                y.close();
            }catch(Exception ex){}
        }
         File treason= new File("treason.txt");
        if(!treason.exists())
        {
            try
            {
                final Formatter y;
                y= new Formatter ("treason.txt");
                y.close();
            }catch(Exception ex){}
        }
    }
    
}
