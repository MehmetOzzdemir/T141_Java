package day42_interfaces;

public interface G_IntefacedeBodysiOlanMethodOlurMu {

    /*
        Büyük bir projede bircok interface bulunabilir
        bu interface ler yuzlerce/ binlerce class tarafindan implement edilmiş olabilir

        Eger gunun birinde bir interface'e
        yeni bir method eklemeniz gerekirse
        bugune kadar o interface'i implement etmis olan
        BUTUN CHILD CLASS'lar yeni method u implement etmedigi icin CTE verir
        tum child class lari bulmamiz
        her bir class in durumunu inceleyip
        yeni methodu o child class lara uyarlamamiz GEREKİR

        Developer larin bu tur ihtiyaclar,
        SORUNSUZ COZEBİLMESİ icin
        JAVA 8 ile istisnai bir yol olusturulmustur

        Java ozel 2 keyword belirleyerek
        Interface icinde bu kleyword lere sahip olan methodlarin
        body si olmasina ve boylece implement edilme zorunlulugu OLMAMASİNA olanak tanimistir

        bu iki keyword : default , static
     */


    public void method1();  //interface i icinde oldugundan
    // biz yazmasakta Java otomatik olarak abstract kabul eder


    // public void method2(){
    //Interface abstract methods cannot have body
    //biz abstract yazmasak da Java otomatik olarak abstract kabul eder
    // ve body olusturmamiza izin vermez

    //}


    public default void method3() {
        // burada default un access modiifier olmasi mumkun degil
        //cunku access modifier olarak public var
        //buradaki default 1. istisnai keyword udur.
        System.out.println("Interface icinde default method");
    }

    public static void method4() {
        //istisna olarak default ve static keywor iceren method olusturursak
        //MUTLAKA body si olmalidir
        System.out.println("Inteface icinde static Method");

    }


}
