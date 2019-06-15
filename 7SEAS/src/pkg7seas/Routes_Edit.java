/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7seas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mohammad
 */
public class Routes_Edit extends javax.swing.JPanel {

    /**
     * Creates new form Routes_Load
     */
    File Client = new File("Client.txt");
    File Routes = new File("Routes.txt");
    File tRoutes = new File("tRoutes.txt");
    ArrayList<ArrayList<String>> rDet=new  ArrayList<ArrayList<String>>();
    public Routes_Edit() {
        initComponents();
        jLabel6.setVisible(false);
    }
    public void loadShipper() throws FileNotFoundException
    {
        jComboBox2.removeAllItems();
        Scanner FileScanner = new Scanner(Client);
        String name , service , type;
        while ( FileScanner.hasNext()){
            name = FileScanner.next();
            service = FileScanner.next();
            type = FileScanner.next();
            jComboBox2.addItem(name);
        }
        FileScanner.close();
    }
    public void loadRDet() throws FileNotFoundException
    {
        Scanner FileScanner = new Scanner(Routes);
        String ro,port,ship,dis;
        while ( FileScanner.hasNext()){
            ro = FileScanner.next();
            ro=ro.replace('?', ' ');
            port = FileScanner.next();
            port=port.replace('?', ' ');
            //port=port.replace('-', ',');
            ship=FileScanner.next();
            dis=FileScanner.next();
            ArrayList<String> Det=new  ArrayList<String>();
            Det.add(ro);
            Det.add(port);
            Det.add(ship);
            Det.add(dis);
            rDet.add(Det);
        }
        FileScanner.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        list1 = new java.awt.List();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("LOAD ROUTES");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Route:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New York to New York", "Osinina to Kingston", "WestPoint to Athens" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Intermediate Ports:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Shipping Client:");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Distance:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("jLabel6");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(44, 44, 44)
                                        .addComponent(jTextField2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(jTextField1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty())
            return;
        String port=jTextField1.getText();
        if(list1.getItems().toString().contains(port))
            return;
        list1.addItem(port); 
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(list1.getItemCount()==0)
        {
            jLabel6.setText("Add at least one port.");
            jLabel6.setVisible(true);
            return;
        }
        int dis=0;
        try
        {
            dis=Integer.parseInt(jTextField2.getText());
        }
        catch(Exception ex)
        {
            jLabel6.setText("Enter Valid Distance.");
            jLabel6.setVisible(true);
            return;
        }
        String[] ports=list1.getItems();
        String port="";
        for(int i=0;i<ports.length;i++)
        {
            ports[i]=ports[i].replace(' ', '?');
            port+=ports[i]+"-";
        }
        String ship=jComboBox2.getSelectedItem().toString();
        if(ship.isEmpty())
        {
             jLabel6.setText("Select Shipment Client.");
            jLabel6.setVisible(true);
            return;
        }
        String ro=jComboBox1.getSelectedItem().toString();
        ro=ro.replace(' ', '?');
        
        try
        {
        Scanner FileScanner = new Scanner(Routes);
        BufferedWriter bw = new BufferedWriter( new FileWriter (tRoutes , false));
        String r , p , s,d;
        while ( FileScanner.hasNext()){
            r = FileScanner.next();
            p = FileScanner.next();
            s = FileScanner.next();
            d=FileScanner.next();
            
            if(ro.equals(r) && ship.equals(s))
            {
                 bw.write(ro+" "+ port+ " " + ship+" "+dis);
            }
            else
             bw.write(r+" "+ p+ " " + s+" "+d);
             bw.newLine();
        }
        bw.close();
        FileScanner.close();
        FileScanner = new Scanner(tRoutes);
        bw = new BufferedWriter( new FileWriter (Routes , false));

        while ( FileScanner.hasNext()){
            r = FileScanner.next();
            p = FileScanner.next();
            s = FileScanner.next();
            d=FileScanner.next();
             bw.write(r+" "+ p+ " " + s+" "+d);
            bw.newLine();
        }
        bw.close();
        FileScanner.close();
        }catch(Exception ex){}
        
        list1.removeAll();
        jTextField1.setText("");
        jTextField2.setText("");
        JOptionPane.showMessageDialog(this, "The Route Has Been Updated Successfuly");
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
        list1.remove(list1.getSelectedItem().toString());
        }
        catch(Exception ex){}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        jComboBox2.removeAllItems();
        for(int i=0;i<rDet.size();i++)
        {
            if(rDet.get(i).get(0).equals(jComboBox1.getSelectedItem().toString()))
                jComboBox2.addItem(rDet.get(i).get(2));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        list1.clear();
        for(int i=0;i<rDet.size();i++)
        {
            if(rDet.get(i).get(0).equals(jComboBox1.getSelectedItem().toString()) &&
                    rDet.get(i).get(2).equals(jComboBox2.getSelectedItem().toString()))
            {
                jTextField2.setText(rDet.get(i).get(3));
                String Ports=rDet.get(i).get(1);
                String[] port=Ports.split("-");
                int j=0;
                for(j=0;j<port.length;j++)
                    list1.add(port[j]);
                    return;
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
     
  
        String ship=jComboBox2.getSelectedItem().toString();
        if(ship.isEmpty())
        {
             jLabel6.setText("Select Shipment Client.");
            jLabel6.setVisible(true);
            return;
        }
        String ro=jComboBox1.getSelectedItem().toString();
        ro=ro.replace(' ', '?');
        
        try
        {
        Scanner FileScanner = new Scanner(Routes);
        BufferedWriter bw = new BufferedWriter( new FileWriter (tRoutes , false));
        String r , p , s,d;
        while ( FileScanner.hasNext()){
            r = FileScanner.next();
            p = FileScanner.next();
            s = FileScanner.next();
            d=FileScanner.next();
            
            if(ro.equals(r) && ship.equals(s))
            {
                
            }
            else
             bw.write(r+" "+ p+ " " + s+" "+d);
             bw.newLine();
        }
        bw.close();
        FileScanner.close();
        FileScanner = new Scanner(tRoutes);
        bw = new BufferedWriter( new FileWriter (Routes , false));

        while ( FileScanner.hasNext()){
            r = FileScanner.next();
            p = FileScanner.next();
            s = FileScanner.next();
            d=FileScanner.next();
             bw.write(r+" "+ p+ " " + s+" "+d);
            bw.newLine();
        }
        bw.close();
        FileScanner.close();
        }catch(Exception ex){}
        
        list1.removeAll();
        jTextField1.setText("");
        jTextField2.setText("");
        JOptionPane.showMessageDialog(this, "The Route Has Been Deleted Successfuly");
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
