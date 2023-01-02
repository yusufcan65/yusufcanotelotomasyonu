/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contract;

/**
 *
 * @author EXCALIBUR
 */
public class rezervasyon {

    private String id;
    private String giriştarihi;
    private String çıkıştarihi;
    private String kişisayisi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGiriştarihi() {
        return giriştarihi;
    }

    public void setGiriştarihi(String giriştarihi) {
        this.giriştarihi = giriştarihi;
    }

    public String getÇıkıştarihi() {
        return çıkıştarihi;
    }

    public void setÇıkıştarihi(String çıkıştarihi) {
        this.çıkıştarihi = çıkıştarihi;
    }

    public String getKişisayisi() {
        return kişisayisi;
    }

    public void setKişisayisi(String kişisayisi) {
        this.kişisayisi = kişisayisi;
    }

    @Override
    public String toString() {
        return getId() + " " + getKişisayisi() + " " + getGiriştarihi() + " " + getÇıkıştarihi() + "#";
    }

}
