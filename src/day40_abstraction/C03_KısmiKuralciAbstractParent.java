package day40_abstraction;

public abstract class C03_KısmiKuralciAbstractParent {
    /*

        Bir class isterse kendisini parent edinecek child classlarin
        mutlaka implement etmesi gereken methodlari belirleyebilir

        ornegin bu claszimiz kendisinde bulunan method1 ve method2'yi
        C03'u parent edinen tum child classlarin implement etmesi zorunlu kilmak istiyor

        bu zorunlılıgu saglamak icin
        1- kural kotmak isteyen class abstract olmalidir
            bir class i abstract yapmak icin class deklerasyonuna abstract yazmak yeterlidir

        2- bir abstract class icindeki tum methodlar zornlu degildir
            child class larin implement etmesini zorunluı kilmak istedigimiz methodlari da abstract yapmaliyiz

            bir method'u abstract yapmak icin

                -method deklarasyonuna abstract yazmaliyiz
                -abstract methodlar bugune kadar kullandigimiz methodlar gibi degildir
                 abstract methodlari normal bir method olarak degil,
                 sadece bir kurali belirten standar yazisi gibi dusunebilirsiniz
                -abstract methodlar sadece kural cumlesidir
                    adindan da anlasilacagi gibi (abstract = soyut yani body'si olmayan )
                    abstract methoslarin body'si olmaz
     */


    //child class larin kendine uyarlamasi zorunlu olsun

    public abstract void method1();
    //child class larin kendine uyarlamasi zorunlu olsun

    public abstract void method2();

    //child class larin kendine uyarlamasi zorunlu degil , child in istedigine kalsin

    public void method3() {

    }

    public void method4() {

    }


}
