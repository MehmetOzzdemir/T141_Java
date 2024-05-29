package day41_abstractClasses_Interfaces;

public class C02_JavaCar extends C01_AbstractCar{
    @Override
    public void motor() {
        System.out.println("JavaCar Motor");

    }

    @Override
    public void yakit() {
        System.out.println("JavaCar Yakit");
    }

    @Override
    public void sanzuman() {
        System.out.println("JavaCar Sanzuman");

        //parent abstrazt class daki
        //abstract methodlari child class a
        //IMPLEMENT (uyarlama) etmek zorundayiz
    }

    public void sunroof(){
        System.out.println("JavaCar Sunroof");

        //parent class daki concrete methodlar ise
        //child class'lar tarafindan IMPLEMENT edilmek ZORUNDA DEGİLDİR
        //child class isterse parent class daki concrete methodu direkt kullanir
        //isterse @override edip kendisine uyarlar
    }



}
