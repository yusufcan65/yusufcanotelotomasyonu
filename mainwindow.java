/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUİ;

import GUİ.action.mainwindowaction;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author EXCALIBUR
 */
public class mainwindow {

    private JFrame window;
    private JPanel panel;
    private JButton personel,müşteri,yönetici;
    private JLabel arkalabel;

    Image arkaplan = new ImageIcon(mainwindow.class.getResource("/otel20.jpg")).getImage();

    public JLabel getArkalabel() {
        if (this.arkalabel == null) {
            this.arkalabel = new JLabel(new ImageIcon(arkaplan));
            this.arkalabel.setBounds(0, -35, 800, 600);
        }
        return arkalabel;
    }

    public void setArkalabel(JLabel arkalabel) {
        this.arkalabel = arkalabel;
    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame();
            this.window.setContentPane(this.getPanel());
            this.getPanel().setSize(800, 700);
            this.getPanel().add(this.getMüşteri());
            this.getPanel().add(this.getPersonel());
            this.getPanel().add(this.getYönetici());
            this.window.setSize(800, 550);
            this.getPanel().add(this.getArkalabel());
            this.window.setLayout(null);
            this.window.setVisible(true);
            this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setLayout(null);
            this.panel.setVisible(true);

        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getPersonel() {
        if (this.personel == null) {
            this.personel = new JButton("personel girişi");
            this.personel.setBounds(300, 250, 200, 60);
            this.personel.addActionListener(new mainwindowaction(this));

        }
        return personel;
    }

    public void setPersonel(JButton personel) {
        this.personel = personel;
    }

    public JButton getMüşteri() {
        if (this.müşteri == null) {
            this.müşteri = new JButton("müşteri girişi");
            this.müşteri.setBounds(50, 250, 200, 60);
            this.müşteri.addActionListener(new mainwindowaction(this));

        }
        return müşteri;
    }

    public void setMüşteri(JButton müşteri) {
        this.müşteri = müşteri;
    }

    public JButton getYönetici() {
        if (this.yönetici == null) {
            this.yönetici = new JButton("yönetici girişi");
            this.yönetici.setBounds(550, 250, 200, 60);
            this.yönetici.addActionListener(new mainwindowaction(this));
        }
        return yönetici;
    }

    public void setYönetici(JButton yönetici) {
        this.yönetici = yönetici;
    }

    public void build() {
        this.getWindow();
    }
}
