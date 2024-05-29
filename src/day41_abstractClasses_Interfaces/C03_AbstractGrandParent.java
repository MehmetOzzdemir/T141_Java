package day41_abstractClasses_Interfaces;

public abstract class C03_AbstractGrandParent {
    // abstract methodlar SADECE abstract yapilar icinde bulunabilir
    //concrete classlarin icinde abstract METHOD OLMAZ

    public abstract void method1();

    public abstract int method2();

    public void method3() {
        System.out.println("GP method 3");
    }

    public int method4() {
        return 2 ;
    }

}
