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
public class Librarian extends User{

    /**
     *
     */
    File Bio = new File("Bio.txt");
    File tBio = new File("tBio.txt");
    
    public Librarian() throws IOException{
        super();
       if ( !Bio.exists()){
            final Formatter F = new Formatter ("Bio.txt");
            F.close();
            
            
        }
        if ( !tBio.exists()){
            final Formatter F = new Formatter ("tBio.txt");
            F.close();
    }
    
    }  
    public int checkTitle ( String Title ) throws FileNotFoundException{
        Scanner Filescanner = new Scanner( Bio );
        String ti;
        int id=0;
        while (Filescanner.hasNext()){
            id= Filescanner.nextInt();
            ti = Filescanner.next();
            for ( int i = 0 ; i<5 ; i++){
                Filescanner.next();
            }
            if ( ti.equals(Title)){
                return 0;
            }
            
        }
        return id+1;
        
    }
    public void addBio( int id,String title , String author , String publisher , String pdate , int pages , String location ) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(Bio,true));
        bw.write(id+" "+title + " " + author + " " + publisher + " " + pdate + " " + pages + " " + location);
        bw.newLine();
        bw.close();
        
    }
}
