/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apoteklatte.sisfo.ui;

import com.apoteklatte.sisfo.abstractmodel.table.AbsTablePasien;
import com.apoteklatte.sisfo.dao.impl.PasienDaoImpl;
import com.apoteklatte.sisfo.pojo.Pasien;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Sony Vaio
 */
public class FormRestorePasien extends javax.swing.JFrame {

    /**
     * Creates new form FormRestorePasien
     */
    private LandingForm __landingForm;
    
    private PasienDaoImpl pasienDaoImpl;
    private AbsTablePasien absTablePasien;
    
    public FormRestorePasien(LandingForm landingForm) {
        initComponents();
        this.setLocationRelativeTo(this);
        __landingForm = landingForm;
        setIcon();
        
        pasienDaoImpl = new PasienDaoImpl();
        absTablePasien = new AbsTablePasien(pasienDaoImpl);
        absTablePasien.setListPasien(pasienDaoImpl.getListDeletedData());
        jTable1.setModel(absTablePasien);
        this.settingTable();
        jTable1.invalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Form Restore Data Pasien");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Restore Data Pasien");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pasien", 0, 0, new java.awt.Font("Arial", 1, 13))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Restore Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        __landingForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = -1;
        index = jTable1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Pilih salah satu Data Pasien untuk di Restore !");
        } else {
            int result = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin untuk Restore Data Pasien ini? ", "Restore Data Pasien", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Pasien selected = absTablePasien.getListPasien().get(index);
                if (pasienDaoImpl.restore((int) selected.getId())) {
                    JOptionPane.showMessageDialog(rootPane, "Data Pasien yang dipilih berhasil di Restore !");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Data Pasien yang dipilih tidak berhasil di Restore !");
                }
            }
            this.refreshTable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void settingTable() {
        jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(200);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(200);
        jTable1.getColumnModel().getColumn(7).setMaxWidth(180);
    }
    
    private void refreshTable() {
        absTablePasien = new AbsTablePasien(pasienDaoImpl);
        absTablePasien.setListPasien(pasienDaoImpl.getListDeletedData());
        jTable1.setModel(absTablePasien);
        this.settingTable();
        jTable1.invalidate();
    }
    
    private void setIcon() {
        ClassLoader cl = this.getClass().getClassLoader();
        setIconImage(Toolkit.getDefaultToolkit().getImage(cl.getResource("pharmacy_icon.png")));
    }
   
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormRestorePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormRestorePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormRestorePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormRestorePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormRestorePasien().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
