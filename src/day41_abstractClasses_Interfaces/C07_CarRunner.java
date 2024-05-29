package day41_abstractClasses_Interfaces;

public class C07_CarRunner {
    public static void main(String[] args) {

        /*
        Abstract class lar class olduklari icin
        cons vardir AMA abstract class larda abstract methodlar oldugundan
        abstract classlardan OBJE OLUSTURULAMAZ

        data turu olarak abstract classlar secilebilir
        fakat Cons. olarak concrete olan bir child class secilmelidir
        */


        /*
        C01_AbstractCar car1 = new C01_AbstractCar();


        car1.geriGorusKamerasi();
        //Arabalar isterse geri görüş kamerasi kullanabilir

        car1.motor();
        car1.sanzuman();

*/
        C01_AbstractCar car1 = new C02_JavaCar();


        car1.geriGorusKamerasi();
        //Arabalar isterse geri görüş kamerasi kullanabilir

        car1.motor(); // JavaCar Motor
        car1.sanzuman(); // JavaCar Sanzuman

    }
}
