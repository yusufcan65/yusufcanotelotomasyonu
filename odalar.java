/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contract;

import java.util.Objects;

/**
 *
 * @author EXCALIBUR
 */
public class odalar {

    private String id;
    private String fiyat;
    private String tipi;
    private String odano;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    public String getOdano() {
        return odano;
    }

    public void setOdano(String odano) {
        this.odano = odano;
    }

    
    @Override
    public String toString() {
        return getId()+" "+getFiyat()+" "+getTipi()+" "+getOdano()+"#";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final odalar other = (odalar) obj;
        return Objects.equals(this.id, other.id);
    }

    
    
    
    

}
