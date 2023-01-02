/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.personelekleaction;
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
public class personeleklepanel implements CustomPanel{
    private JPanel panel;
    private JLabel ad,soyad,kadı,sifre,başlık;
    private JTextField jad,jsoyad,jkadı,jsifre;
    private JButton kaydet;

    public JLabel getKadı() {
        if(this.kadı== null){
            this.kadı= new JLabel("Kullanıcı Adı : ");
            this.kadı.setBounds(100,180,100,30);
        }
        return kadı;
    }

    public void setKadı(JLabel kadı) {
        this.kadı = kadı;
    }

    public JLabel getSifre() {
        if(this.sifre == null){
            this.sifre = new JLabel("Sifre : ");
            this.sifre.setBounds(100,220,100,30);
        }
        return sifre;
    }

    public void setSifre(JLabel sifre) {
        this.sifre = sifre;
    }

    public JTextField getJkadı() {
        if(this.jkadı==null){
            this.jkadı= new JTextField();
            this.jkadı.setBounds(200,180,200,30);
        }
        return jkadı;
    }

    public void setJkadı(JTextField jkadı) {
        this.jkadı = jkadı;
    }

    public JTextField getJsifre() {
        if(this.jsifre==null){
            this.jsifre=new JTextField();
            this.jsifre.setBounds(200,220,200,30);
        }
        return jsifre;
    }

    public void setJsifre(JTextField jsifre) {
        this.jsifre = jsifre;
    }



    
    public JLabel getBaşlık() {
        if(this.başlık == null){
            this.başlık = new JLabel("PERSONEL EKLEME SAYFASI");
            this.başlık.setBounds(250,20,200,50);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }
    public JLabel getAd() {
        if(this.ad == null){
            this.ad = new JLabel("Ad : ");
            this.ad.setBounds(100,100,100,30);
        }
        return ad;
    }

    public void setAd(JLabel Ad) {
        this.ad = Ad;
    }

    public JLabel getSoyad() {
        if(this.soyad == null){
            this.soyad = new JLabel("Soyad : ");
            this.soyad.setBounds(100,140,100,30);
        }
        return soyad;
    }

    public void setSoyad(JLabel soyad) {
        this.soyad = soyad;
    }


    public JTextField getJad() {
        if(this.jad == null){
            this.jad = new JTextField();
            this.jad.setBounds(200,100,200,30);
        }
        return jad;
    }

    public void setJad(JTextField jad) {
        this.jad = jad;
    }

    public JTextField getJsoyad() {
        if(this.jsoyad == null){
            this.jsoyad = new JTextField();
            this.jsoyad.setBounds(200,140,200,30);
            
        }
        return jsoyad;
    }

    public void setJsoyad(JTextField jsoyad) {
        this.jsoyad = jsoyad;
    }

    public JButton getKaydet() throws IOException {
        if(this.kaydet == null){
            this.kaydet = new JButton("Kaydet");
            this.kaydet.setBounds(300,300,80,50);
            this.kaydet.addActionListener(new personelekleaction(this));
        }
        return kaydet;
    }

    public void setKaydet(JButton kaydet) {
        this.kaydet = kaydet;
    }
    
    
    @Override
    public JPanel getPanel() {
        if(this.panel == null){
            this.panel = new JPanel();
            this.panel.setSize(800,550);
            this.panel.setLayout(null);
            this.panel.add(getBaşlık());
            this.panel.add(getAd());
            this.panel.add(getJad());
            this.panel.add(getSoyad());
            this.panel.add(getJsoyad());
            this.panel.add(this.getSifre());
            this.panel.add(this.getJsifre());
            this.panel.add(this.getKadı());
            this.panel.add(this.getJkadı());
            try {
                this.panel.add(getKaydet());
            } catch (IOException ex) {
                Logger.getLogger(personeleklepanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.setVisible(true);
        }
        return panel;
    }
    
}
