/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.personelwindowaction;
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
public class personelwindow implements CustomPanel {

    private JPanel Panel;
    private JButton ekle, sil,listele;
    private JLabel jekle, jsil;

    public JButton getListele() throws IOException {
        if(this.listele == null){
            this.listele = new JButton("Odaları Listele");
            this.listele.setBounds(500,200,150,80);
            this.listele.addActionListener(new personelwindowaction(this));
        }
        return listele;
    }

    public void setListele(JButton listele) {
        this.listele = listele;
    }

    
    public JButton getEkle() throws IOException {
        if (this.ekle == null) {
            this.ekle = new JButton("Oda Ekle");
            this.ekle.setBounds(100, 200, 150, 80);
            this.ekle.addActionListener(new personelwindowaction(this));
        }
        return ekle;
    }

    public void setEkle(JButton ekle) {
        this.ekle = ekle;
    }

    public JButton getSil() throws IOException {
        if (this.sil == null) {
            this.sil = new JButton("Oda Sil");
            this.sil.setBounds(300, 200, 150, 80);
            this.sil.addActionListener(new personelwindowaction(this));
        }
        return sil;
    }

    public void setSil(JButton sil) {
        this.sil = sil;
    }

    public JLabel getJekle(){
        if (this.jekle == null) {
            this.jekle = new JLabel();
            this.jekle.setBounds(50, 50, 150, 80);
            
        }
        return jekle;
    }

    public void setJekle(JLabel jekle) {
        this.jekle = jekle;
    }

    public JLabel getJsil() {
        if (this.jsil == null) {
            this.jsil = new JLabel();
            this.jsil.setBounds(250, 50, 150, 80);
        }
        return jsil;
    }

    public void setJsil(JLabel jsil) {
        this.jsil = jsil;
    }

    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.setSize(800, 600);
            this.Panel.setLayout(null);
            try {
                this.Panel.add(this.getEkle());
            } catch (IOException ex) {
                Logger.getLogger(personelwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(this.getSil());
            } catch (IOException ex) {
                Logger.getLogger(personelwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(getListele());
            } catch (IOException ex) {
                Logger.getLogger(personelwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.Panel.setVisible(true);

        }
        return Panel;
    }
}
