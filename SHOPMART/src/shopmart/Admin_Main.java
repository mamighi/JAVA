/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopmart;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohammad
 */
public class Admin_Main extends javax.swing.JPanel {

    /**
     * Creates new form Admin_Main
     */
    NewUser nu= new NewUser();
    NewSupplier ns= new NewSupplier();
    NewItem ni= new NewItem();
    CheckRequest cr=new CheckRequest();
    String UserName="admin";
    CreatePR cpr;
    CheckPurchased cpo=new CheckPurchased();
    EditUser eu= new EditUser();
    EditItem ei= new EditItem();
    EditSupplier es= new EditSupplier();
    public Admin_Main() throws RemoteException {
        this.cpr = new CreatePR();
        initComponents();
        nu.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        ns.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        ni.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        cpr.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        cr.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        cpo.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        eu.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        ei.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
        es.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                ADMINMAINPANEL.setVisible(true);//To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void componentResized(ComponentEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e) {
               //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ADMINMAINPANEL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(770, 500));
        setMinimumSize(new java.awt.Dimension(770, 500));
        setPreferredSize(new java.awt.Dimension(770, 500));

        ADMINMAINPANEL.setBackground(new java.awt.Color(255, 255, 255));
        ADMINMAINPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ADMINMAINPANEL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("WLECOME ADMIN");

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setText("NEW USER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setText("NEW ITEM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setText("NEW SUPPLIER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton4.setText("CREATE PURCHASE REQUEST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton5.setText("DISPLAY PURCHASE REQUETS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton7.setText("LIST OF PURCHASE ORDERS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton8.setText("LOG OUT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton9.setText("EXIT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton6.setText("EDIT USER");
        jButton6.setActionCommand("EDIT USER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton10.setText("EDIT ITEM");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton11.setText("EDIT SUPPLIER");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADMINMAINPANELLayout = new javax.swing.GroupLayout(ADMINMAINPANEL);
        ADMINMAINPANEL.setLayout(ADMINMAINPANELLayout);
        ADMINMAINPANELLayout.setHorizontalGroup(
            ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1))
                    .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                                .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(88, 88, 88)
                                .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        ADMINMAINPANELLayout.setVerticalGroup(
            ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINMAINPANELLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
                .addGap(25, 25, 25)
                .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton10)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(ADMINMAINPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton11)
                    .addComponent(jButton7))
                .addGap(50, 50, 50)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADMINMAINPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADMINMAINPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            ADMINMAINPANEL.setVisible(false);

        
            nu.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(nu)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(nu)
        );
        nu.refresh();
       this.setComponentZOrder(nu, 0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
                // TODO add your handling code here:
            ADMINMAINPANEL.setVisible(false);
  
            ni.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(ni)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(ni)
        );
        try {
            ni.refresh();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setComponentZOrder(ni, 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
                // TODO add your handling code here:
            ADMINMAINPANEL.setVisible(false);
  
            ns.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(ns)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(ns)
        );
        try {
            ns.refresh();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.setComponentZOrder(ns, 0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                 ADMINMAINPANEL.setVisible(false);
  
            cpr.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(cpr)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(cpr)
        );
        cpr.setUserName(UserName);
        try {
            cpr.firstRun();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin_Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       this.setComponentZOrder(cpr, 0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                    ADMINMAINPANEL.setVisible(false);
  
            cr.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(cr)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(cr)
        );
        cr.setUserName(UserName,"ADMIN");
        try {
            cr.firstRun();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin_Main.class.getName()).log(Level.SEVERE, null, ex);
        }

       this.setComponentZOrder(cr, 0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
                this.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
                      ADMINMAINPANEL.setVisible(false);
  
            cpo.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(cpo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(cpo)
        );
        
        cpo.firstRun();

       this.setComponentZOrder(cpo, 0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                              ADMINMAINPANEL.setVisible(false);
  
            eu.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(eu)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(eu)
        );
        
        eu.refresh();

       this.setComponentZOrder(eu, 0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
               // TODO add your handling code here:
                              ADMINMAINPANEL.setVisible(false);
  
            ei.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(ei)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(ei)
        );
        
        try {
            ei.refresh();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin_Main.class.getName()).log(Level.SEVERE, null, ex);
        }

       this.setComponentZOrder(ei, 0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
                                      ADMINMAINPANEL.setVisible(false);
  
            es.setVisible(true);
                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
                   
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(es)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addComponent(es)
        );
        
        try {
            es.refresh();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin_Main.class.getName()).log(Level.SEVERE, null, ex);
        }

       this.setComponentZOrder(es, 0);
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADMINMAINPANEL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
