/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apoteklatte.sisfo.ui;

import com.apoteklatte.sisfo.abstractmodel.table.AbsTableTransaksiDetailResep;
import com.apoteklatte.sisfo.dao.impl.TransaksiDetailResepDaoImpl;
import com.apoteklatte.sisfo.dao.impl.TransaksiResepDaoImpl;
import com.apoteklatte.sisfo.model.ModelResepDetail;
import com.apoteklatte.sisfo.pojo.TransaksiDetailResep;
import com.apoteklatte.sisfo.pojo.TransaksiResep;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FredillaPrima
 */
public class FormDetailTransaksiResep extends javax.swing.JFrame {

    /**
     * Creates new form FormDetailTransaksiResep
     */
    
    private FormViewTransaksiResep __form;
    private TransaksiResep __resep;
    
    private TransaksiDetailResepDaoImpl transaksiDetailResepDaoImpl;
    private AbsTableTransaksiDetailResep absTableTransaksiDetailResep;
    
    private TransaksiResepDaoImpl transaksiResepDaoImpl;
    
    public FormDetailTransaksiResep(FormViewTransaksiResep formViewTransaksiResep) {
        initComponents();
        this.setLocationRelativeTo(this);
        __form = formViewTransaksiResep;
        setIcon();
        
        transaksiDetailResepDaoImpl = new TransaksiDetailResepDaoImpl();
        transaksiResepDaoImpl = new TransaksiResepDaoImpl();
    }

    public TransaksiResep getResep() {
        return __resep;
    }

    public void setResep(TransaksiResep __resep) {
        this.__resep = __resep;
    }
    
    public void showData() {
        if (__resep != null) {
            txtDokter.setText(__resep.getDokter().getNamaDokter());
            txtPasien.setText(__resep.getPasien().getNamaPasien());
            txtKet.setText(__resep.getKeterangan());
            txtAlamat.setText(__resep.getPasien().getAlamatPasien());
            dcTglBuat.setDate(__resep.getTglPembuatan());
            dcTglAmbil.setDate(__resep.getTglPengambilan());
            txtNoResep.setText(__resep.getNoResep());
            
            absTableTransaksiDetailResep = new AbsTableTransaksiDetailResep(transaksiDetailResepDaoImpl);
            absTableTransaksiDetailResep.setListTransaksi(transaksiDetailResepDaoImpl.getListDataByResep((int) __resep.getId()));
            jTable1.setModel(absTableTransaksiDetailResep);
            this.settingTable();
            jTable1.invalidate();   
        }
    }
    
    private void settingTable() {
        jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(180);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(110);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(200);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDokter = new javax.swing.JTextField();
        txtPasien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKet = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dcTglAmbil = new com.toedter.calendar.JDateChooser();
        dcTglBuat = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtNoResep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Form View Detail Transaksi Resep Obat");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Detail Transaksi Resep Obat");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Transaksi Resep", 0, 0, new java.awt.Font("Arial", 1, 13))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nama Dokter:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Nama Pasien:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Keterangan");

        txtDokter.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDokter.setEnabled(false);

        txtPasien.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPasien.setEnabled(false);

        txtKet.setColumns(20);
        txtKet.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtKet.setRows(5);
        jScrollPane1.setViewportView(txtKet);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Tanggal Pembuatan:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Tanggal Pengambilan:");

        dcTglAmbil.setDateFormatString("dd / MM / yyyy");
        dcTglAmbil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        dcTglBuat.setDateFormatString("dd / MM / yyyy");
        dcTglBuat.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Alamat Pasien:");

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtAlamat.setRows(5);
        txtAlamat.setEnabled(false);
        jScrollPane3.setViewportView(txtAlamat);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("No Resep:");

        txtNoResep.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNoResep.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Resep:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDokter)
                    .addComponent(txtPasien)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txtNoResep))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcTglAmbil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcTglBuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcTglBuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dcTglAmbil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jScrollPane2.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Save Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Edit Transaksi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(259, 259, 259))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        __form.refreshTable();
        __form.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (dcTglAmbil.getDate() == null || dcTglBuat.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Data Tanggal Dibuat dan Tanggal Pengambilan Resep harus diisi !");
        } else {
            TransaksiResep trans = __resep;
            trans.setTglPengambilan(dcTglAmbil.getDate());
            trans.setTglPembuatan(dcTglBuat.getDate());
            trans.setKeterangan(txtKet.getText());
            transaksiResepDaoImpl.save(trans);
            
            JOptionPane.showMessageDialog(rootPane, "Data Tanggal Dibuat dan Tanggal Pengambilan Resep berhasil disimpan !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        List<TransaksiDetailResep> listData = absTableTransaksiDetailResep.getListTransaksi();
        List<ModelResepDetail> listDetail = new ArrayList<ModelResepDetail>();
        ModelResepDetail detail = null;
        for (TransaksiDetailResep item : listData) {
            detail = new ModelResepDetail();
            detail.setObat(item.getObat());
            detail.setKeterangan(item.getKeterangan());
            detail.setQty(item.getQty());
            detail.setSignaHari(item.getSignaHari());
            detail.setSignaObat(item.getSignaObat());
            detail.setTglHabis(item.getTglObatHabis());
            
            listDetail.add(detail);
        }
        this.setVisible(false);
        FormTransaksiResep form = new FormTransaksiResep(__resep, this, __form, listDetail, 1);
        form.setDokter(__resep.getDokter());
        form.setPasien(__resep.getPasien());
        form.showDataDokter();
        form.showDataPasien();
        form.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
//            java.util.logging.Logger.getLogger(FormDetailTransaksiResep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormDetailTransaksiResep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormDetailTransaksiResep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormDetailTransaksiResep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormDetailTransaksiResep().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcTglAmbil;
    private com.toedter.calendar.JDateChooser dcTglBuat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtDokter;
    private javax.swing.JTextArea txtKet;
    private javax.swing.JTextField txtNoResep;
    private javax.swing.JTextField txtPasien;
    // End of variables declaration//GEN-END:variables
}
