/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominium.electricity.meter.management.system;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohammad
 */
public class TaskManager {
    File info= new File("Info.txt");
    File tinfo= new File("tInfo.txt");
    File payment= new File("Payment.txt");
    File tpayment= new File("tPayment.txt");
    File usage= new File("Usage.txt");
    File tusage=new File("tUsage.txt");
    File log= new File("Log.txt");
    File pass= new File("Pass.txt");
    File tpass= new File("tPass.txt");
    public TaskManager()
    {
      
    }
    public void createFiles()
    {
          try {
            createUsagetFile();
            createPaymentFile();
            createInfoFile();
            createLogFile();
            createPassFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public final void createPassFile() throws FileNotFoundException, IOException
    {
         if(!pass.exists())
            {
                final Formatter y;
                y= new Formatter ("Pass.txt");
                y.close();
                BufferedWriter fw= new BufferedWriter(new FileWriter(pass,true));
                fw.write("managment"+" "+"123");
                fw.newLine();
                fw.write("supervisor"+" "+"123");
                fw.newLine();
                fw.close();
            }
           if(!tpass.exists())
            {
                final Formatter y;
                y= new Formatter ("tPass.txt");
                y.close();
            }
        
    }
    public final void createLogFile() throws FileNotFoundException
    {
         if(!log.exists())
            {
                final Formatter y;
                y= new Formatter ("Log.txt");
                y.close();
            }
        
    }
    public final void createUsagetFile() throws FileNotFoundException
    {
         if(!usage.exists())
            {
                final Formatter y;
                y= new Formatter ("Usage.txt");
                y.close();
            }
         if(!tusage.exists())
            {
                final Formatter y;
                y= new Formatter ("tUsage.txt");
                y.close();
            }
    }
    public void newLog(String UnitNo,String Log) throws IOException
    {
          BufferedWriter fw= new BufferedWriter(new FileWriter(log,true));
          fw.newLine();
          fw.write(UnitNo+" "+Log);
          fw.close();
    }
    public ArrayList<String> getLog(String UnitNo) throws FileNotFoundException
    {
         Scanner fs= new Scanner(log);
         ArrayList<String> retVal= new ArrayList<String>();
         while(fs.hasNext())
         {
             if(fs.next().equals(UnitNo))
                 retVal.add(fs.next());
             else
                 fs.next();
         }
         fs.close();
         return retVal;
    }
    public boolean login(String userName,String Pass) throws FileNotFoundException
    {
        Scanner fs= new Scanner(pass);
        boolean retVal=false;
        while(fs.hasNext())
        {
            String usNa=fs.next();
            String pa=fs.next();
            if(usNa.equals(userName) && pa.equals(Pass))
                retVal=true;
            
        }
        fs.close();
        return retVal;
        
    }
    public void changePass(String userName,String newPass) throws FileNotFoundException, IOException
    {
        Scanner fs= new Scanner(pass);
        BufferedWriter fw= new BufferedWriter(new FileWriter(tpass,false));
        while(fs.hasNext())
        {
            String usNa=fs.next();
            String pa=fs.next();
            if(usNa.equals(userName))
               fw.write(usNa+" "+newPass);
            else
               fw.write(usNa+" "+pa);
            fw.newLine();
            
        }
        fs.close();
        fw.close();
        
        fs=new Scanner(tpass);
        fw=new BufferedWriter(new FileWriter(pass,false));
        while(fs.hasNextLine())
        {
            fw.write(fs.nextLine());
            fw.newLine();
        }
        fs.close();
        fw.close();
    }
    public final void createPaymentFile() throws FileNotFoundException
    {
         if(!payment.exists())
            {
                final Formatter y;
                y= new Formatter ("Payment.txt");
                y.close();
            }
         if(!tpayment.exists())
            {
                final Formatter y;
                y= new Formatter ("tPayment.txt");
                y.close();
            }
    }
    public final void createInfoFile()        
    {
        try{
            if(!tinfo.exists())
            {
                final Formatter y;
                y= new Formatter ("tInfo.txt");
                y.close();
            }
            if (!info.exists())
            {
                final Formatter y;
                y= new Formatter ("Info.txt");
                y.close();
               
                    
             try {
             BufferedWriter fw= new BufferedWriter(new FileWriter(info,true));
             fw.write("1"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("2"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("3"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("4"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("5"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("6"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("7"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("8"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("9"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.write("10"+" "+"UNKNOWN"+" "+"UNKNOWN"+" "+"PRE-PAID");
             fw.newLine();
             fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Supervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
        }
        }
        catch(Exception e){
            
        }
    }
    public void newPayment(String unitNo,int month,int day,int amount) throws IOException
    {
        BufferedWriter fw= new BufferedWriter(new FileWriter(payment,true));
       
        fw.write(unitNo+" "+month+" "+day+" "+amount);
         fw.newLine();
        fw.close();
    }
    public void removePayment(String UnitNo) throws FileNotFoundException, IOException
    {
        Scanner fs= new Scanner(payment);
        BufferedWriter fw= new BufferedWriter(new FileWriter(tpayment,false));
        while(fs.hasNext())
        {
            String unitNo=fs.next();
            if(!unitNo.equals(UnitNo))
            {
                 fw.write(unitNo+" "+fs.next()+" "+fs.next()+" "+fs.next());
            }
            fw.newLine();
        }
        fs.close();
        fw.close();
        fs= new Scanner(tpayment);
        fw= new BufferedWriter(new FileWriter(payment,false));
        while(fs.hasNextLine())
        {
            fw.write(fs.nextLine());
            fw.newLine();
        }
        fs.close();
        fw.close();
    }
    public void removeUsage(String UnitNo) throws FileNotFoundException, IOException
    {
          Scanner fs= new Scanner(usage);
        BufferedWriter fw= new BufferedWriter(new FileWriter(tusage,false));
        while(fs.hasNext())
        {
            try
            {
            String Month=fs.next();
            String day=fs.next();
            String unitNo=fs.next();
            if(!unitNo.equals(UnitNo))
            {
                 fw.write(Month+" "+day+" "+unitNo+" "+fs.next());
            }
            else
                fs.next();
            fw.newLine();
            }
            catch(Exception ex)
            {
                String e=ex.getMessage();
            }
        }
        fs.close();
        fw.close();
        fs= new Scanner(tusage);
        fw= new BufferedWriter(new FileWriter(tusage,false));
        while(fs.hasNextLine())
        {
            fw.write(fs.nextLine());
            fw.newLine();
        }
        fs.close();
        fw.close();
        newLog(UnitNo,"RESET-METER");
    }
    public ArrayList<ArrayList<Integer>> getUsages(String UnitNo) throws FileNotFoundException
    {
        Scanner fs= new Scanner(usage);
        int[] usage_month = new int[12];
        for(int i=0;i<12;i++)
            usage_month[i]=0;
        while(fs.hasNext())
        {
            String Month=fs.next();
            String day=fs.next();
            String unitNo=fs.next();
            if(unitNo.equals(UnitNo))
            {
                usage_month[Integer.parseInt(Month)-1]+=fs.nextInt();
            }
            else
                fs.next();
        }
        fs.close();
        int[] payment_month=new int[12];
        for(int i=0;i<12;i++)
            payment_month[i]=0;
        fs= new Scanner(payment);
        while(fs.hasNext())
        {
            String unitNo=fs.next();
            int Month=fs.nextInt();
            fs.next();
            if(unitNo.equals(UnitNo))
            {
                payment_month[Month-1]+=fs.nextInt();
                
            }
            else
                fs.next();
        }
        fs.close();
        ArrayList<ArrayList<Integer>> retVal= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<12;i++)
        {
            if(payment_month[i]!=0 || usage_month[i]!=0)
            {
                ArrayList<Integer> temp= new ArrayList<Integer>();
                temp.add(i+1);
                temp.add(usage_month[i]);
                temp.add(payment_month[i]);
                retVal.add(temp);
            }
        }
        return retVal;
    }
    public void updateInfo(String UnitNo,String Name,String PhoneNo) throws FileNotFoundException, IOException
    {
        Scanner fs= new Scanner(info);
        BufferedWriter fw= new BufferedWriter(new FileWriter(tinfo,false));
        while(fs.hasNext())
        {
            String unitNo=fs.next();
            if(unitNo.equals(UnitNo))
            {
                fs.next();
                fs.next();
                fw.write(unitNo+" "+Name+" "+PhoneNo+" "+fs.next());
            }
            else
            {
                fw.write(unitNo+" "+fs.next()+" "+fs.next()+" "+fs.next());
            }
            fw.newLine();
        }
        fs.close();
        fw.close();
        fs= new Scanner(tinfo);
        fw= new BufferedWriter(new FileWriter(info,false));
        while(fs.hasNextLine())
        {
            fw.write(fs.nextLine());
            fw.newLine();
        }
        fs.close();
        fw.close();
    }
    public void updateType(String UnitNo,String Type) throws FileNotFoundException, IOException
    {
        Scanner fs= new Scanner(info);
        BufferedWriter fw= new BufferedWriter(new FileWriter(tinfo,false));
        while(fs.hasNext())
        {
            String unitNo=fs.next();
            if(unitNo.equals(UnitNo))
            {
               
                fw.write(unitNo+" "+fs.next()+" "+fs.next()+" "+Type);
                 fs.next();
            }
            else
            {
                fw.write(unitNo+" "+fs.next()+" "+fs.next()+" "+fs.next());
            }
            fw.newLine();
        }
        fs.close();
        fw.close();
        fs= new Scanner(tinfo);
        fw= new BufferedWriter(new FileWriter(info,false));
        while(fs.hasNextLine())
        {
            fw.write(fs.nextLine());
            fw.newLine();
        }
        fs.close();
        fw.close();
        newLog(UnitNo,"Change-Meter-Type-To-"+Type);
    }
    public ArrayList<String> getInfo(String UnitNo) throws FileNotFoundException
    {
        ArrayList<String> retVal=new ArrayList<String>();
        Scanner fs= new Scanner(info);
        String unitNo,Name,PhoneNumber,Type;
        while(fs.hasNext())
        {
            unitNo=fs.next();
            Name= fs.next();
            PhoneNumber=fs.next();
            Type=fs.next();
            if(unitNo.equals(UnitNo))
            {
                retVal.add(Name);
                retVal.add(PhoneNumber);
                retVal.add(Type);
                break;
            }
        }
        fs.close();
        return retVal;
    }
}

