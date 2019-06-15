/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrent1;

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
public class Concurrent1 {
    //Declaring Golabl variables
    int[] Tables;
    Object[] TObject;
    int TableCap=0;
    int noGlass=0;
    int inUseGlass=0;
    long timeToFetch=0;
    long timeToMakeC=0;
    long timeToPureF=0;
    long timeToWash=0;
    long timeToRest=0;
    int noOfCus=0;
    int ratioOfMult=0;
    long drinkingTime=0;
    long runningTime=0;
    static Concurrent1 con;
    int mult=0;
    int served=0;
    Date ClosingTime;
    boolean lastCall=false;
    Object Fruit=new Object();
    Object Cuppucino= new Object();
    Object DrinkingWait= new Object();
    String cDate;
    boolean isLastCall=false;
    boolean lastCalled=false;
    boolean AssistantLeft=false;
    //////////////////////////////
    List<String> qu = new ArrayList<String>();
    List<String> lateQu=new ArrayList<String>();
    public static void main(String[] args) {
        //main function
        con=new Concurrent1();// Object of the main class
        con.init();
    }
    public void init()
    {
        //get configuration from users
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------CONFIGURATION------------------");
        System.out.println("Simulation Time(in second): ");
        runningTime = sc.nextLong()*1000;
        System.out.println("Number Of Tables: ");
        int noTables = sc.nextInt();
        Tables=new int[noTables];
        TObject= new Object[noTables];
        for(int i=0;i<Tables.length;i++)
        {
            Tables[i]=0;
            TObject[i]=new Object();
            
        }
        System.out.println("Each Table Capacity: ");
        TableCap=sc.nextInt();
        System.out.println("Number Of Glasses/Cups: ");
        noGlass=sc.nextInt();
        System.out.println("Time To Put Down/Pick Up A Glass Or A Cup(in second): ");
        timeToFetch=sc.nextLong()*1000;
        System.out.println("Time To Make Cuppucino(in second): ");
        timeToMakeC=sc.nextLong()*1000;
        System.out.println("Time To Pure Juice(in second): ");
        timeToPureF=sc.nextLong()*1000;
        System.out.println("Time To Wash A Glass/Cup(in second): ");
        timeToWash=sc.nextLong()*1000;
        System.out.println("Waiting Time Between Washing(in second): ");
        timeToRest=sc.nextLong()*1000;
        System.out.println("Number Of Customers: ");
        noOfCus=sc.nextInt();
        System.out.println("Number Of Multiple Drinkers: ");
        ratioOfMult=sc.nextInt();
        System.out.println("Drinking Time(in second): ");
        drinkingTime=sc.nextLong()*1000;    
        if(ratioOfMult!=0)//calculate the multiple drinker 
            mult=noOfCus/ratioOfMult;
        
        Date d = new Date(System.currentTimeMillis());
        ClosingTime=new Date(System.currentTimeMillis() + runningTime);
        //Creating and exciting the threads
        Thread ClockT= new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    clock();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        ClockT.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread enterCust=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    cusEntering();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        enterCust.start();
        Thread landlordT=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    Landlord();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        landlordT.start();
        Thread BarmaidT=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                    Barmaid();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        BarmaidT.start();
        Thread AssistantT=new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    Assistant();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        AssistantT.start();
    }
    public String getCurDate()
    {
        return cDate;
    }
    public void cusEntering() throws InterruptedException
    {
        //function to enter customer to the queue
        int noOfEntered=0;
       
        long entringInterval=0;
        if(noOfCus>0)
            entringInterval=runningTime/noOfCus;//calculate entering interval
        
        while(noOfEntered<noOfCus)
        {
            if(!lastCalled)
            {
                synchronized(qu){
                    noOfEntered++;//adding customer to the queue
                    qu.add("Customer"+noOfEntered);
                }
            }
            else
            {
                synchronized(lateQu){
                    noOfEntered++;//adding customer to the late queue
                    lateQu.add("Customer"+noOfEntered);
                }
            }
            System.out.println("Entering Thread -- "+cDate+" : Customer"+noOfEntered+" Entered.");
            Thread.sleep(entringInterval);
        }
    }
    public void Landlord() throws InterruptedException
    {
        //perform landlord tasks
        Date currDate=new Date(System.currentTimeMillis());
        while(currDate.before(ClosingTime) || qu.size()>0)
        {
            String cDate=getCurDate();
            String servingCust="";
            boolean run=false;
            synchronized(qu)
            {
                if(qu.size()>0)
                {//get the first customer from queie
                    servingCust=qu.get(0);
                    qu.remove(0);
                    run=true;
                }
            }
            if(run)
            {
                //serving cutomer
                 served++;
                 boolean isMul=false;
                 if(mult>0)
                 {
                    if(served%mult==0)
                        isMul=true;
                 }
                 System.out.println("Landlord Thread -- "+cDate+" : "+servingCust+" Is Being Served.");
                 Random rand = new Random();
                 int  n = rand.nextInt(50) + 1; //assign the drink type
                 int order=0;//Juice
                 if(n%2!=0)
                     order=1;//Cappucino
                 if(order==0)
                 {
                    //serving fruit juice
                    System.out.println("Landlord Thread  -- "+cDate+" : Got Fruit Juice Order From "+servingCust+".");
                    while(inUseGlass==noGlass)
                        Thread.sleep(500);//wait for glasses
                    Thread.sleep(timeToFetch);
                    System.out.println("Landlord Thread  -- "+cDate+" : Going To Pure Juice For "+servingCust);
                    synchronized(Fruit)
                    {
                        //wait for fruit tap
                        Thread.sleep(timeToPureF);
                    }
                    System.out.println("Landlord Thread  -- "+cDate+" : "+servingCust+" Is Served."); 
                 }
                 else
                 {
                    //serving cappucino
                    System.out.println("Landlord Thread  -- "+cDate+" : Got Cappuccino  Order Frome "+servingCust+".");
                    while(inUseGlass==noGlass)
                        Thread.sleep(500);
                    //waititng for galasses
                    Thread.sleep(timeToFetch);
                    System.out.println("Landlord Thread  -- "+cDate+" : Going To Make Cappucino For "+servingCust);
                    synchronized(Cuppucino)
                    {
                        //waiting for cappucino maker
                        Thread.sleep(timeToMakeC);
                    }
                    System.out.println("Landlord Thread  -- "+cDate+" : "+servingCust+" Is Served."); 
                 }
                 final String fServingCust=servingCust;
                 final int fOrder=order;
                 final boolean fIsMul=isMul;
                 //runing new thread for customer
                 Thread CustomerT=new Thread(new Runnable(){
                    @Override
                    public void run() {
                        try {
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            Customer(fServingCust,fOrder,fIsMul);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                CustomerT.start();
            }
            else
            {
                synchronized(lateQu)
                {
                    if(lateQu.size()>0)
                    {
                        servingCust=lateQu.get(0);
                        lateQu.remove(0);//rejecting late customers
                        System.out.println("Landlord Thread  -- "+cDate+" : Refused Order From "+servingCust+"."); 
                     
                    }
                  
                }
            }
            currDate=new Date(System.currentTimeMillis());
            if(isLastCall)
            {
                if(!lastCalled)
                {
                    //last call
                    lastCalled=true;
                    synchronized(DrinkingWait)
                    {
                        DrinkingWait.notifyAll();
                    }
                     System.out.println("Landlord Thread -- "+cDate+" : LAST CALL."); 
                }
            }
        }
        System.out.println("Landlord Thread -- "+cDate+" : Wait For Assistant To Leave To Do Check.");
        while(!AssistantLeft)
            Thread.sleep(1000);//wait for assistant ot leave
        if(inUseGlass<0)inUseGlass=0;
        //generating report and statistics
        System.out.println("Landlord Thread -- "+cDate+" : Glasses/Cups In Cup Board:"+(noGlass-inUseGlass)+".");
        for(int i=0;i<Tables.length;i++)
        {
            System.out.println("Landlord Thread -- "+cDate+" : Table "+(i+1)+" Has " +Tables[i]+"Glasses/Cups.");
        }
        System.out.println("Landlord Thread -- "+cDate+" : Served Customer :"+served);
        long rs=0;
        if(served>0)
            rs=runningTime/served;
        System.out.println("Landlord Thread -- "+cDate+" : Avarage Time To Serve Customer :"+rs+" second");
        System.out.println("Landlord Thread: Is Leaving."); 
    }
    public void Barmaid() throws InterruptedException
    {
        //performin barmaid task
        Date currDate=new Date(System.currentTimeMillis());
        while(currDate.before(ClosingTime))
        {
            String servingCust="";
            boolean run=false;
            synchronized(qu)
            {
                if(qu.size()>0)
                {
                    //getting first customer from queue
                    servingCust=qu.get(0);
                    qu.remove(0);
                    run=true;
                }
            }
            if(run)
            {
                //start serving customer
                 served++;
                 boolean isMul=false;
                 if(mult>0)
                 {//is it multiple drinker
                 if(served%mult==0)
                     isMul=true;
                 }
                 System.out.println("Barmaid Thread -- "+cDate+" : "+servingCust+" Is Being Served.");
                 Random rand = new Random();
                 int  n = rand.nextInt(50) + 1;
                 int order=0;//Juice
                 if(n%2!=0)//getting the drink type
                     order=1;//Cappucino
                 if(order==0)
                 {
                     //preparing the juice
                    System.out.println("Barmaid Thread -- "+cDate+" : Got Fruit Juice Order From "+servingCust+".");
                    while(inUseGlass==noGlass)
                        Thread.sleep(500);//wait for clean glass
                    Thread.sleep(timeToFetch);
                    System.out.println("Barmaid Thread -- "+cDate+" : Going To Pure Juice For "+servingCust);
                     synchronized(Fruit)
                    {//wait for fruit juice tap
                        Thread.sleep(timeToPureF);
                    }
                   
                    System.out.println("Barmaid Thread -- "+cDate+" : "+servingCust+" Is Served."); 
                 }
                 else
                 {
                    System.out.println("Barmaid Thread -- "+cDate+" : Got Cappuccino  Order Frome "+servingCust+".");
                    while(inUseGlass==noGlass)
                        Thread.sleep(500);//wating for clean glass
                    Thread.sleep(timeToFetch);
                    System.out.println("Barmaid Thread -- "+cDate+" : Going To Make Cappucino For "+servingCust);
                    synchronized(Cuppucino)
                    {//wait for cappucino maker
                        Thread.sleep(timeToMakeC);
                    }
                    System.out.println("Barmaid Thread -- "+cDate+" : "+servingCust+" Is Served."); 
                 }
                 final String fServingCust=servingCust;
                 final int fOrder=order;
                 final boolean fIsMul=isMul;
                 //creating and exuting customer therad
                 Thread CustomerT=new Thread(new Runnable(){
                    @Override
                    public void run() {
                        try {
                            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            Customer(fServingCust,fOrder,fIsMul);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Concurrent1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                CustomerT.start();
            }
            else
            {
                synchronized(lateQu)
                {
                    if(lateQu.size()>0)
                    {//rejecting late customers order
                        servingCust=lateQu.get(0);
                        lateQu.remove(0);
                        System.out.println("Barmaid Thread  -- "+cDate+" : Refused Order From "+servingCust+".");
                    }
                    
                }
            }
            currDate=new Date(System.currentTimeMillis());
        }
        System.out.println("Barmaid Thread -- "+cDate+" : Is Leaving.");
    }
    public void Customer(String name, int order,boolean mul) throws InterruptedException
    {
        String ord="";
        if(order==0)
            ord="Fruit Juice";
        else
            ord="Cappuccino";
        System.out.println("Customer Thread -- "+cDate+" : "+name+" Is Drinking "+ord);
        if(!mul)
            Thread.sleep(drinkingTime);
        else
        {
            synchronized(DrinkingWait)
            {//drinking
                DrinkingWait.wait(drinkingTime);
            }
        }
        System.out.println("Customer Thread -- "+cDate+" : "+name+" Finished The Drink.");
        while(true)
        {
            boolean cont=true;
            for(int i=0;i<Tables.length;i++)
            {
                synchronized(TObject[i])
                {
                    //looking for empty table to leave glass
                    if(TableCap-Tables[i]>=order+1)
                    {
                        Thread.sleep(timeToFetch);
                        Tables[i]=Tables[i]+order+1;
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
            //going to order again
            System.out.println("Customer Thread -- "+cDate+" : "+name+" Put The Cup/Glass On The Tabel And Going To Order Again.");
            synchronized(qu){
                qu.add(name);
            }
        }
        else
        {
            System.out.println("Customer Thread -- "+cDate+" : "+name+" Put The Cup/Glass On The Tabel And Left.");
        }
    }
    public void Assistant() throws InterruptedException
    {   
        Date currDate=new Date(System.currentTimeMillis());
       
        while(true)
        {
            int pickedUp=0;
            System.out.println("Assistant Thread -- "+cDate+" : Going To Clean The Tables");
            for(int i=0;i<Tables.length;i++)
            {
                //checking the tables
                if(Tables[i]>0)
                {
                    System.out.println("Assistant Thread -- "+cDate+" : Cleaning Table Number "+(i+1));
                    synchronized(TObject[i])
                    {
                        while(Tables[i]>0)
                        {
                            //cleaning table
                            Tables[i]--;
                            pickedUp++;
                            Thread.sleep(timeToFetch);
                        }
                    }
                }
            }
            if(pickedUp>0)
            {
                System.out.println("Assistant Thread -- "+cDate+" : Going To Wash "+pickedUp+" Glasses/Cups.");
                for(int i=0;i<pickedUp;i++)
                {
                    //washing glasses and cups
                    Thread.sleep(timeToWash);
                    inUseGlass--;
                }
                System.out.println("Assistant Thread -- "+cDate+" :Washed Glasses/Cups Going To Rest.");
            }
            if(currDate.after(ClosingTime) && pickedUp==0)
                break;
            //resting time
            currDate=new Date(System.currentTimeMillis());
            Thread.sleep(timeToRest);
        }
        System.out.println("Assistant Thread  -- "+cDate+" : Is Leaving.");
        AssistantLeft=true;
    }
    public void clock() throws InterruptedException
    {
        Date currDate=new Date(System.currentTimeMillis());
        System.out.println("Clock Thread: Started.");
        while(currDate.before(ClosingTime))
        {
            currDate=new Date(System.currentTimeMillis());
            cDate=currDate.getHours()+":"+currDate.getMinutes()+":"+currDate.getSeconds();
            if(ClosingTime.getTime()-currDate.getTime()<=1000*60*10)
                isLastCall=true;
            Thread.sleep(500);            
        }
    }
}
