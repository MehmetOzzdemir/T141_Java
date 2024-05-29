package day26_constructors;

public class C02_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println(car1);
        /*
        C01_Car Ozellikleri
        brand : marka belirtilmedi
        model : model beirtilmedi
        year : 1900
        price : 0
         */


        C01_Car car2;

        //System.out.println(car2.price);
        //java: variable car2 might not have been initialized

        //bir consturctor calismadan objeye
        // ilk deger atamasi YAPİLAMAZ
        //ilk deger atamasi yapilmadan da kullanilamaz

        System.out.println(new C01_Car().price); // 0

        //Esitligin sadece sag tarafi olursa
        //Constructor calistigi icin
        //class a gidip yeni bir obje olusturup bize getirir
        //ANCAK getirdgi objeyi kaydetmedigi icin
        //O Obje sadecce o satir icin VAR OLUR




    }
}
