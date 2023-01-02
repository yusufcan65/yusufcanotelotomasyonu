/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.odaekleaction;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


/**
 *
 * @author EXCALIBUR
 */
public class odaeklepanel implements CustomPanel{

    private JPanel panel;
    private JLabel tip,id,fiyat,no,başlık,resim;
    private JTextField jtip,jid,jfiyat,jno;
    private JButton kaydet;
    
    Image odaresim = new ImageIcon(odaeklepanel.class.getResource("/otel11.jpg")).getImage();
    public JLabel getResim() {
        if(this.resim == null){
            this.resim = new JLabel(new ImageIcon(odaresim));
            this.resim.setBounds(0,0,800,600);
        }
        return resim;
    }

    public void setResim(JLabel resim) {
        this.resim = resim;
    }
    
    
    
    public JLabel getId() {
        if(this.id == null){
            this.id = new JLabel("İd : ");
            this.id.setBounds(100,220,100,30);
        }
        return id;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public JTextField getJid() {
        if(this.jid == null){
            this.jid = new JTextField();
            this.jid.setBounds(200,220,200,30);
        }
        return jid;
    }

    public void setJid(JTextField jid) {
        this.jid = jid;
    }
   

    public JLabel getBaşlık() {
        if(this.başlık == null){
            this.başlık = new JLabel("Oda Ekleme Paneli");
            this.başlık.setBounds(300,20,200,50);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }

    public JLabel getTip() {
        if(this.tip == null){
            this.tip = new JLabel("Tip : ");
            this.tip.setBounds(100,100,100,30);
        }
        return tip;
    }

    public void setTip(JLabel tip) {
        this.tip = tip;
    }

    public JLabel getFiyat() {
        if(this.fiyat == null){
            this.fiyat = new JLabel("Fiyat : ");
            this.fiyat.setBounds(100,140,100,30);
        }
        return fiyat;
    }

    public void setFiyat(JLabel fiyat) {
        this.fiyat = fiyat;
    }

    public JLabel getNo() {
        if(this.no == null){
            this.no = new JLabel("No : ");
            this.no.setBounds(100,180,100,30);
        }
        return no;
    }

    public void setNo(JLabel no) {
        this.no = no;
    }

    public JTextField getJtip() {
        if(this.jtip == null){
            this.jtip = new JTextField();
            this.jtip.setBounds(200,100,200,30);
        }
        return jtip;
    }

    public void setJtip(JTextField jtip) {
        this.jtip = jtip;
    }

    public JTextField getJfiyat() {
        if(this.jfiyat == null){
            this.jfiyat = new JTextField();
            this.jfiyat.setBounds(200,140,200,30);
        }
        return jfiyat;
    }

    public void setJfiyat(JTextField jfiyat) {
        this.jfiyat = jfiyat;
    }

    public JTextField getJno() {
        if(this.jno == null){
            this.jno = new JTextField();
            this.jno.setBounds(200,180,200,30);
        }
        return jno;
    }

    public void setJno(JTextField jno) {
        this.jno = jno;
    }

    public JButton getKaydet() throws IOException {
        if(this.kaydet == null){
            this.kaydet = new JButton("Kaydet");
            this.kaydet.setBounds(250,280,100,50);
            this.kaydet.addActionListener(new odaekleaction(this));
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
            this.panel.setSize(800,600);
            this.panel.setLayout(null);
            this.panel.add(getTip());
            this.panel.add(getJtip());
            this.panel.add(getFiyat());
            this.panel.add(getJfiyat());
            this.panel.add(getNo());
            this.panel.add(getJno());
            this.panel.add(getBaşlık());
            this.panel.add(this.getId());
            this.panel.add(this.getJid());
           
            try {
                this.panel.add(getKaydet());
            } catch (IOException ex) {
                Logger.getLogger(odaeklepanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.add(this.getResim());
            this.panel.setVisible(true);
        }
        return panel;
    }
    
}
