/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.müşteriaction;
import GUİ.action.personelaction;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author EXCALIBUR
 */
public class personelgirişpaneli implements CustomPanel {

    private JPanel Panel;
    private JButton giriş,kayıt;
    private JLabel ad, soyad, şifre, kAdı, başlık,resim;
    private JTextField jad, jsoyad, jşifre, jkadı;

    
    Image re = new ImageIcon(personelgirişpaneli.class.getResource("/otel24.jpg")).getImage();

    public JLabel getResim() {
        if(this.resim == null){
            this.resim= new JLabel(new ImageIcon(re));
            this.resim.setBounds(0,0,800,600);
        }
        return resim;
    }

    public void setResim(JLabel resim) {
        
        this.resim = resim;
    }
    
    public JButton getKayıt() throws IOException {
        if(this.kayıt == null){
            this.kayıt = new JButton("kayıt ol");
            this.kayıt.setBounds(380,280,100,60);
            this.kayıt.addActionListener(new personelaction(this));
        }
        return kayıt;
    }

    public void setKayıt(JButton kayıt) {
        this.kayıt = kayıt;
    }
    public JButton getGiriş() throws IOException {
        if (this.giriş == null) {
            this.giriş = new JButton("giriş yap");
            this.giriş.setBounds(250, 280, 100, 60);
            this.giriş.addActionListener(new personelaction(this));

        }
        return giriş;
    }

    public void setGiriş(JButton giriş) {
        this.giriş = giriş;
    }

    public JLabel getAd() {
        if (this.ad == null) {
            this.ad = new JLabel("Ad : ");
            this.ad.setBounds(100, 100, 80, 30);
            this.ad.setForeground(Color.white);

        }
        return ad;
    }

    public void setAd(JLabel ad) {
        this.ad = ad;
    }

    public JLabel getSoyad() {
        if (this.soyad == null) {
            this.soyad = new JLabel("Soyad : ");
            this.soyad.setBounds(100, 140, 80, 30);
            this.soyad.setForeground(Color.WHITE);
        }
        return soyad;
    }

    public void setSoyad(JLabel soyad) {
        this.soyad = soyad;
    }

    public JLabel getŞifre() {
        if (this.şifre == null) {
            this.şifre = new JLabel("Şifre : ");
            this.şifre.setBounds(100, 220, 80, 30);
            this.şifre.setForeground(Color.WHITE);
            
        }
        return şifre;
    }

    public void setŞifre(JLabel şifre) {
        this.şifre = şifre;
    }

    public JLabel getkAdı() {
        if (this.kAdı == null) {
            this.kAdı = new JLabel("Kullanıcı Adı : ");
            this.kAdı.setBounds(100, 180, 80, 30);
            this.kAdı.setForeground(Color.WHITE);
        }
        return kAdı;
    }

    public void setkAdı(JLabel kAdı) {
        this.kAdı = kAdı;
    }

   

    public JLabel getBaşlık() {
        if (this.başlık == null) {
            this.başlık = new JLabel("PERSONEL GİRİŞ EKRANI ");
            this.başlık.setBounds(300, 20, 200, 50);
            this.başlık.setForeground(Color.WHITE);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }

    public JTextField getJad() {
        if (this.jad == null) {
            this.jad = new JTextField();
            this.jad.setBounds(200, 100, 200, 30);
        }
        return jad;
    }

    public void setJad(JTextField jad) {
        this.jad = jad;
    }

    public JTextField getJsoyad() {
        if (this.jsoyad == null) {
            this.jsoyad = new JTextField();
            this.jsoyad.setBounds(200, 140, 200, 30);
        }
        return jsoyad;
    }

    public void setJsoyad(JTextField jsoyad) {
        this.jsoyad = jsoyad;
    }

    public JTextField getJşifre() {
        if (this.jşifre == null) {
            this.jşifre = new JTextField();
            this.jşifre.setBounds(200, 220, 200, 30);
        }
        return jşifre;
    }

    public void setJşifre(JTextField jşifre) {
        this.jşifre = jşifre;
    }

    public JTextField getJkadı() {
        if (this.jkadı == null) {
            this.jkadı = new JTextField();
            this.jkadı.setBounds(200, 180, 200, 30);
        }
        return jkadı;
    }

    public void setJkadı(JTextField jkadı) {
        this.jkadı = jkadı;
    }


    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.setSize(800, 600);
            this.Panel.setLayout(null);
            this.Panel.add(getAd());
            this.Panel.add(getSoyad());
            this.Panel.add(getBaşlık());
            this.Panel.add(getŞifre());
            this.Panel.add(getJad());
            this.Panel.add(getJsoyad());
            this.Panel.add(getJşifre());
            this.Panel.add(getkAdı());
            this.Panel.add(getJkadı());
           
            try {
                this.Panel.add(this.getKayıt());
            } catch (IOException ex) {
                Logger.getLogger(personelgirişpaneli.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(getGiriş());
            } catch (IOException ex) {
                Logger.getLogger(personelgirişpaneli.class.getName()).log(Level.SEVERE, null, ex);
            }
             this.Panel.add(this.getResim());
            this.Panel.setVisible(true);

        }
        return Panel;
    }

}
