/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;




/**
 *
 * @author mahta_000
 */
public class lecturer extends User {
    
    File bibo = new File("bio.txt");
    File assignment = new File("ass.txt");
    File tassignment = new File("tass.txt");
    public lecturer() throws IOException{
        super();
        if (!assignment.exists()){
            Formatter F= new Formatter("ass.txt");
            
        }
        if (!tassignment.exists()){
            Formatter F= new Formatter("tass.txt");
            
        }
    }
    
    
    public int CheckAssignment ( String Title) throws FileNotFoundException{
        int id = 0;
        Scanner fs = new Scanner(assignment);
        String check;
        while (fs.hasNext()){
            id = fs.nextInt();
            fs.next();
            check = fs.next();
            fs.next();
            fs.next();
            if ( Title.equals(check) ){
                return 0;
            }
            
        }
        return id+1;
    }
    public int CheckBibo ( String Bibo ) throws FileNotFoundException{
        Scanner fs = new Scanner(bibo);
        int id ;
        String Check;
        while (fs.hasNext()){
            id = fs.nextInt();
            Check = fs.next();
            fs.next();
            fs.next();
            fs.next();
            fs.next();
            fs.next();
            if ( Bibo.equals(Check)){
                return id;
            }
           
        }
        return 0;
    }
    public void add ( int id , String module , String title , String bio , String status) throws IOException{
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(assignment,true));
         bw.newLine();
        bw.write(id + " "+ module + " " + title + " " + bio + " " + status );
       
        bw.close();
        
    }
    
    
    
    
    
    
    
    
}
