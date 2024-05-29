package day42_interfaces;

public class H_ChildIstisnaKullanimi implements G_IntefacedeBodysiOlanMethodOlurMu {


    @Override
    public void method1() {

    }

    //Parent Interface de default olarak isaretlenen method3()
    //ve static olarak isaretlenen method4()
    //istisnai methodlar oldugu icin IMPLEMENT EDILMEK ZORUNDA DEGİLDİR

    public static void main(String[] args) {

        /*
            Bir interface de sonradan eklenecek methodun
            child class lar tarafindan implement edilmesini zorunlu olmasini
            cıkarmak icin default / static keywordlari kullanilabilr

            Bu iki kelime arasinda method olusturmada HICBIR FARK yoktur

            aralarindaki fark child class lardan bu methodlara erisim YONTEMINDEDİR

            - static method a statick yontemle yani
              interfaceAdi.staticMethodAdi(); ulasabilirsiniz

            - default keyword ile olusturulan methoda ise
                obje uzerinden ulasabiliriz
         */

        G_IntefacedeBodysiOlanMethodOlurMu.method4();

        H_ChildIstisnaKullanimi obj1 = new H_ChildIstisnaKullanimi();
        obj1.method3();

        G_IntefacedeBodysiOlanMethodOlurMu obj2 = new H_ChildIstisnaKullanimi();
        obj2.method3();
    }
}
