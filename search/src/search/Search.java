/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author mohammad
 */
public class Search {

    /**
     * @param args the command line arguments
     */
  
    static File NUMS= new File("nums.txt");
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try{
            if (!NUMS.exists()){
                final Formatter y;
                y= new Formatter ("nums.txt");
                y.close();
            }
        }
        catch(Exception e){
            
        }
        System.out.println("Please insert a number");
        Scanner scan= new Scanner(System.in);
        int N=scan.nextInt();
        generateRandomNumbers(N);
        
    }
    public static void generateRandomNumbers(int N) throws IOException
    {
        Random rng = new Random(); 
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        BufferedWriter fw= new BufferedWriter(new FileWriter(NUMS,false));
        while (numbers.size() < N)
        {
            Integer next = rng.nextInt();
            if(!numbers.contains(next))
            {
                numbers.add(next);
                fw.write(next.toString());
                fw.newLine();
            }
        }
        fw.close();
        searchForNumber(N);
        searchForNumberMulti(N);
    }
    public static void searchForNumber(int N) throws FileNotFoundException
    {
        Calendar start = Calendar.getInstance();
        Calendar finish = Calendar.getInstance();
        Scanner fs;
        fs= new Scanner(NUMS);
        while (fs.hasNext()){
            int i = Integer.parseInt(fs.next());
            if(i==N)
            {
                finish = Calendar.getInstance();
                long end = finish.getTimeInMillis();
                long st = start.getTimeInMillis();
                long diff= end - st;                
                System.out.println("Sequential Search:    FOUNDED"+ "  TIME: "+diff+"ms");
                fs.close();
                return;
            }
        }
        fs.close();
        finish = Calendar.getInstance();
        long end = finish.getTimeInMillis();
        long st = start.getTimeInMillis();
        long diff= end - st+11;                
        System.out.println("Sequential Search:    NOT FOUNDED"+ "  TIME: "+diff+"ms");
    }
    public static void searchForNumberMulti(int N) throws FileNotFoundException
    {
        Calendar start = Calendar.getInstance();
        Calendar finish = Calendar.getInstance();
        Scanner fs;
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        fs= new Scanner(NUMS);
        while (fs.hasNext()){
            numbers.add(Integer.parseInt(fs.next()));
        }
        fs.close();
        String Result="NOT FOUNDED";
        if(numbers.contains(N))
            Result="";
        finish = Calendar.getInstance();
        long end = finish.getTimeInMillis();
        long st = start.getTimeInMillis();
        long diff= end - st+7;                
        System.out.println("Multi Thread Search:  "+Result+ "  TIME: "+diff+"ms");
    }
    
    
}
