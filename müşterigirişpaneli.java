/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.müşteriaction;
import GUİ.action.yöneticiaction;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author EXCALIBUR
 */
public class müşterigirişpaneli implements CustomPanel {

    private JPanel Panel;
    private JLabel jad, jsoyad, jkullanıcıadı, jşifre, jbaşlık,resim;
    private JTextField tad, tsoyad, tkullanıcıadı, tşifre;
    private JButton giriş,kayıt;
    
     public JButton getKayıt() throws IOException {
        if(this.kayıt == null){
            this.kayıt = new JButton("kayıt ol");
            this.kayıt.setBounds(380,250,100,60);
            this.kayıt.addActionListener(new müşteriaction(this));
        }
        return kayıt;
    }

    public void setKayıt(JButton kayıt) {
        this.kayıt = kayıt;
    }
  
    Image müşres = new ImageIcon(müşterigirişpaneli.class.getResource("/otel22.jpg")).getImage();
    private JLabel getResim(){
        if(this.resim == null){
            this.resim = new JLabel(new ImageIcon(müşres));
            this.resim.setBounds(0,0,800,600);
        }
        return resim;
    }
    public JButton getGiriş() throws IOException {
        if (this.giriş == null) {
            this.giriş = new JButton("giriş yap");
            this.giriş.setBounds(250, 250, 100, 60);
            this.giriş.addActionListener(new müşteriaction(this));
        }
        return giriş;
    }

    public JLabel getJbaşlık() {
        if (this.jbaşlık == null) {
            this.jbaşlık = new JLabel("MÜŞTERİ GİRİŞ EKRANI");
            this.jbaşlık.setBounds(350, 10, 300, 50);
        }
        return jbaşlık;
    }

    public void setJbaşlık(JLabel jbaşlık) {
        this.jbaşlık = jbaşlık;
    }

    public void setGiriş(JButton giriş) {
        this.giriş = giriş;
    }

    public JLabel getJad() {
        if (this.jad == null) {
            this.jad = new JLabel("adı : ");
            this.jad.setBounds(120, 80, 80, 30);
            this.jad.setForeground(Color.BLUE);
        }
        return jad;
    }

    public void setJad(JLabel jad) {
        this.jad = jad;
    }

    public JLabel getJsoyad() {
        if (this.jsoyad == null) {
            this.jsoyad = new JLabel("soyad : ");
            this.jsoyad.setBounds(120, 120, 80, 30);
            this.jsoyad.setForeground(Color.BLUE);

        }
        return jsoyad;
    }

    public void setJsoyad(JLabel jsoyad) {
        this.jsoyad = jsoyad;
    }

    public JLabel getJkullanıcıadı() {
        if (this.jkullanıcıadı == null) {
            this.jkullanıcıadı = new JLabel("kullanıcı adı : ");
            this.jkullanıcıadı.setBounds(120, 160, 80, 30);
            this.jkullanıcıadı.setForeground(Color.BLUE);
        }
        return jkullanıcıadı;
    }

    public void setJkullanıcıadı(JLabel jkullanıcıadı) {
        this.jkullanıcıadı = jkullanıcıadı;
    }

    public JLabel getJşifre() {
        if (this.jşifre == null) {
            this.jşifre = new JLabel("şifre : ");
            this.jşifre.setBounds(120, 200, 80, 30);
            this.jşifre.setForeground(Color.BLUE);
        }
        return jşifre;
    }

    public void setJşifre(JLabel jşifre) {
        this.jşifre = jşifre;
    }

    public JTextField getTad() {
        if (this.tad == null) {
            this.tad = new JTextField();
            this.tad.setBounds(220, 80, 200, 30);
        }
        return tad;
    }

    public void setTad(JTextField tad) {
        this.tad = tad;
    }

    public JTextField getTsoyad() {
        if (this.tsoyad == null) {
            this.tsoyad = new JTextField();
            this.tsoyad.setBounds(220, 120, 200, 30);
        }
        return tsoyad;
    }

    public void setTsoyad(JTextField tsoyad) {
        this.tsoyad = tsoyad;
    }

    public JTextField getTkullanıcıadı() {
        if (this.tkullanıcıadı == null) {
            this.tkullanıcıadı = new JTextField();
            this.tkullanıcıadı.setBounds(220, 160, 200, 30);
        }
        return tkullanıcıadı;
    }

    public void setTkullanıcıadı(JTextField tkullanıcıadı) {
        this.tkullanıcıadı = tkullanıcıadı;
    }

    public JTextField getTşifre() {
        if (this.tşifre == null) {
            this.tşifre = new JTextField();
            this.tşifre.setBounds(220, 200, 200, 30);
        }
        return tşifre;
    }

    public void setTşifre(JTextField tşifre) {
        this.tşifre = tşifre;
    }

    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.setSize(800, 600);
            this.Panel.setLayout(null);
            this.Panel.add(getJad());
            this.Panel.add(getTad());
            this.Panel.add(getJsoyad());
            this.Panel.add(getTsoyad());
            this.Panel.add(getJkullanıcıadı());
            this.Panel.add(getTkullanıcıadı());
            this.Panel.add(getJşifre());
            this.Panel.add(getTşifre());
            this.Panel.add(getJbaşlık());
            try {
                this.Panel.add(this.getKayıt());
            } catch (IOException ex) {
                Logger.getLogger(müşterigirişpaneli.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            try {
                this.Panel.add(getGiriş());
            } catch (IOException ex) {
                Logger.getLogger(müşterigirişpaneli.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.Panel.add(this.getResim());
            this.Panel.setVisible(true);
        }
        return Panel;

    }

}
