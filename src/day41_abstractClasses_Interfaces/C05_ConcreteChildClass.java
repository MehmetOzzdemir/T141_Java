package day41_abstractClasses_Interfaces;

public class C05_ConcreteChildClass extends C04_AbstractParent {
    /*
    Abstract silsileden sonra gelen
    ilk CONCRETE class
    parent classlarda Concrete olmayan ya da concrete yapilmayan
    tüm abstract methodlari uyarlamak ZORUNDADİR
     */
    public int method2() {
        return 10;
    }

    public void method5() {
        System.out.println("Child method5");
    }
}
