/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibmanagment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 *
 * @author mohammad
 */
public class BibManagment {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        fileMaker();
        Main_Frame mf=new Main_Frame();
        
        
        mf.setVisible(true);
    }
    public static void fileMaker() throws FileNotFoundException, IOException
    {
        File User = new File("User.txt");
        File tUser = new File("tUser.txt");
        if ( !User.exists()){
            final Formatter F = new Formatter ("User.txt");
            F.close();
            FileWriter fw = new FileWriter(User);
            fw.write("admin admin ad\n");
            fw.close();
            
        }
        if ( !tUser.exists()){
            final Formatter F = new Formatter ("tUser.txt");
            F.close();
            
        }
        File Bio = new File("Bio.txt");
        File tBio = new File("tBio.txt");
         if ( !Bio.exists()){
            final Formatter F = new Formatter ("Bio.txt");
            F.close();
            
            
        }
        if ( !tBio.exists()){
            final Formatter F = new Formatter ("tBio.txt");
            F.close();
        }
        File assignment = new File("ass.txt");
        File tassignment = new File("tass.txt");
        
           if (!assignment.exists()){
            Formatter F= new Formatter("ass.txt");
            F.close();
            
        }
        if (!tassignment.exists()){
            Formatter F= new Formatter("tass.txt");
            F.close();
            
        }
        
        
        File not = new File("not.txt");
        File tnot = new File("tnot.txt");
        
           if (!not.exists()){
            Formatter F= new Formatter("not.txt");
            F.close();
            
        }
        if (!tnot.exists()){
            Formatter F= new Formatter("tnot.txt");
            F.close();
            
        }
        
        File req = new File("req.txt");
        File treq = new File("treq.txt");
        
           if (!req.exists()){
            Formatter F= new Formatter("req.txt");
            F.close();
            
        }
        if (!treq.exists()){
            Formatter F= new Formatter("treq.txt");
            F.close();
            
        }
        
    }
    
}
