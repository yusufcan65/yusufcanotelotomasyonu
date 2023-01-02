package contract;

public class müşteri {

    private String ad;
    private String soyad;
    private String sifre;
    private String kullanıcıadı;

   
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullanıcıadı() {
        return kullanıcıadı;
    }

    public void setKullanıcıadı(String kullanıcıadı) {
        this.kullanıcıadı = kullanıcıadı;
    }
     public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    @Override
    public String toString() {
        return getAd()+" "+getSoyad()+" "+getKullanıcıadı()+" "+getSifre();
    }
    
}
