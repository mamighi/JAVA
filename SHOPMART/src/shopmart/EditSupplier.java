/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mohammad
 */
public class EditSupplier extends javax.swing.JPanel {

    /**
     * Creates new form NewUser
     */
    File Supp= new File("supp.txt");
        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
    public EditSupplier() throws RemoteException {
        initComponents();
        refresh();
        
    }
    public void refresh() throws RemoteException
    {
         jLabel8.setVisible(false);
        createTextFile();
        getAllSupplier();
        fillUpSupplier();
        
    }
     public void getAllSupplier()
    {
        arrayList.clear();
        if(!Supp.exists())
            return;
         try{
               Scanner fs;
               fs= new Scanner(Supp);
               while (fs.hasNext()){
                   ArrayList<String> temp= new ArrayList<String>();
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   arrayList.add(temp);
               }
               fs.close();

          }
         catch(Exception e){
           }
     
     
     
     
     
    }
    public void fillUpSupplier()
    {
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Supplier");
        for(int i=0;i<arrayList.size();i++)
        {
            jComboBox1.addItem(arrayList.get(i).get(0));
        }
    }
    private String solveSpace(String st)
    {
        st=st.replace(' ', '%');
        return st;
    }
    private String solvePer(String st)
    {
        st=st.replace('%', ' ');
        return st;
    }
    public void createTextFile()
    {
        try{
        if (!Supp.exists()){
            final Formatter y;
            y= new Formatter ("supp.txt");
            y.close();
        }
        }
        catch(Exception e){
            
        }
    }
       public int GETID() throws RemoteException{
        int LastID=0;
        try{
            Scanner fs;
            fs= new Scanner(Supp);
            while (fs.hasNext())
            {
                LastID= Integer.parseInt(fs.next());
                for(int i=0; i<3; i++)
                    fs.next();
            }
        fs.close();
        
         }catch(Exception e){
        }
        return LastID+1;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("CLEAR");

        setMaximumSize(new java.awt.Dimension(770, 500));
        setMinimumSize(new java.awt.Dimension(770, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(770, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 500));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("NEW SUPPLIER");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("Phone Number:");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("Address:");

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("jLabel8");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Supplier" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(280, 280, 280))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(271, 271, 271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabel8.setVisible(false);
        if(jTextField2.getText().isEmpty()
                ||jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty())
        {
            jLabel8.setText("Please Insert All Information");
            jLabel8.setVisible(true);
            return;
        }
        for(int i=0; i<arrayList.size();i++)
        {
            if(arrayList.get(i).get(0).equals(jComboBox1.getSelectedItem().toString()))
            {
                ArrayList<String> temp= new ArrayList<String>();
                temp.add(arrayList.get(i).get(0));
                temp.add(jTextField2.getText());
                 temp.add(jTextField4.getText());
                  temp.add(jTextField5.getText());
                  arrayList.set(i, temp);
                  break;
            }
        }
        


     
       try{
  
            BufferedWriter fw= new BufferedWriter(new FileWriter(Supp,false));
            for(int j=0;j<arrayList.size();j++)
            {
                fw.write(solveSpace(arrayList.get(j).get(0))+" "+solveSpace(arrayList.get(j).get(1))
                        +" "+solveSpace(arrayList.get(j).get(2))+" "+solveSpace(arrayList.get(j).get(3)));
                fw.newLine();
            }
            fw.close();
            JOptionPane.showMessageDialog(null, "The supplier has been updated successfully");
            this.setVisible(false);
        }catch(Exception e){   
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try
        {// TODO add your handling code here:
        if(jComboBox1.getSelectedItem().equals("Supplier"))
            return;
        for(int i=0;i<arrayList.size();i++)
        {
            if(arrayList.get(i).get(0).equals(jComboBox1.getSelectedItem().toString()))
            {
                jTextField2.setText(solvePer(arrayList.get(i).get(1)));
                jTextField4.setText(solvePer(arrayList.get(i).get(2)));
                jTextField5.setText(solvePer(arrayList.get(i).get(3)));
                break;
            }
        }
        }
        catch(Exception ex){}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public boolean CHECK_USERNAME(String ID) throws RemoteException{
        try{
        Scanner fs;
        fs= new Scanner(Supp);
        while (fs.hasNext()){
            String chid= fs.next();
            for(int i=0; i<3; i++)
                fs.next();
            if (chid.equals(ID))
                return false;
        }
        fs.close();
        return true;
         }catch(Exception e){
            
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}