package contract;

public class yönetici {

    private String ad;
    private String soyad;
    private String kullaniciadi;
    private String sifre;
    
  /*  public yönetici(){
        this.setAd("yusuf");
        this.setSoyad("can");
        this.setKullaniciadi("ycan65");
        this.setSifre("123");
    }*/
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

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return getAd() + " " + getSoyad() + " " + getKullaniciadi() + " " + getSifre();
    }

}
