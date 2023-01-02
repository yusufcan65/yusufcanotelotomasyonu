/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.rezervasyonsilaction;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import DAO.rezervasyonDAO;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author EXCALIBUR
 */
public class rezervasyonsilpanel implements CustomPanel{
    private JPanel Panel;
    private JButton silmek;
    private JList list;
    private JScrollPane scrolpane;
    private DefaultListModel Model;
    private JLabel başlık,resim;
    
    Image res = new ImageIcon(rezervasyonsilpanel.class.getResource("/otel23.jpg")).getImage();

    public JLabel getResim() {
        if(this.resim == null){
            this.resim= new JLabel(new ImageIcon(res));
            this.resim.setBounds(0,0,800,600);
            
        }
        return resim;
    }

    public void setResim(JLabel resim) {
        this.resim = resim;
    }

    public JLabel getBaşlık() {
        if(this.başlık == null){
            this.başlık = new JLabel("REZERVASYON SİLME PANELİ");
            this.başlık.setBounds(200,20,200,50);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }


    public JList getList() throws IOException {
        if(this.list == null){
            this.list = new JList(this.getModel());
            this.list.setBounds(100,150,300,300);
            
        }
        return list;
    }

    public void setList(JList list) {
        this.list = list;
    }

    public JScrollPane getScrolpane() throws IOException {
        if(this.scrolpane == null){
            this.scrolpane = new JScrollPane(this.getList());
            this.scrolpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            this.scrolpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.scrolpane.setBounds(100,150,400,250);
        }
        return scrolpane;
    }

    public void setScrolpane(JScrollPane scrolpane) {
        this.scrolpane = scrolpane;
    }

    public DefaultListModel getModel() throws IOException {
        if(this.Model == null){
            rezervasyonDAO rdao = new rezervasyonDAO();
            String[] dizi = rdao.listele("class contract.rezervasyon.txt");
            this.Model = new DefaultListModel();
            int i;
            for(i=0;i<dizi.length;i++){
                this.Model.addElement(dizi[i]);
            }
        }
        return Model;
    }

    public void setModel(DefaultListModel Model) {
        this.Model = Model;
    }

    public JButton getSilmek() throws IOException {
        if(this.silmek == null){
            this.silmek = new JButton("Sil");
            this.silmek.setBounds(250,80,80,50);
            this.silmek.addActionListener(new rezervasyonsilaction(this));
        }
        return silmek;
    }

    public void setSilmek(JButton silmek) {
        this.silmek = silmek;
    }

    
    @Override
    public JPanel getPanel() {
        if(this.Panel == null){
            this.Panel = new JPanel();
            this.Panel.setSize(800,600);
            this.Panel.setLayout(null);
            this.Panel.add(this.getBaşlık());
            try {
                this.Panel.add(this.getList());
            } catch (IOException ex) {
                Logger.getLogger(rezervasyonsilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(this.getScrolpane());
            } catch (IOException ex) {
                Logger.getLogger(rezervasyonsilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                this.Panel.add(this.getSilmek());
            } catch (IOException ex) {
                Logger.getLogger(rezervasyonsilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.Panel.add(this.getResim());
            this.Panel.setVisible(true);
        }
        return Panel;
    } 
}
