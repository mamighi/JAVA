/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;
 import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.ResultSet;  
 import java.sql.Statement;  
/**
 *
 * @author mohammad
 */
public class LMS {

    /**
     * @param args the command line arguments
     */
    static MainFrame mf=new MainFrame();
    public static void main(String[] args) {
        // TODO code application logic here
        createTables();
        mf.setVisible(true);
    }

    public static void createTables()
    {
        Connection c = null;
        try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:LMS.db");
          ResultSet resultSet = null;  
          Statement statement = null;  
          statement = c.createStatement();  
          statement.executeUpdate("CREATE TABLE IF NOT EXISTS USER"+
                 "(UserName  TEXT PRIMARY KEY,  Password TEXT,FN TEXT,LN TEXT,Gen TEXT, Ut TEXT)");
          statement.executeUpdate("CREATE TABLE IF NOT EXISTS BOOKS"+
                 "(Title  TEXT PRIMARY KEY,  Author TEXT,PDate TEXT,Avail INTEGER)");
          statement.executeUpdate("CREATE TABLE IF NOT EXISTS Borrow"+
                 "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Title TEXT,Name TEXT,ST TEXT,Gen Text,Age INTEGER)");
          c.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );

        }
    }
    
}
