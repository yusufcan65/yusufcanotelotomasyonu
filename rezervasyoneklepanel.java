/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

//import GUİ.action.rezervasyonekleaction;
import GUİ.action.rezervasyonekleaction;
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
public class rezervasyoneklepanel implements CustomPanel {

    private JPanel panel;
    private JLabel id, kisisay, giriştarihi, çıkıştarihi, başlık;
    private JTextField jid, jkisisay, jgiriştarihi, jçıkıştarihi;
    private JButton kaydet;

    public JLabel getId() {
        if (this.id == null) {
            this.id = new JLabel("İd : ");
            this.id.setBounds(100, 100, 80, 30);
        }
        return id;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public JLabel getBaşlık() {
        if (this.başlık == null) {
            this.başlık = new JLabel("REZERVASYON ALMAK ŞİMDİ DAHA KOLAY");
            this.başlık.setBounds(250, 20, 300, 60);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }

    public JLabel getKisisay() {
        if (this.kisisay == null) {
            this.kisisay = new JLabel("Kisi Sayisi : ");
            this.kisisay.setBounds(100, 140, 80, 30);

        }
        return kisisay;
    }

    public void setKisisay(JLabel kisisay) {
        this.kisisay = kisisay;
    }

    public JLabel getGiriştarihi() {
        if (this.giriştarihi == null) {
            this.giriştarihi = new JLabel("Giriş Tarihi : ");
            this.giriştarihi.setBounds(100, 180, 80, 30);

        }
        return giriştarihi;
    }

    public void setGiriştarihi(JLabel giriştarihi) {
        this.giriştarihi = giriştarihi;
    }

    public JLabel getÇıkıştarihi() {
        if (this.çıkıştarihi == null) {
            this.çıkıştarihi = new JLabel("Çıkış Tarihi : ");
            this.çıkıştarihi.setBounds(100, 220, 80, 30);
        }
        return çıkıştarihi;
    }

    public void setÇıkıştarihi(JLabel çıkıştarihi) {
        this.çıkıştarihi = çıkıştarihi;
    }

    public JTextField getJid() {
        if (this.jid == null) {
            this.jid = new JTextField();
            this.jid.setBounds(200, 100, 200, 30);
        }
        return jid;
    }

    public void setJid(JTextField jid) {
        this.jid = jid;
    }

    public JTextField getJkisisay() {
        if (this.jkisisay == null) {
            this.jkisisay = new JTextField();
            this.jkisisay.setBounds(200, 140, 200, 30);
        }
        return jkisisay;
    }

    public void setJkisisay(JTextField jkisisay) {
        this.jkisisay = jkisisay;
    }

    public JTextField getJgiriştarihi() {
        if (this.jgiriştarihi == null) {
            this.jgiriştarihi = new JTextField();
            this.jgiriştarihi.setBounds(200, 180, 200, 30);
        }
        return jgiriştarihi;
    }

    public void setJgiriştarihi(JTextField jgiriştarihi) {
        this.jgiriştarihi = jgiriştarihi;
    }

    public JTextField getJçıkıştarihi() {
        if (this.jçıkıştarihi == null) {
            this.jçıkıştarihi = new JTextField();
            this.jçıkıştarihi.setBounds(200, 220, 200, 30);
        }
        return jçıkıştarihi;
    }

    public void setJçıkıştarihi(JTextField jçıkıştarihi) {
        this.jçıkıştarihi = jçıkıştarihi;
    }

    public JButton getKaydet() throws IOException {
        if (this.kaydet == null) {
            this.kaydet = new JButton("Kaydet");
            this.kaydet.setBounds(250, 280, 80, 50);
            this.kaydet.addActionListener(new rezervasyonekleaction(this));
        }
        return kaydet;
    }

    public void setKaydet(JButton kaydet) {
        this.kaydet = kaydet;
    }

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setLayout(null);
            this.panel.add(this.getId());
            this.panel.add(this.getJid());
            this.panel.add(this.getKisisay());
            this.panel.add(this.getJkisisay());
            this.panel.add(this.getGiriştarihi());
            this.panel.add(this.getJgiriştarihi());
            this.panel.add(this.getÇıkıştarihi());
            this.panel.add(this.getJçıkıştarihi());
            this.panel.add(this.getBaşlık());
            try {
                this.panel.add(this.getKaydet());
            } catch (IOException ex) {
                Logger.getLogger(rezervasyoneklepanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.setVisible(true);
        }

        return panel;
    }

}
