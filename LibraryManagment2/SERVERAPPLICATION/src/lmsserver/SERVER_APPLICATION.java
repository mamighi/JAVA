/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmsserver;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import IntefacePackage.LMSInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author mohammad
 */
public class SERVER_APPLICATION extends UnicastRemoteObject implements LMSInterface{

    /**
     * @param args the command line arguments
     */

    protected SERVER_APPLICATION() throws RemoteException {

        super();

    }
    public static void main(String[] args) {
        // TODO code application logic here
        createTables();
        try {
            
            Registry reg=LocateRegistry.createRegistry(1099);
              
            reg.rebind("MYSERVER", new SERVER_APPLICATION());
            System.err.println("SEREVER IS RUNNING...");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }
    }
    public boolean addBook(String ti, String au, String py,int count)
    {
         Connection c = null;
         try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            statement.executeUpdate("INSERT INTO BOOKS (Title,Author,PDate,Avail)"+
                    "VALUES('"+ti+"','"+au+"','"+py+"','"+count+"')");
            c.close();
            
            return true;
        
        }
        catch(Exception ex)
        {
           return false;
        }
    }
    public void borrowBook(String title,String name)
    {
        Connection c = null;
         try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            statement.executeUpdate("INSERT INTO Borrow (Title,Name,ST)"+
                    "VALUES('"+title+"','"+name+"','OUT')");
            c.close();
        }
        catch(Exception ex)
        {
  
        }
    }
    public ArrayList<String> loadchID(String userName)
    {
        ArrayList<String> ret= new ArrayList<String>(); 
        Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT ID FROM Borrow WHERE ST='OUT' AND Name='"+userName+"'");
            while(rs.next())
            {
                ret.add(rs.getInt(1)+"");
            }
            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return ret;
    }
    public String getBookTitleBr(int Id)
    {
        Connection c = null;
        String ret="";
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT * FROM Borrow WHERE ID='"+Id+"'");
            if(rs.next())
            {
                ret=rs.getString(2);
            }
            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return ret;
    }
    public void returnBook(int Id)
    {
        Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
            Statement statement = null;  
            statement = c.createStatement();  
            statement.executeUpdate("UPDATE Borrow SET ST='IN' WHERE ID='"+Id+"'");
            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
    }
    public void deleteBook(String tit)
    {
        Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            statement.executeUpdate("DELETE FROM BOOKS WHERE Title='"+tit+"'");
            c.close();
           
           
        }
        catch(Exception ex)
        {
         
        }
    }
    public void updateBook(String au,String py,int cn,String tit)
    {
         Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            statement.executeUpdate("UPDATE BOOKS SET Author='"+au+"', PDate='"+py+"',Avail='"+cn+"' WHERE Title='"+tit+"'");
            c.close();
              
        }
        catch(Exception ex)
        {
         
        }
    }
    public ArrayList<String> getBookDet(String tit)
    {
        ArrayList<String> bDet = new ArrayList<String>();
        Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT * FROM BOOKS WHERE Title='"+tit+"'");
            if(rs.next())
            {
                bDet.add(rs.getString(2));
                bDet.add(rs.getString(3));
                bDet.add(rs.getInt(4)+"");
            }
            c.close();

        }
        catch(Exception ex)
        {
          
        }
        return bDet;
    }
    public ArrayList<String> getAllBooks()
    {
         ArrayList<String> bDet = new ArrayList<String>();
         Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT Title FROM BOOKS");
            while(rs.next())
            {
                bDet.add(rs.getString(1));
                
            }
            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return bDet;
    }
    public ArrayList<ArrayList<String>> getBookDetails()
    {
        ArrayList<ArrayList<String>> bDet = new ArrayList<ArrayList<String>>();
        Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT * FROM BOOKS");
            while(rs.next())
            {
                ArrayList<String> tBook= new ArrayList<String>();
                tBook.add(rs.getString(1));
                tBook.add(rs.getString(2));
                tBook.add(rs.getString(3));
                tBook.add(rs.getInt(4)+"");
                bDet.add(tBook);
            }
            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return bDet;
    }
    public int getBc(String title)
    {
        int co=0;
         Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT * FROM Borrow WHERE Title='"+title+"' AND ST='OUT'");
            while(rs.next())
            {
                co++;
            }
            c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return co;
        
    }
    public boolean newStudent(String un,String pass,String fn,String ln,String gen)
    {
        Connection c = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
             Statement statement = null;  
            statement = c.createStatement();  
            statement.executeUpdate("INSERT INTO USER (UserName,Password,FN,LN,Gen,Ut)"+
                    "VALUES('"+un+"','"+pass+"','"+fn+"','"+ln+"','"+gen+"','LIB')");
            c.close();
            
        }
        catch(Exception ex)
        {
            return false;
        }
        return true;
    }
    
    public boolean login(String userName,String password){
        Connection c = null;
        boolean check=false;
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
            Statement statement = null;  
            statement = c.createStatement();  
            ResultSet rs = statement.executeQuery("SELECT * FROM USER WHERE UserName='"+userName+"' AND Password='"+password+"'");
            if(rs.next())
            {
                check=true;
            }
            c.close();
        }
        catch(Exception ex){}
        return check;
        
    }
    public static void createTables()
    {
        Connection c = null;
        try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
          Statement statement = null;  
          statement = c.createStatement();  
          statement.executeUpdate("CREATE TABLE IF NOT EXISTS USER"+
                 "(UserName  TEXT PRIMARY KEY,  Password TEXT,FN TEXT,LN TEXT,Gen TEXT, Ut TEXT)");
          statement.executeUpdate("CREATE TABLE IF NOT EXISTS BOOKS"+
                 "(Title  TEXT PRIMARY KEY,  Author TEXT,PDate TEXT,Avail INTEGER)");
          statement.executeUpdate("CREATE TABLE IF NOT EXISTS Borrow"+
                 "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Title TEXT,Name TEXT,ST TEXT)");
          c.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );

        }
    }    
}
