package day36_encapsulation_inheritance;

public class C05_EncapsulaClass {
    /*
        1-  Satis elemanlari,satis tutarina atama yapabilsin
            bu atanan satislar,otomatik olarak toplam satisa eklensin
            ama satis tutarina son atanan degeri,satis gorevlileri goremesin
        2-  Toplam satis tutari olarak hesaplanan deger
            herkes tarafindan gorulebilsin
            ama kimse satis tutarina deger atayamasin

     */

    private int satisTutari; //Setter
    private int toplamSatisMiktari; //getter

    private int encapsuleSayi;  //getter and setter

    public int publisSayi;



    public int getToplamSatisMiktari() {
        return toplamSatisMiktari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisMiktari+=satisTutari;
    }

    public int getEncapsuleSayi() {
        return encapsuleSayi;
    }

    public void setEncapsuleSayi(int encapsuleSayi) {
        this.encapsuleSayi = encapsuleSayi;
    }
/*
    Encapsulation bir mecburiyet degil,
    bize yardimci olmak icin Java'nin hazirladigi bir yontemdir

    EGER bir class uyesi icin READ ve WRITE yetkilerini ayirmak isterseniz
    ENCAPSULATION kullanabilirsiniz

        1- Adından da anlasilabilecegi gibi
            once bu yetkileri ayirmak istedigimiz variablelara
            vormal yollardan erisimi ENGELLEMELISINIZ

         2- Sadece deger atamsi(WRITE) yapilmasini istedigimiz
            variable'lar icin SETTER
            Sadece sorunmesini (READ) istedigimiz
            variable'lar icin GETTER
            Methodlari olusturalim
     */

}
