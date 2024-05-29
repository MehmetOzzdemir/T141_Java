package day26_constructors;

public class C05_CarRunner {
    public static void main(String[] args) {

        //sadecxe marka ve fiyatin ataama yapilacagi bir constructor olusturun


        C04_Car car1 = new C04_Car("Tesla", 15000);
        System.out.println(car1);
        System.out.println();

        C04_Car car2 = new C04_Car("Audi","A4",2020,360000);
        System.out.println(car2);
    }


}
