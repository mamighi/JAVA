/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntefacePackage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author mohammad
 */
public interface LMSInterface extends Remote{
    public boolean newStudent(String un,String pass,String fn,String ln,String gen) throws RemoteException;
    public ArrayList<ArrayList<String>> getBookDetails() throws RemoteException;
    public int getBc(String title) throws RemoteException;
    public boolean addBook(String ti, String au, String py,int count) throws RemoteException;
    public ArrayList<String> getAllBooks() throws RemoteException;
    public void updateBook(String au,String py,int cn,String tit) throws RemoteException;
    public void deleteBook(String tit) throws RemoteException;
    public ArrayList<String> loadchID(String userName) throws RemoteException;
    public ArrayList<String> getBookDet(String tit) throws RemoteException;
    public void borrowBook(String title,String name) throws RemoteException;
    public void returnBook(int Id) throws RemoteException;
    public String getBookTitleBr(int Id) throws RemoteException;
    public boolean login(String userName,String password) throws RemoteException;
}
