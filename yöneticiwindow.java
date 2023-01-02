/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.yöneticiwindowaction;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author EXCALIBUR
 */
public class yöneticiwindow implements CustomPanel {

    private JPanel panel;
    private JButton ekle, sil,listele;
    private JLabel jekle, jsil;
    

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setLayout(null);
            try {
                this.panel.add(getEkle());
            } catch (IOException ex) {
                Logger.getLogger(yöneticiwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(getSil());
            } catch (IOException ex) {
                Logger.getLogger(yöneticiwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(getListele());
            } catch (IOException ex) {
                Logger.getLogger(yöneticiwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.setVisible(true);
        }
        return panel;
    }
    
    public JButton getListele() throws IOException {
        if(this.listele == null){
            this.listele = new JButton("personel listele");
            this.listele.setBounds(500,300,150,80);
            this.listele.addActionListener(new yöneticiwindowaction(this));
        }
        return listele;
    }

    public void setListele(JButton listele) {
        this.listele = listele;
    }
   

    public JButton getEkle() throws IOException {
        if (this.ekle == null) {
            this.ekle = new JButton("Personel Ekle");
            this.ekle.setBounds(100, 300, 150, 80);
            this.ekle.addActionListener(new yöneticiwindowaction(this));
        }
        return ekle;
    }

    public void setEkle(JButton ekle) {
        this.ekle = ekle;
    }

    public JButton getSil() throws IOException {
        if (this.sil == null) {
            this.sil = new JButton("Personel Sil");
            this.sil.setBounds(300, 300, 150, 80);
            this.sil.addActionListener(new yöneticiwindowaction(this));
        }
        return sil;
    }

    public void setSil(JButton sil) {
        this.sil = sil;
    }

    public JLabel getJekle() {
        return jekle;
    }

    public void setJekle(JLabel jekle) {
        this.jekle = jekle;
    }

    public JLabel getJsil() {
        return jsil;
    }

    public void setJsil(JLabel jsil) {
        this.jsil = jsil;
    }

}
