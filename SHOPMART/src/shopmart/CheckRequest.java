/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmart;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohammad
 */
public class CheckRequest extends javax.swing.JPanel {

    /**
     * Creates new form NewUser
     */
    File Supp= new File("supp.txt");
    File Item= new File("item.txt");
    File PR= new File("pr.txt");
    File PO=new File("po.txt");
    String userName;
    String position="";
    ArrayList<ArrayList<String>> arrayListPR = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> arrayListItem = new ArrayList<ArrayList<String>>();
    
    public CheckRequest() throws RemoteException {
        initComponents();
        firstRun();
      
        
    }
    public void firstRun() throws RemoteException
    {
        getAllRP();
          getAllItems();
        getAllSupplier();
        createTextFile();
        if(position.equals("CLERK"))
            jButton2.setVisible(false);
        else
            jButton2.setVisible(true);
    }
     public void getAllItems()
    {
        arrayListItem.clear();
        if(!Item.exists())
            return;
         try{
               Scanner fs;
               fs= new Scanner(Item);
               while (fs.hasNext()){
                   ArrayList<String> temp= new ArrayList<String>();
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   arrayListItem.add(temp);
               }
               fs.close();

          }
         catch(Exception e){
           }
     
     
     
     
     
    }
    public void createTextFile()
    {
        try{
            if (!PR.exists()){
                final Formatter y;
                y= new Formatter ("pr.txt");
                y.close();
            }
        }
        catch(Exception e){
            
        }
        try{
            if (!PO.exists()){
                final Formatter y;
                y= new Formatter ("po.txt");
                y.close();
            }
        }
        catch(Exception e){
            
        }
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
    public String checkPO(String RID)
    {
        String POID="";
         try{
               Scanner fs;
               fs= new Scanner(PO);
               while (fs.hasNext()){
                   String poid=fs.next();
                   String prid=fs.next();
                   String pby=fs.next();
                   String pd=fs.next();
                   if(RID.equals(prid))
                   {
                       POID=poid;
                       break;
                   }
                   
               }
               fs.close();

          }
         catch(Exception e){
           }
         return POID;
    }
    public void setUserName(String us,String pos)
    {
        userName=us;
        position=pos;
    }
    public int GETPOID() throws RemoteException{
        int LastID=0;
        try{
            Scanner fs;
            fs= new Scanner(PO);
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
    public void makePO(String PRID) throws RemoteException
    {
        String POID=GETPOID()+"";
        java.util.Date date = Calendar.getInstance().getTime();     
        String Date=(date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+date.getDate();
        try{

            BufferedWriter fw= new BufferedWriter(new FileWriter(PO,true));
            fw.write(POID+" "+PRID+" "+userName+" "+Date);
            fw.newLine();
            fw.close();
            JOptionPane.showMessageDialog(null, "The purchased has been submitted successfully");
        }catch(Exception e){   
            System.out.print(e.getMessage());
        }        
        firstRun();
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
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        jLabel1.setText("REQUISTION ");

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("Supplier Information:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel9.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Name");

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Phone Number");

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Address");

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel16.setText("Item Name:");

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 204));
        jLabel17.setText("Name");

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel18.setText("Status:");

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setText("PURCHASE");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 204));
        jLabel19.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Requested By", "Date", "Item", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int sr=jTable1.getSelectedRow();
        String itemID=model.getValueAt(sr, 3).toString();
        String poid=checkPO(model.getValueAt(sr, 0).toString());
        if(poid.length()>0)
        {
            jLabel19.setText("Purchased ID: "+poid);
            jButton2.setEnabled(false);
        }
        else
        {
            jLabel19.setText("Pending");
            jButton2.setEnabled(true);
        }
         for(int i=0;i<arrayListItem.size();i++)
                {
                    if(arrayListItem.get(i).get(0).equals(itemID))
                    {
                        jLabel17.setText(arrayListItem.get(i).get(1));
                        String suppId=arrayListItem.get(i).get(2);
                        for(int j=0;j<arrayList.size();j++)
                        {
                            if(arrayList.get(j).get(0).equals(suppId))
                            {
                          
                                jLabel10.setText(arrayList.get(j).get(1));
                                jLabel11.setText(arrayList.get(j).get(2));
                                jLabel12.setText(arrayList.get(j).get(3));
                                
                                return;
                            }
                        }
                    }
                }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int sr=jTable1.getSelectedRow();

        String poid=model.getValueAt(sr, 0).toString();
        try {
            makePO(poid);
        } catch (RemoteException ex) {
            Logger.getLogger(CheckRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange


   public void getAllRP()
    {
        jTable1.removeAll();
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        arrayListPR.clear();
        if(!Item.exists())
            return;
         try{
               Scanner fs;
               fs= new Scanner(PR);
               while (fs.hasNext()){
                   ArrayList<String> temp= new ArrayList<String>();
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   temp.add(solvePer(fs.next()));
                   arrayListPR.add(temp);
               }
               fs.close();

          }
         catch(Exception e){
           }
         for(int i=0;i<arrayListPR.size();i++)
         {
             model.addRow(new Object[]{arrayListPR.get(i).get(0), arrayListPR.get(i).get(1), 
                 arrayListPR.get(i).get(2),arrayListPR.get(i).get(3),
                 arrayListPR.get(i).get(4)});
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
