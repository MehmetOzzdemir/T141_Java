package day26_constructors;

public class C03_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        car1.brand = "BMW";
        car1.model = "5.20";
        car1.year = 2001;
        car1.price = 4000;

        System.out.println(car1);
        /*
         * C01_Car Ozellikleri
         * brand : BMW
         * model : 5.20
         * year : 2001
         * price : 4000
         */




    /*
        Bir obje olusturuldugunda
        ya class'daki standart ozelliklere sahip olur
        ve sonradan tek tek ozelliklere deger atmasi yapilir
        car1 etc.

        ya da
        tasimasini istedigimiz ozellikler
        parametre olarak construcor'a yollanip
        constructor icerisinde atamalar yapilir
        boylece objenin olusturuldugu satira
        istedigimiz ozelliklere sahip bir obje olusmus olur
     */
        System.out.println();

        C01_Car car2 = new C01_Car("Tofas", "Sahin", 1990, 150000);
        System.out.println(car2);
        System.out.println();
        C01_Car car3 = new C01_Car("Nisssan", "Note", 2020, 2000);
        System.out.println(car3);
        System.out.println();
        C01_Car car4 = new C01_Car("Opel", "Corsa", 2010, 4500);
        System.out.println(car4);


    }
}
