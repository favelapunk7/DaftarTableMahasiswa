/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dosen.gui;

import com.app.dosen.entity.Mahasiswa;
import com.app.dosen.model.MahasiswaTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AplikasiDataMahasiswa extends javax.swing.JFrame {
    private MahasiswaTableModel model;
    private List<Mahasiswa> listData;
    /**
     * Creates new form AplikasiDataMahasiswa
     */
    public AplikasiDataMahasiswa() {
        initComponents();
        setLocationRelativeTo(null);
        initData();
        model = new MahasiswaTableModel(listData);
        tableMahasiswa.setModel(model);
    }

    private void initData(){
        listData = new ArrayList<>();
        Mahasiswa mahasiswa = new  Mahasiswa(
                "43A87006160119", "Daniel Eriko Suryanata", 
                "Teknik Informatika", "Perumnas 3, Bekasi", 
                "Danieleriko007@gmail.com", "089681390797");
        listData.add(mahasiswa);
        mahasiswa = new  Mahasiswa(
                "43A87006160117", "Ahmad Zakaria", 
                "Teknik Informatika", "Mustika Jaya, Bekasi", 
                "AhmadZakaria1497@gmail.com", "089681390761");
        listData.add(mahasiswa);
        mahasiswa = new  Mahasiswa(
                "43A87006160118", "Rian Mupti", 
                "Teknik Informatika", "Tambun, Bekasi", 
                "RianMupti@gmail.com", "089681390777");
        listData.add(mahasiswa);
        mahasiswa = new  Mahasiswa(
                "43A87006160123", "Muhammad Ridho", 
                "Teknik Informatika", "Cikarang, Bekasi", 
                "MuhammadRidho@gmail.com", "089681234156");
        listData.add(mahasiswa);
        mahasiswa = new  Mahasiswa(
                "43A87006160114", "Budi Hermawan", 
                "Teknik Informatika", "Cibitung, Bekasi", 
                "BudiHermawan@gmail.com", "089681623574");
        listData.add(mahasiswa);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Mahasiswa");

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMahasiswa.setRowHeight(24);
        tableMahasiswa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableMahasiswa.getTableHeader().setResizingAllowed(false);
        tableMahasiswa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMahasiswa);

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setText("Ubah");

        buttonHapus.setText("Hapus");

        buttonKeluar.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus)
                    .addComponent(buttonKeluar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        
    }//GEN-LAST:event_buttonTambahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiDataMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    // End of variables declaration//GEN-END:variables

}
