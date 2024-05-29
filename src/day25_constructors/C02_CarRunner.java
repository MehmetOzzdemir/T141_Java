package day25_constructors;

public class C02_CarRunner {

    public static void main(String[] args) {


        /*
            Biz bir classtan obje olusturdugumuzda Jav Objeyi olusturup
            olusturdugu class daki TUM INSTANCE variable'larin ve degerlerini
            alıp birer kopyasini olusturur ve objeye yapistirir


            PEKI BU ISI KIM YAPAR?

            Bir obje olusturuldugunda
            o objeye ilk deger atama isleyisini(initialization)
            Constructor yapar.

            diger bir deyisle
            bir constructor calistirmadan,
            bir obje olusturup
            ona ilk deger atamasi yapmak MUMKUN DEGILDIR

            Constructor'lar () kullandiklari icin
            methodlara benzetilirler
            ama constructor'lar java'da ayri bir yapidir.

            Java her class'dan obje olusturelabilmesi icin
            her Class'da GORULMEYEN
            default bir constructor koymustur.

            Yani bir class'da gozle gorulebilir
            bir constructor yoksa
            o class'da DEFAULT CONSTRUCTOR vardir.

            bir classda goırunur bir copnstructor olusturulursa
            Java default constructor'ı SİLER

         */
        C01_Car car1 = new C01_Car();
        System.out.println(car1.brand); //MB
        System.out.println(car1.model); //MB
        System.out.println(car1.year); //1900
        System.out.println(car1.price); //0
        System.out.println("****************");

        car1.brand = "Volkwagen";
        car1.model = "Jetta";
        car1.year = 2011;
        car1.price = 400000;

        C01_Car car2 = new C01_Car();
        System.out.println(car2.brand); //MB
        System.out.println(car2.model); //MB
        System.out.println(car2.year); //1900
        System.out.println(car2.price); //0
        System.out.println("****************");


        C01_Car car3 = new C01_Car();
        //(Class adi) (obje) (arama isareti) (keyword)  (Constructor)


    }
}
