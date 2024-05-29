package day41_abstractClasses_Interfaces;

public abstract class C04_AbstractParent extends C03_AbstractGrandParent{
    //bir class abstract class yapildiginda child classlari
    //bazi methodlari uyarlamaya ZORUNLU KILMAK icin olusturulur


    //Bir abstract class parenti olan abstract classlardaki
    // abstract methodlari kendisine uyarlamak ZORUNDA DEGİLDİR
    //isterse kendisine uyarlayabilir
    //isterse uyarlamadan yeni concrete veya abstract methodlar ekleyebilir

    public void method1(){
        System.out.println("Parent method1");
    }
    public abstract void method5();

    public int method6(){
        return 0;
    }

}
