/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftp.client;

import java.io.IOException;

/**
 *
 * @author mohammad
 */
public class FTPCLIENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        ClientPage cs= new ClientPage();
        cs.show();
    }
    
}
