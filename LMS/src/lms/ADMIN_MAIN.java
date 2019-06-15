/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 *
 * @author mohammad
 */
public class ADMIN_MAIN extends javax.swing.JPanel {

    /**
     * Creates new form ADMIN_MAIN
     */
    AddLibrarian AL;
    AddBook AB;
    EditLibrarian EL;
    EditBook EB;
    BookDet BD;
    CheckOut CO;
    CheckIn CI;
    Report R;
    public ADMIN_MAIN() {
        initComponents();
        this.AL= new AddLibrarian();
         AL.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
         this.AB= new AddBook();
         AB.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
          this.EL= new EditLibrarian();
         EL.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
          this.EB= new EditBook();
         EB.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
                   this.BD= new BookDet();
         BD.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
                   this.CO= new CheckOut();
         CO.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
                           this.CI= new CheckIn();
         CI.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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
                           this.R= new Report();
         R.addComponentListener(new ComponentListener(){
            @Override
            public void componentHidden(ComponentEvent e) {
                jPanel1.setVisible(true);//To change body of generated methods, choose Tools | Templates.
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

        jPanel1 = new javax.swing.JPanel();
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

        setMaximumSize(new java.awt.Dimension(599, 413));
        setMinimumSize(new java.awt.Dimension(599, 413));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ADMIN PANEL");

        jButton1.setText("ADD Librarian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit/Delete Librarian");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ADD Book");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit/Delete Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Check out books");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("View/Search books");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Generate report");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("LogOut");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton6.setText("Check In Books");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(137, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);

                 AB.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(AB)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(AB)
             );


            this.setComponentZOrder(AB, 0);  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);

                 AL.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(AL)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(AL)
             );


            this.setComponentZOrder(AL, 0);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        
                 EL.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(EL)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(EL)
             );


            this.setComponentZOrder(EL, 0);  
            EL.getAllLib();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           jPanel1.setVisible(false);
      
                 EB.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(EB)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(EB)
             );


            this.setComponentZOrder(EB, 0);  
            EB.getAllBook();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
            jPanel1.setVisible(false);
      
                 BD.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(BD)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(BD)
             );


            this.setComponentZOrder(BD, 0);  
            BD.loadBooks();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          jPanel1.setVisible(false);
      
                 CO.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(CO)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(CO)
             );


            this.setComponentZOrder(CO, 0);  
            CO.loadBooks();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
              jPanel1.setVisible(false);
      
                 CI.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(CI)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(CI)
             );


            this.setComponentZOrder(CI, 0);  
            CI.loadchID();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);
      
                 R.setVisible(true);
                         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);

             this.setLayout(jPanel1Layout);
             jPanel1Layout.setHorizontalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(R)
             );
             jPanel1Layout.setVerticalGroup(
                 jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 30, Short.MAX_VALUE)
                 .addComponent(R)
             );


            this.setComponentZOrder(R, 0);  
            R.generateReport();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
