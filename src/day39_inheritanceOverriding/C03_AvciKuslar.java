package day39_inheritanceOverriding;

public class C03_AvciKuslar extends C02_Birds {
    protected void hareket() {
        System.out.println("ucarlar");
    }

    protected void beslenme() {
        System.out.println("et yerler");
    }

    protected void pence() {
        System.out.println("pencelidirler");
    }

    protected void gaga() {
        System.out.println("sivri gaga");
    }

    /*
        Omceki gun ozellikjleri variable olarak olusturmustuk
        Ozellikler variable ise ,
        dikkat etmemiz gereken en onemli konu DATA TURU secilen class'dir
        data türü secilen class'dan aramaya baslayip
        ilk buldugumuzu kullaniriz

        ANCAK
        Ozellikler method olarak oluısturuldugunda
        overriding (gecersiz kılmak) devreye girer
        override eden method'lar ve override edilen methodlar
        intellij'de asagi ve yukari yonlu oklarla gosterilirler

        ozellikleri belirleme de
        data türü secilen class ve constructor
        birlikte etkili olurlar

        aramaya data turu secilen class'dan baslanir
        aranan ozellik bulununca
        hemen ilk bulunani kullanmayiz
        buldugumuz method cons' in oldugu class'a kadar
        override edilmisse
        daha guncel bilgiyi kullaniriz

        Farklı bir bakıs acısı ile soylersek
        EGER constructor ve data turu ayni class'dan ise
        ozelliklerin variable veya method olması farketmez
        o class'dan aramaya baslar, ilk buldugumuzu kullaniriz


        EGER constructor ve data turu farklı ise
        variable ve methodlar farkli davranir
        ikisinde de aramaya data turunden baslariz,
        variable ilk buldugunu kullanir
        methodlar ise bulduktan sonra constructor'a kadar daha gunceli var mi diye bakar


     */
    public static void main(String[] args) {
        C03_AvciKuslar kartalAvci = new C03_AvciKuslar();

        System.out.println("****************************************");
        kartalAvci.omur();  // H yasar ve olurler

        kartalAvci.solunum(); // K akcigerle nefes alirlar
        kartalAvci.cogalma();// K yumurtayla cogalirlar
        kartalAvci.kanat(); //K kanatlidir

        kartalAvci.hareket(); // AvK Ucarlar
        kartalAvci.beslenme(); // AvK etle beslşenir
        kartalAvci.pence(); // AvK pencelidirler
        kartalAvci.gaga(); // AvK sivri gagalidir
        System.out.println("****************************************");

        C02_Birds kartalKuslar = new C03_AvciKuslar();

        kartalKuslar.omur();  // H yasar ve olurler

        kartalKuslar.solunum(); // K akcigerle nefes alirlar
        kartalKuslar.cogalma();// K yumurtayla cogalirlar
        kartalKuslar.kanat(); // K kanatlidir

        kartalKuslar.hareket(); // AvK Ucarlar
        kartalKuslar.beslenme(); // AvK etle beslşenir
        //kartlaKuslar.pence(); // CTE Kuslar veya Hayvanlarda Yok
        kartalKuslar.gaga(); // AvK sivri gagalidir


        System.out.println("****************************************");

        C01_Animals kartalHayvan = new C03_AvciKuslar();
        kartalHayvan.omur(); // H yasar ve olurler

        kartalHayvan.solunum(); // K akcigerle nefes alirlar
        kartalHayvan.cogalma();// K yumurtayla cogalirlar
        //kartalHayvan.kanat(); // CTE hayvanlarda yok


        kartalHayvan.hareket(); // AvK Ucarlar
        kartalHayvan.beslenme(); // AvK etle beslşenir
        //kartalKuslar.pence(); // CTE hayvanlarda yok
        //kartalHayvan.gaga(); // CTE hayvanlarda yok

        System.out.println("****************************************");

        C02_Birds kus1 = new C02_Birds();
        kus1.omur(); // H yasar ve olurler

        kus1.solunum(); // K akcigerle nefes alirlar
        kus1.cogalma();// K yumurtayla cogalirlar
        kus1.kanat(); // K kanatlidir


        kus1.hareket(); // H Hareket eder
        kus1.beslenme(); // H beslenir
        //kus1.pence(); // CTE Kuslarda veya hayvanlarda yok
        kus1.gaga(); // K gagalidir


        System.out.println("****************************************");

        C01_Animals kusHayvanlar = new C02_Birds();


        kusHayvanlar.omur(); // H yasar ve olurler

        kusHayvanlar.solunum(); // K akcigerle nefes alirlar
        kusHayvanlar.cogalma();// K yumurtayla cogalirlar
        //kusHayvanlar.kanat(); // CTE hayvanlarda yok


        kusHayvanlar.hareket(); // H Hareket eder
        kusHayvanlar.beslenme(); // H beslenir
        //kusHayvanlar.pence(); // CTE hayvanlarda yok
        //kusHayvanlar.gaga(); // CTE hayvanlarda yok


        System.out.println("****************************************");

        C01_Animals hayvan1 = new C01_Animals();
        hayvan1.omur(); // H yasar ve olurler

        hayvan1.solunum(); // H nefes alirlar
        hayvan1.cogalma();// H cogalirlar
        //hayvan1.kanat(); // // CTE hayvanlarda yok


        hayvan1.hareket(); // H Hareket eder
        hayvan1.beslenme(); // H beslenir
        // hayvan1.pence(); // CTE hayvanlarda yok
        // hayvan1.gaga(); // CTE hayvanlarda yok
    }


}
