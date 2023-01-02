/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.odasilaction;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import DAO.odalarDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EXCALIBUR
 */
public class odasilpanel implements CustomPanel {

    private JPanel Panel;
    private JButton sil;
    private JList List;
    private JScrollPane scrolpane;
    private DefaultListModel Model;
    private JLabel başlık;

    public JLabel getBaşlık() {
        if (this.başlık == null) {
            this.başlık = new JLabel("ODA SİLME PANELİ");
            this.başlık.setBounds(200, 20, 200, 50);
        }
        return başlık;
    }

    public void setBaşlık(JLabel başlık) {
        this.başlık = başlık;
    }

    public JList getList() throws IOException {
        if (this.List == null) {
            this.List = new JList(this.getModel());
            this.List.setBounds(100, 150, 300, 300);

        }
        return List;
    }

    public void setList(JList List) {
        this.List = List;
    }

    public JScrollPane getScrolpane() throws IOException {
        if (this.scrolpane == null) {
            this.scrolpane = new JScrollPane(this.getList());
            this.scrolpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            this.scrolpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.scrolpane.setBounds(100, 150, 400, 250);
        }
        return scrolpane;
    }

    public void setScrolpane(JScrollPane scrolpane) {
        this.scrolpane = scrolpane;
    }

    public DefaultListModel getModel() throws IOException {
        if (this.Model == null) {
            odalarDAO Odao = new odalarDAO();
            String[] dizi = Odao.listele("class contract.odalar.txt");
            this.Model = new DefaultListModel();
            int i;
            for (i = 0; i < dizi.length; i++) {
                this.Model.addElement(dizi[i]);
            }
        }
        return Model;
    }

    public void setModel(DefaultListModel Model) {
        this.Model = Model;
    }

    public JButton getSil() throws IOException {
        if (this.sil == null) {
            this.sil = new JButton("Sil");
            this.sil.setBounds(250, 80, 120, 50);
            this.sil.addActionListener(new odasilaction(this));

        }
        return sil;
    }

    public void setSil(JButton sil) {
        this.sil = sil;
    }

    @Override
    public JPanel getPanel() {
        if (this.Panel == null) {
            this.Panel = new JPanel();
            this.Panel.setSize(800, 600);
            this.Panel.add(this.getBaşlık());
            try {
                this.Panel.add(this.getList());
            } catch (IOException ex) {
                Logger.getLogger(odasilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(this.getScrolpane());
            } catch (IOException ex) {
                Logger.getLogger(odasilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.Panel.add(this.getSil());
            } catch (IOException ex) {
                Logger.getLogger(odasilpanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.Panel.setLayout(null);

        }
        return Panel;
    }

}
