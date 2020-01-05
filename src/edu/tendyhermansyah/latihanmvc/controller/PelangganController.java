/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tendyhermansyah.latihanmvc.controller;

import edu.tendyhermansyah.latihanmvc.model.PelangganModel;
import edu.tendyhermansyah.latihanmvc.view.PelangganVIew;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    } 
    
    public void resetForm(PelangganVIew view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && notelp.equals("")){
            
        }else{
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganVIew view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (notelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        }else{
            model.simpanForm();
        }
    }
}
