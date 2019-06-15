/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.managment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mohammad
 */
public class UpdateStudent extends javax.swing.JPanel {

    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
        initComponents();
        
    }
    public void Init()
    {
        jLabel7.setVisible(false);
        loadIntakes();
        loadList();
        loadDetails();
    }
    public void loadList()
    {
        jComboBox2.removeAllItems();
        try
        {
          File Student= new File("Student.txt");
            Scanner fs= new Scanner(Student);
            boolean retVal=false;
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String intake=fs.next();
                jComboBox2.addItem(usNa);
            }
            fs.close();
        }catch(Exception ex){}
    }
    public void loadIntakes()
    {
        try
        {
         jComboBox1.removeAllItems();
         File Intake= new File("Intake.txt");
         Scanner fs= new Scanner(Intake);
         while(fs.hasNext())
         {
            String Code=fs.next();
            String Date=fs.next();
            jComboBox1.addItem(Code);
         }
         fs.close();
        }catch(Exception ex){}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("UPDATE STUDENT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("USER NAME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("PASSWORD");

        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Please Fill All Field");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("RE-PASSWORD");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("INTAKE");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(23, 23, 23)))
                                .addGap(41, 41, 41))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addGap(210, 210, 210))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File user= new File("User.txt");
        File tUser=new File("tUser.txt");
        String userName=jComboBox2.getSelectedItem().toString();
        String Password=jPasswordField1.getText();
        if(userName.length()<1 || Password.length()<1)
        {
            jLabel7.setText("Please Insert UserName And Password.");
            jLabel7.setVisible(true);
            return;
        }
        if(!Password.equals(jPasswordField2.getText()))
        {
            jLabel7.setText("Passwords Do Not Match.");
            jLabel7.setVisible(true);
            return;
        }
        try
        {
            Scanner fs= new Scanner(user);
            BufferedWriter fw= new BufferedWriter(new FileWriter(tUser,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String pa=fs.next();
                String usTy=fs.next();
                if(usNa.equals(userName))
                   fw.write(userName+" "+Password+" "+usTy);
                else
                    fw.write(usNa+" "+pa+" "+usTy);
                fw.newLine();
                
            }
            fs.close();
            fw.close();
        }catch(Exception ex){}
        
        try
        {
            Scanner fs= new Scanner(tUser);
            BufferedWriter fw= new BufferedWriter(new FileWriter(user,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String pa=fs.next();
                String usTy=fs.next();
                fw.write(usNa+" "+pa+" "+usTy);
                fw.newLine();
            }
            fs.close();
            fw.close();
        }catch(Exception ex){}
        
        
        File Student= new File("Student.txt");
        File tStudent= new File("tStudent.txt");
        try
        {
            Scanner fs= new Scanner(Student);
            BufferedWriter fw= new BufferedWriter(new FileWriter(tStudent,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String intake=fs.next();
                if(usNa.equals(userName))
                   fw.write(userName+" "+jComboBox1.getSelectedItem().toString());
                else
                    fw.write(usNa+" "+intake);
                fw.newLine();
                
            }
            fs.close();
            fw.close();
        }catch(Exception ex){}
        
        try
        {
            Scanner fs= new Scanner(tStudent);
            BufferedWriter fw= new BufferedWriter(new FileWriter(Student,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String intake=fs.next();
     
                fw.write(usNa+" "+intake);
                fw.newLine();
            }
            fs.close();
            fw.close();
            JOptionPane.showMessageDialog(this,"The student has been updated successfully");
            this.setVisible(false);
        }catch(Exception ex){}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         File user= new File("User.txt");
        File tUser=new File("tUser.txt");
        String userName=jComboBox2.getSelectedItem().toString();
        if(userName.length()<1)
        {
            jLabel7.setText("Please Select UserName.");
            jLabel7.setVisible(true);
            return;
        }
        try
        {
            Scanner fs= new Scanner(user);
            BufferedWriter fw= new BufferedWriter(new FileWriter(tUser,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String pa=fs.next();
                String usTy=fs.next();
                if(!usNa.equals(userName))
                    fw.write(usNa+" "+pa+" "+usTy);
                fw.newLine();
                
            }
            fs.close();
            fw.close();
        }catch(Exception ex){}
        
        try
        {
            Scanner fs= new Scanner(tUser);
            BufferedWriter fw= new BufferedWriter(new FileWriter(user,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String pa=fs.next();
                String usTy=fs.next();
                fw.write(usNa+" "+pa+" "+usTy);
                fw.newLine();
            }
            fs.close();
            fw.close();
        }catch(Exception ex){}
        
        
        File Student= new File("Student.txt");
        File tStudent= new File("tStudent.txt");
        try
        {
            Scanner fs= new Scanner(Student);
            BufferedWriter fw= new BufferedWriter(new FileWriter(tStudent,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String intake=fs.next();
                if(!usNa.equals(userName))
                    fw.write(usNa+" "+intake);
                fw.newLine();
                
            }
            fs.close();
            fw.close();
        }catch(Exception ex){}
        
        try
        {
            Scanner fs= new Scanner(tStudent);
            BufferedWriter fw= new BufferedWriter(new FileWriter(Student,false));
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String intake=fs.next();
     
                fw.write(usNa+" "+intake);
                fw.newLine();
            }
            fs.close();
            fw.close();
            JOptionPane.showMessageDialog(this,"The student has been deleted successfully");
            this.setVisible(false);
        }catch(Exception ex){}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        loadDetails();
    }//GEN-LAST:event_jComboBox2ActionPerformed
    public void loadDetails()
    {
        String userName=jComboBox2.getSelectedItem().toString();
        if(userName.length()<1)
            return;
        try
        {
          File user= new File("User.txt");
            Scanner fs= new Scanner(user);
            boolean retVal=false;
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String pa=fs.next();
                String usTy=fs.next();
                if(usNa.equals(userName))
                {
                    jPasswordField1.setText(pa);
                    jPasswordField2.setText(pa);
                    break;
                }
            }
            fs.close();
        }catch(Exception ex){}
        try
        {
          File Student= new File("Student.txt");
            Scanner fs= new Scanner(Student);
            boolean retVal=false;
            while(fs.hasNext())
            {
                String usNa=fs.next();
                String intake=fs.next();
                if(usNa.equals(userName))
                {
                    jComboBox1.setSelectedItem(intake);
                    break;
                }
            }
            fs.close();
        }catch(Exception ex){}
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}