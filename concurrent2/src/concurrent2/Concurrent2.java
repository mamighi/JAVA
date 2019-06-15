/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrent2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohammad
 */
public class Concurrent2 {
    
    int[] Tables;
    Object[] TObject;
    int COTables=0;
    int GlassesNo=0;
    int OccGlasses=0;
    long PFTime=0;
    long MCTime=0;
    long PFJTime=0;
    long WTime=0;
    long RTime=0;
    int CNo=0;
    int MRatio=0;
    long DTime=0;
    long OTime=0;
    int mult=0;
    int CServed=0;
    Date ClosingTime;
    boolean lastCall=false;
    Object FJTap=new Object();
    Object CMaker= new Object();
    Object MDCSleep= new Object();
    String CurrentTime;
    Date currDate;
    boolean isLastCall=false;
    boolean lastCalled=false;
    boolean AssistantLeft=false;
    //////////////////////////////
    
    static Concurrent2 mainObject;
    List<String> Queue = new ArrayList<String>();
    List<String> PLQueue=new ArrayList<String>();
    public static void main(String[] args) {
        mainObject=new Concurrent2();
        mainObject.startOprating();
    }
    private void startOprating()
    {
        getConf();
        new Thread(new Runnable() {
            public void run() {
                try {
                    TimerFunction();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       }).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Thread(new Runnable() {
            public void run() {
                try {
                   LandlordFunction();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       }).start();
        new Thread(new Runnable() {
            public void run() {
                try {
                    EnteranceFunction();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       }).start();
        new Thread(new Runnable() {
            public void run() {
                try {
                    BarmaidFunction();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       }).start();
        new Thread(new Runnable() {
            public void run() {
                try {
                     AssistantFunction();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       }).start();
    }
    public int getNoOfOccGlasses()
    {
        return OccGlasses;
    }
    public void getConf()
    {
               
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Insert Below Information\n");
        System.out.println("---------------------------------");
        System.out.println("Operating Time (Mins): ");
        OTime = scanner.nextLong()*1000*60;
        System.out.println("How Many Table The Cafe Has: ");
        int noTables = scanner.nextInt();
        Tables=new int[noTables];
        TObject= new Object[noTables];
        for(int i=0;i<Tables.length;i++)
        {
            Tables[i]=0;
            TObject[i]=new Object();
        }
        System.out.println("Tables' Capacity: ");
        COTables=scanner.nextInt();
        System.out.println("Time To Fetch Glaases and Cups(Secs): ");
        PFTime=scanner.nextLong()*1000;
        System.out.println("Time To Make Cappuccino(Secs): ");
        MCTime=scanner.nextLong()*1000;
        System.out.println("Time To Pure Fruit Juice(Secs): ");
        PFJTime=scanner.nextLong()*1000;
        System.out.println("Time For Washing Each Glass or Cup(Secs): ");
        WTime=scanner.nextLong()*1000;
        System.out.println("How Many Glaases and Cups Are In Cupboard: ");
        GlassesNo=scanner.nextInt();
        System.out.println("Assistant Rest Time Between Rounds(Secs): ");
        RTime=scanner.nextLong()*1000;
        System.out.println("Time To Drink (Secs): ");
        DTime=scanner.nextLong()*1000;
        System.out.println("Customers Number: ");
        CNo=scanner.nextInt();
        System.out.println("Ratio Of Multiple Drinkers In 10(0-10): ");
        MRatio=scanner.nextInt();
        if(MRatio!=0)
            mult=CNo/MRatio;
        
        Date d = new Date(System.currentTimeMillis());
        ClosingTime=new Date(System.currentTimeMillis() + OTime);
    }
    
    public void TimerFunction() throws InterruptedException
    {
        currDate=new Date(System.currentTimeMillis());
        System.out.println("Timer Started.");
        while(ClosingTime.after(currDate))
        {
            currDate=new Date(System.currentTimeMillis());
            CurrentTime=currDate.getHours()+":"+currDate.getMinutes()+":"+currDate.getSeconds();
            if(ClosingTime.getTime()-currDate.getTime()<=1000*60*10)
                isLastCall=true;
            Thread.sleep(500);            
        }
    }
    public void LandlordFunction() throws InterruptedException
    {
        while(currDate.before(ClosingTime) || Queue.size()>0)
        {
            String CustomerName="-";
            boolean haveCustomer=false;
            synchronized(Queue)
            {
                if(Queue.size()>0)
                {
                    CustomerName=Queue.get(0);
                    Queue.remove(0);
                    haveCustomer=true;
                }
            }
            if(haveCustomer)
            {
                 CServed++;
                 boolean isMul=false;
                 if(CServed%(mult)==0)
                     isMul=true;
                 System.out.println("Landlord  "+CurrentTime+" : "+CustomerName+" Is Ordering.");
                 int order=0;//Juice
                 if(CServed%2!=0)
                     order=1;//Cappucino
                 if(order==0)
                 {
                    System.out.println("Landlord  "+CurrentTime+" : Got Fruit Juice Order From "+CustomerName+".");
                    while(OccGlasses==GlassesNo)
                    {
                        System.out.println("Landlord  "+CurrentTime+" : Waiting For Clean Glass/Cup.");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(PFTime);
                    System.out.println("Landlord  "+CurrentTime+" : Going To Pure Juice For "+CustomerName);
                    synchronized(FJTap)
                    {
                        Thread.sleep(PFJTime);
                    }
                    System.out.println("Landlord  "+CurrentTime+" : Is Done Serving "+CustomerName+"."); 
                 }
                 else
                 {
                    System.out.println("Landlord  "+CurrentTime+" : Got Cappuccino  Order Frome "+CustomerName+".");
                    while(OccGlasses==GlassesNo)
                    {
                        System.out.println("Landlord  "+CurrentTime+" : Waiting For Clean Glass/Cup.");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(PFTime);
                    System.out.println("Landlord  "+CurrentTime+" : Going To Make Cappucino For "+CustomerName);
                    synchronized(CMaker)
                    {
                        Thread.sleep(MCTime);
                    }
                    System.out.println("Landlord  "+CurrentTime+" : "+CustomerName+" Is Served."); 
                 }
                 final String fServingCust=CustomerName;
                 final int fOrder=order;
                 final boolean fIsMul=isMul;
                 Thread CustomerT=new Thread(new Runnable(){
                    @Override
                    public void run() {
                        try {
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            Customer(fServingCust,fOrder,fIsMul);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                CustomerT.start();
            }
            else
            {
                synchronized(PLQueue)
                {
                    if(PLQueue.size()>0)
                    {
                        CustomerName=PLQueue.get(0);
                        PLQueue.remove(0);
                        System.out.println("Landlord  "+CurrentTime+" : Rejected "+CustomerName+"'s Order.");
                    }
                     
                }
            }
            if(isLastCall)
            {
                if(!lastCalled)
                {
                    lastCalled=true;
                    synchronized(MDCSleep)
                    {
                        MDCSleep.notifyAll();
                    }
                     System.out.println("Landlord  "+CurrentTime+" :------------LAST CALL------------."); 
                }
            }
        }
        System.out.println("Landlord  "+CurrentTime+" : Going To Do Check And Generate Statistics:");
        while(!AssistantLeft)
            Thread.sleep(1000);
        if(OccGlasses<0)OccGlasses=0;
        System.out.println("Landlord  "+CurrentTime+" : Number Of Glaases And Cups :"+(GlassesNo-OccGlasses)+".");
        for(int i=0;i<Tables.length;i++)
        {
            if(Tables[i]==0)
                System.out.println("Landlord  "+CurrentTime+" : Table "+(i+1)+" Is Clean.");
        }
        System.out.println("Landlord  "+CurrentTime+" : Number Of Today's Served Customers:"+CServed);
        System.out.println("Landlord "+CurrentTime+" Left."); 
    }
    public void EnteranceFunction() throws InterruptedException
    {
        long Interval=0;
        if(CNo>0)
            Interval=OTime/CNo;
        String[] name = {"Mike", "Jack", "Russel", "Peter", "Rose", "Sara", "Jim", "Nadia", "Michael", "Taylor"
        ,"Steve","Sue", "Suzan","Robert"};
        for(int entered=1;entered<=CNo;entered++)
        {
            int index=entered;
            while(index>13)
                index-=13;
            if(!lastCalled)
            {
                synchronized(Queue){
                    Queue.add(name[index]);
                }
            }
            else
            {
                synchronized(PLQueue){
                    PLQueue.add(name[index]);
                }
            }
            System.out.println("Enterance "+CurrentTime+" "+name[index]+" Entered.");
            Thread.sleep(Interval);
        }
    }
    public void Customer(String name, int order,boolean mul) throws InterruptedException
    {
        String ord="";
        if(order==0)
            ord="Fruit Juice";
        else
            ord="Cappuccino";
        System.out.println("Customer "+CurrentTime+" : "+name+" Is Having "+ord);
        if(!mul)
            Thread.sleep(DTime);
        else
        {
            synchronized(MDCSleep)
            {
                MDCSleep.wait(DTime);
            }
        }
        System.out.println("Customer "+CurrentTime+" : "+name+" Drank "+ord);
        while(true)
        {
            boolean cont=true;
            for(int i=0;i<Tables.length;i++)
            {
                synchronized(TObject[i])
                {
                    if(COTables-Tables[i]>=order+1)
                    {
                        Thread.sleep(PFTime);
                        Tables[i]=Tables[i]+1;
                        cont=false;
                    }
                }
                if(!cont)
                    break;
            }
            if(!cont)
                break;
        }
        if(mul)
        {
            System.out.println("Customer "+CurrentTime+" : "+name+" Left Glass or Cup On The Table And Ordering Again.");
            synchronized(Queue){
                Queue.add(name);
            }
        }
        else
        {
            System.out.println("Customer "+CurrentTime+" : "+name+" Left Glass or Cup On The Table And Is Leaving.");
        }
    }
    public void BarmaidFunction() throws InterruptedException
    {
         while(currDate.before(ClosingTime))
        {
            String CustomerName="-";
            boolean haveCustomer=false;
            synchronized(Queue)
            {
                if(Queue.size()>0)
                {
                    CustomerName=Queue.get(0);
                    Queue.remove(0);
                    haveCustomer=true;
                }
            }
            if(haveCustomer)
            {
                 CServed++;
                 boolean isMul=false;
                 if(CServed%(mult)==0)
                     isMul=true;
                 System.out.println("Barmaid  "+CurrentTime+" : "+CustomerName+" Is Ordering.");
                 int order=0;//Juice
                 if(CServed%2!=0)
                     order=1;//Cappucino
                 if(order==0)
                 {
                    System.out.println("Barmaid  "+CurrentTime+" : Got Fruit Juice Order From "+CustomerName+".");
                    while(OccGlasses==GlassesNo)
                    {
                        System.out.println("Barmaid  "+CurrentTime+" : Waiting For Clean Glass/Cup.");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(PFTime);
                    System.out.println("Barmaid  "+CurrentTime+" : Going To Pure Juice For "+CustomerName);
                    synchronized(FJTap)
                    {
                        Thread.sleep(PFJTime);
                    }
                    System.out.println("Barmaid  "+CurrentTime+" : Is Done Serving "+CustomerName+"."); 
                 }
                 else
                 {
                    System.out.println("Barmaid  "+CurrentTime+" : Got Cappuccino  Order Frome "+CustomerName+".");
                    while(OccGlasses==GlassesNo)
                    {
                        System.out.println("Barmaid  "+CurrentTime+" : Waiting For Clean Glass/Cup.");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(PFTime);
                    System.out.println("Barmaid  "+CurrentTime+" : Going To Make Cappucino For "+CustomerName);
                    synchronized(CMaker)
                    {
                        Thread.sleep(MCTime);
                    }
                    System.out.println("Barmaid  "+CurrentTime+" : "+CustomerName+" Is Served."); 
                 }
                 final String fServingCust=CustomerName;
                 final int fOrder=order;
                 final boolean fIsMul=isMul;
                 Thread CustomerT=new Thread(new Runnable(){
                    @Override
                    public void run() {
                        try {
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            Customer(fServingCust,fOrder,fIsMul);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Concurrent2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                CustomerT.start();
            }
            else
            {
                synchronized(PLQueue)
                {
                    if(PLQueue.size()>0)
                    {
                        CustomerName=PLQueue.get(0);
                        PLQueue.remove(0);
                        System.out.println("Barmaid  "+CurrentTime+" : Rejected "+CustomerName+"'s Order.");
                    }
                     
                }
            }
        }
        System.out.println("Barmaid "+CurrentTime+" : Left.");
    }
    
    public void AssistantFunction() throws InterruptedException
    {   
        int OccGlasses=getNoOfOccGlasses();
        while(currDate.before(ClosingTime) || OccGlasses>0)
        {
            OccGlasses=getNoOfOccGlasses();
            int UsedGC=0;
            System.out.println("Assistant "+CurrentTime+" : Checking Tables");
            for(int i=0;i<Tables.length;i++)
            {
                if(Tables[i]>0)
                {
                    System.out.println("Assistant "+CurrentTime+" : Cleaning Tables");
                    synchronized(TObject[i])
                    {
                        while(Tables[i]>0)
                        {
                            Tables[i]--;
                            UsedGC++;
                            Thread.sleep(PFTime);
                        }
                    }
                }
            }
            System.out.println("Assistant "+CurrentTime+" : Picked "+UsedGC+" Glasses/Cups And Need To Wash.");
            for(int i=0;i<UsedGC;i++)
            {
                Thread.sleep(WTime);
                OccGlasses--;
            }
            System.out.println("Assistant "+CurrentTime+" :Washed All Glasses and Cups.");
            Thread.sleep(RTime);
        }
        System.out.println("Assistant "+CurrentTime+" : Left.");
        AssistantLeft=true;
    }
    
}
