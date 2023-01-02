/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.müşteriwindowaction;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author EXCALIBUR
 */
public class müşteriwindow implements CustomPanel {

    private JPanel panel;
    private JButton ekle, sil,listele;
    private JLabel jekle, esil;

    public JButton getListele() throws IOException {
        if(this.listele == null){
            this.listele = new JButton("rezervasyonlarım");
            this.listele.setBounds(500,300,150,80);
            this.listele.addActionListener(new müşteriwindowaction(this));
        }
        return listele;
    }

    public void setListele(JButton listele) {
        this.listele = listele;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getEkle() throws IOException {
        if (this.ekle == null) {
            this.ekle = new JButton("rezervasyon ekle");
            this.ekle.setBounds(100, 300, 150, 80);
            this.ekle.addActionListener(new müşteriwindowaction(this));
        }
        return ekle;
    }

    public void setEkle(JButton ekle) {
        this.ekle = ekle;
    }

    public JButton getSil() throws IOException {
        if (this.sil == null) {
            this.sil = new JButton("rezervasyon sil");
            this.sil.setBounds(300, 300, 150, 80);
            this.sil.addActionListener(new müşteriwindowaction(this));
        }
        return sil;
    }

    public void setSil(JButton sil) {
        this.sil = sil;
    }

    public JLabel getJekle() {
        if (this.jekle == null) {
            this.jekle = new JLabel();
            this.jekle.setBounds(85, 50, 200, 150);

        }
        return jekle;
    }

    public void setJekle(JLabel jekle) {
        this.jekle = jekle;
    }

    public JLabel getEsil() {
        if (this.esil == null) {
            this.esil = new JLabel();
            this.esil.setBounds(420, 50, 200, 150);
        }
        return esil;
    }

    public void setEsil(JLabel esil) {
        this.esil = esil;
    }

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setLayout(null);
            try {
                this.panel.add(this.getEkle());
            } catch (IOException ex) {
                Logger.getLogger(müşteriwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(this.getSil());
            } catch (IOException ex) {
                Logger.getLogger(müşteriwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(getListele());
            } catch (IOException ex) {
                Logger.getLogger(müşteriwindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.add(this.getJekle());
            this.panel.add(this.getEsil());

            this.panel.setVisible(true);

        }
        return panel;
    }

}
