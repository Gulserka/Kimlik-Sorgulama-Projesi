public class Kimlik_Pojo {


    public String isimSoyisim;
    private String adres;
    private String telefon;
    private String kimlikNumarasi;


    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {

        this.isimSoyisim = isimSoyisim;
    }

    public String getAdres() {

        return adres;
    }

    public void setAdres(String adres) {

        this.adres = adres;
    }

    public String getTelefon() {

        return telefon;
    }

    public void setTelefon(String telefon) {

        this.telefon = telefon;
    }

    public String getKimlikNumarasi() {

        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {

        this.kimlikNumarasi = kimlikNumarasi;
    }

    @Override
    public String toString() {
        return
                "kimlikNumarasi=" + kimlikNumarasi +
                "Isim Soyisim=" + isimSoyisim  +
                ", Adres=" + adres  +
                ", Telefon=" + telefon;
    }

    public Kimlik_Pojo(String kimlikNumarasi, String isimSoyisim, String adres, String telefon) {
        this.isimSoyisim = isimSoyisim;
        this.adres = adres;
        this.telefon = telefon;
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public Kimlik_Pojo() {
    }
}
