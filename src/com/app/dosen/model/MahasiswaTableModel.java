/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dosen.model;

import com.app.dosen.entity.Mahasiswa;
import java.awt.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class MahasiswaTableModel extends AbstractTableModel {
    private java.util.List<Mahasiswa> list;

    public MahasiswaTableModel() {
    }

    public MahasiswaTableModel(java.util.List<Mahasiswa> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return list.get(i).getValue(i1);
    }
    
    private String[] columns = {"NIM","Nama","Jurusan","Alamat","Email","Telepon"};
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
    
}
