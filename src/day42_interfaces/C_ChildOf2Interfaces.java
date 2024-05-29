package day42_interfaces;

public class C_ChildOf2Interfaces implements B_ParentInterface02 {

    //parenti olan tum yapilardaki
    //Concrete olmayan methodlari
    //implement etmek ZORUNDADİR


    public void method1() {

    }


    public String method2() {

        return null;
    }


    public String method3() {
        return null;
        // bir class birden fazla parent edinirse
        // (bir class ve /veya istedigi kadar interface)
        //ve bu parent larda ayni isimde methodlar varsa
        //  -parent classlardaki ayni isimde olan methodlarin
        //  -return typeşar, ayni ise sorun olmaz
        //  -return typelari farkli ise iki parenti da mutlu etme sansi olmadigindan
        //  ya parentlardan birinden vazgecmelisiniz
        // ya da parentlarda degisiklik yapmalisiniz

        //parent edibilen interface lerde degisiklik yapmak
        // o interface i daha once implement eden pek cok class da
        // degisikliklere sebep olacagindan
        // ZORUNLU KALMADIKCA tercih edilmez


    }


    public int method4() {

        return 0;
    }
}
