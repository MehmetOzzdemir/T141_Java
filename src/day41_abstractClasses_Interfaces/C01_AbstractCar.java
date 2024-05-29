package day41_abstractClasses_Interfaces;

public  abstract class C01_AbstractCar {

    // bu class i car uretmek isteyen tum markalarin ,
    // kendilerine uyarlamasi gerekn method lari belirlemek icin olusturduk

    //motoru mecbur yapalim
    public abstract void motor();
    //Abstract methods cannot have a body



    // sunroof istege bagli
    public void sunroof(){
        System.out.println("Arabalar isterse Sunroof kullanabilir");
        // child classlari kendisine uyarlama konusunda
        // serbest birakmak istedigimiz methodlari
        // concrete (abstract olmayan) method olarak olustururuz
    }



    //yakit zorunlu olmali
    public abstract void yakit();
        // abstract methodlar concrete methodlar gibi
        // bir islem yapmak uzere DEGİL
        // child class lari UYARLAMAYA MECBUR etmek için kullanilir
        // standartlarda olan yazilar gibidir
        //ornegin yakit methodu "Bir aracin car olabilmesi icin yakit methodu olmasi zorunludur"
        //anlamina gelir


    // Geri Gorus Kamerasi zorunlu degil
    public void geriGorusKamerasi(){
        System.out.println("Arabalar isterse geri görüş kamerasi kullanabilir");

    }

    //sanziman duz vites, otomatik vites zorunlu
    public abstract void sanzuman();
}
