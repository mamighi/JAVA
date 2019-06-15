/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7seas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 *
 * @author mohammad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        fileMaker();
         MainFrame mf=new MainFrame();
        
        
        mf.setVisible(true);
    }
     public static void fileMaker() throws FileNotFoundException, IOException
     {
        File User = new File("User.txt");
        File tUser = new File("tUser.txt");
        if ( !User.exists()){
            final Formatter F = new Formatter ("User.txt");
            F.close();

            BufferedWriter bw = new BufferedWriter( new FileWriter (User , true));
            bw.write("admin"+" "+ "admin"+ " " + "ad");
            bw.newLine();
            bw.close();
            
        }
        if ( !tUser.exists()){
            final Formatter F = new Formatter ("tUser.txt");
            F.close();
            
        }
        File Client = new File("Client.txt");
        File tClient = new File("tClient.txt");
        if ( !Client.exists()){
            final Formatter F = new Formatter ("Client.txt");
            F.close();
        }
        if ( !tClient.exists()){
            final Formatter F = new Formatter ("tClient.txt");
            F.close();
            
        }
        
        File Routes = new File("Routes.txt");
        File tRoutes = new File("tRoutes.txt");
        if ( !Routes.exists()){
            final Formatter F = new Formatter ("Routes.txt");
            F.close();
        }
        if ( !tRoutes.exists()){
            final Formatter F = new Formatter ("tRoutes.txt");
            F.close();
        }
        
        File Cus = new File("Cus.txt");
        File tCus = new File("tCus.txt");
        if ( !Cus.exists()){
            final Formatter F = new Formatter ("Cus.txt");
            F.close();
        }
        if ( !tCus.exists()){
            final Formatter F = new Formatter ("tCus.txt");
            F.close();
        }
        
        File Fre = new File("Fre.txt");
        File tFre = new File("tFre.txt");
        if ( !Fre.exists()){
            final Formatter F = new Formatter ("Fre.txt");
            F.close();
        }
        if ( !tFre.exists()){
            final Formatter F = new Formatter ("tFre.txt");
            F.close();
        }
     }
    
}
