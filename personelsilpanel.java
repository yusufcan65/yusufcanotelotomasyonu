/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import DAO.rezervasyonDAO;
import GUİ.action.personelsilaction;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author EXCALIBUR
 */
public class personelsilpanel implements CustomPanel{
    private JPanel Panel;
    private JButton silmek;
    private JList List;
    private JScrollPane scrolpane;
    private DefaultListModel Model;
    private JLabel başlık;

    public JLabel getBaşlık() {
        if(this.başlık == null){
            this.başlık = new JLabel("PERSONEL SİLME PANELİ");
            this.başlık.setBounds(200,20,200,50);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }


    public JList getList() throws IOException {
        if(this.List == null){
            this.List = new JList(this.getModel());
            this.List.setBounds(100,150,300,300);
            
        }
        return List;
    }

    public void setList(JList List) {
        this.List = List;
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
            String[] dizi = rdao.listele("class contract.personel.txt");
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
            this.silmek.setBounds(250,100,80,50);
            this.silmek.addActionListener(new personelsilaction(this));
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
                Logger.getLogger(personelsilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(this.getScrolpane());
            } catch (IOException ex) {
                Logger.getLogger(personelsilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(this.getSilmek());
            } catch (IOException ex) {
                Logger.getLogger(personelsilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.Panel.setVisible(true);
        }
       return Panel;
    }

}
