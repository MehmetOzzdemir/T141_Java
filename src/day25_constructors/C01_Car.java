package day25_constructors;

public class C01_Car {

    String brand = "marka belirtilmedi";
    String model = "model beirtilmedi";
    int year = 1900;
    int price;


    C01_Car() {
        //Javanin classlara koydugu default constructor
        //  1- parametresizdir ve
        //  2-bodysinde kod yoktur
        //  3-Gorunmez

    }

    C01_Car(int a) {
        //Bir yapinin Constructor olabilmesi icin
        //Su iki sarti MUTLAKA saglamalidir.
        // 1 - ismi class ismi ile tamamen ayni olmalidir
        // 2 - return type'i olmamalisir.
        //Bu iki sarti saglamak kosuluyla
        //signaturlari farkli istediginiz kadar
        //Constructor olusturabilirisniz

    }

    void method1() {
        //Bir method ile constructor arasindaki fark
        //Methodlarin MUTLAKA return type'lari olur
        //ama Constructor'larin return typr'i olmaz
    }


}
