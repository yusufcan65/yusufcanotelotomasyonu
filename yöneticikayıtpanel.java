/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.yöneticiaction;
import GUİ.action.yöneticikayıtaction;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author EXCALIBUR
 */
public class yöneticikayıtpanel implements CustomPanel{
     private JPanel panel;
    private JButton kaydol;
    private JLabel ad,soyad,şifre,kadı,başlık;
    private JTextField tad,tsoyad,tşifre,tkadı;

    public JButton getKaydol() throws IOException {
        if(this.kaydol==null){
            this.kaydol = new JButton("kayıt ol");
            this.kaydol.setBounds(250,280,100,60);
            this.kaydol.addActionListener(new yöneticikayıtaction(this));
            
        }
       
        return kaydol;
    }

    public void setKaydol(JButton kaydol) {
        this.kaydol = kaydol;
    }


    public JLabel getBaşlık() {
        if(this.başlık == null){
            this.başlık = new JLabel("YÖNETİCİ KAYIT EKRANI");
            this.başlık.setBounds(250,20,200,50);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }

  

    public JLabel getAd() {
        if(this.ad == null){
            this.ad = new JLabel("Adı : ");
            this.ad.setBounds(100,100,80,30);
        }
        return ad;
    }

    public void setAd(JLabel ad) {
        this.ad = ad;
    }

    public JLabel getSoyad() {
        if(this.soyad == null){
            this.soyad = new JLabel("Soyad : ");
            this.soyad.setBounds(100,140,80,30);
        }
        return soyad;
    }

    public void setSoyad(JLabel soyad) {
        this.soyad = soyad;
    }

   
    public JLabel getŞifre() {
        if(this.şifre == null){
            this.şifre = new JLabel("Şifre : ");
            this.şifre.setBounds(100,220,80,30);
        }
        return şifre;
    }

    public void setŞifre(JLabel şifre) {
        this.şifre = şifre;
    }

    public JLabel getKadı() {
        if(this.kadı == null){
            this.kadı = new JLabel("Kullanıcı Adı : ");
            this.kadı.setBounds(100,180,80,30);
        }
        return kadı;
    }

    public void setKadı(JLabel kadı) {
        this.kadı = kadı;
    }

    public JTextField getTad() {
        if(this.tad == null){
            this.tad = new JTextField();
            this.tad.setBounds(200,100,200,30);
        }
        return tad;
    }

    public void setTad(JTextField tad) {
        this.tad = tad;
    }

    public JTextField getTsoyad() {
        if(this.tsoyad == null){
            this.tsoyad = new JTextField();
            this.tsoyad.setBounds(200,140,200,30);
        }
        return tsoyad;
    }

    public void setTsoyad(JTextField tsoyad) {
        this.tsoyad = tsoyad;
    }

  

    public JTextField getTşifre() {
        if(this.tşifre == null){
            this.tşifre = new JTextField();
            this.tşifre.setBounds(200,220,200,30);
        }
        return tşifre;
    }

    public void setTşifre(JTextField tşifre) {
        this.tşifre = tşifre;
    }

    public JTextField getTkadı() {
        if(this.tkadı == null){
            this.tkadı = new JTextField();
            this.tkadı.setBounds(200,180,200,30);
        }
        return tkadı;
    }

    public void setTkadı(JTextField tkadı) {
        this.tkadı = tkadı;
    }
    

    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            this.panel = new JPanel();
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getAd());
            this.panel.add(getTad());
            this.panel.add(getSoyad());
            this.panel.add(getTsoyad());
            this.panel.add(getKadı());
            this.panel.add(getTkadı());
            this.panel.add(getŞifre());
            this.panel.add(getTşifre());
            this.panel.add(getBaşlık());
            try {
                this.panel.add(this.getKaydol());
            } catch (IOException ex) {
                Logger.getLogger(yöneticikayıtpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.setVisible(true);
        }
        return panel;
    }
    
}
