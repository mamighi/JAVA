
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahta_000
 */
public class User {
    
    File User = new File("User.txt");
    File tUser = new File("tUser.txt");
    
    public User() throws FileNotFoundException, IOException{
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
    }
    public int Login ( String UserName , String Password ) throws FileNotFoundException{
        String UN , PW , UserAccess;
        Scanner FileScanner = new Scanner (User);
        while ( FileScanner.hasNext()){
            UN = FileScanner.next();
            PW = FileScanner.next();
            UserAccess = FileScanner.next();
           if ( UN.equals(UserName) && PW.equals(Password)){
               switch( UserAccess){
                   case "st":
                       return 1;
                   case "li":
                       return 2;
                   case "le":
                       return 3;
                   case "ad":
                       return 4;       
               }       
           }
        }
        return 0;
    }
    
    public boolean CheckUserName( String username) throws FileNotFoundException{
        Scanner FileScanner = new Scanner(User);
        String UN , PW , UserAccess;
        while ( FileScanner.hasNext()){
            UN = FileScanner.next();
            PW = FileScanner.next();
            UserAccess = FileScanner.next();
            if ( UN.equals(username)){
                return false;
            }
            
        }
        return true;
      
    }
    public void AddUser( String username , String password , String useraccess) throws IOException{
        BufferedWriter bw = new BufferedWriter( new FileWriter (User , true));
        bw.write(username+" "+ password+ " " + useraccess);
        bw.newLine();
        bw.close();
    }
}
