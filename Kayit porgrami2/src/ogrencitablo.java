import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baser
 */
public class ogrencitablo extends javax.swing.JFrame {

    /**
     * Creates new form ogrencitablo
     */
    Ders d=new Ders();
    score sc=new score();
    public ogrencitablo() {
        initComponents();
        sc.fillScoreJtable2(jTable4,"");
        d.fillCourseJtable(jTableders);
        jTable4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is alwaysabnm/,
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField_Studentid = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableders = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ogrenci ID", "Ders ID", "puani", "notu"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jTable4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable4KeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jTextField_Studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StudentidActionPerformed(evt);
            }
        });
        jTextField_Studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_StudentidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_StudentidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_StudentidKeyTyped(evt);
            }
        });

        jTableders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "DERS :"
            }
        ));
        jTableders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabledersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableders);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jTextField_Studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jTextField_Studentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
//        int rowIndex=jTable1.getSelectedRow();
//        jTextField_Studentid.setText(jTable1.getValueAt(rowIndex, 0).toString());
//        jTextField_score.setText(jTable1.getValueAt(rowIndex,2).toString());
        //mouse bastiginda kaaytili kisileri aktariyor
        //        int rowIndex=jTable1.getSelectedRow();
        //
        //        if(model.getValueAt(rowIndex, 3).toString().equals("Erkek")){
            //            jRadioButton_Male.setSelected(true);
            //            jRadioButton_female.setSelected(false);
            //        }
        //        else{
            //            jRadioButton_female.setSelected(true);
            //            jRadioButton_Male.setSelected(false);
            //        }
        //        jTextField_STD_ID.setText(model.getValueAt(rowIndex,0).toString());
        //        jTextField_Fname.setText(model.getValueAt(rowIndex,1).toString());
        //        jTextField_LName.setText(model.getValueAt(rowIndex,2).toString());
        //        jTextField_telefon.setText(model.getValueAt(rowIndex,5).toString());
        //        jTextField_adres.setText(model.getValueAt(rowIndex,6).toString());
        //
        //        Date bdate;
        //        try {
            //            bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            //            jDateChooserBirthdata.setDate(bdate);
            //        } catch (ParseException ex) {
            //            Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable4KeyPressed

    }//GEN-LAST:event_jTable4KeyPressed

    private void jTable4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable4KeyReleased

        //        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
        //        {
            //            int rowIndex=jTable1.getSelectedRow();
            //            jTextField_STD_ID.setText(model.getValueAt(rowIndex,0).toString());
            //            jTextField_Fname.setText(model.getValueAt(rowIndex,1).toString());
            //            jTextField_LName.setText(model.getValueAt(rowIndex,2).toString());
            //            jTextField_telefon.setText(model.getValueAt(rowIndex,5).toString());
            //            jTextField_adres.setText(model.getValueAt(rowIndex,6).toString());
            //
            //            if(model.getValueAt(rowIndex, 3).toString().equals("Erkek")){
                //                jRadioButton_Male.setSelected(true);
                //                jRadioButton_female.setSelected(false);
                //            }
            //            else{
                //                jRadioButton_female.setSelected(true);
                //                jRadioButton_Male.setSelected(false);
                //            }
            //            Date bdate;
            //            try {
                //                bdate=new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
                //                jDateChooserBirthdata.setDate(bdate);
                //            } catch (ParseException ex) {
                //                Logger.getLogger(manageStudentsForm.class.getName()).log(Level.SEVERE, null, ex);
                //            }
            //        }
    }//GEN-LAST:event_jTable4KeyReleased

    private void jTextField_StudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StudentidActionPerformed

    private void jTextField_StudentidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StudentidKeyTyped
      
    }//GEN-LAST:event_jTextField_StudentidKeyTyped

    private void jTable4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable4KeyTyped
    
    }//GEN-LAST:event_jTable4KeyTyped

    private void jTextField_StudentidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StudentidKeyPressed
       jTable4.setModel(new DefaultTableModel(null,new Object[]{"Ogrenci ID","Ders","Puani","Notu"}));
       jTable4.setVisible(true);
        sc.fillScoreJtable2(jTable4,jTextField_Studentid.getText());
    }//GEN-LAST:event_jTextField_StudentidKeyPressed

    private void jTextField_StudentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StudentidKeyReleased
         jTable4.setModel(new DefaultTableModel(null,new Object[]{"Ogrenci ID","Ders","Puani","Notu"}));
        sc.fillScoreJtable2(jTable4,jTextField_Studentid.getText());
    }//GEN-LAST:event_jTextField_StudentidKeyReleased

    private void jTabledersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabledersMouseClicked
//        int index =jTable1.getSelectedRow();
//        jTextFieldId.setText(jTable1.getValueAt(index, 0).toString());
//        jTextFieldders.setText(jTable1.getValueAt(index, 1).toString());

    }//GEN-LAST:event_jTabledersMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ogrencitablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ogrencitablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ogrencitablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ogrencitablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ogrencitablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable4;
    public static javax.swing.JTable jTableders;
    public static javax.swing.JTextField jTextField_Studentid;
    // End of variables declaration//GEN-END:variables
}
