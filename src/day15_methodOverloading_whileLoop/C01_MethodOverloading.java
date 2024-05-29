package day15_methodOverloading_whileLoop;

public class C01_MethodOverloading {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.substring(5));//Candir
        System.out.println(str.substring(5, 8));//Can


        //Bir class' da  aynı isimde birden fazla method olusturmasina
        //METHOD OVERLOADING denir.

        Sum(3, 4);//toplam int int ==>iki int toplamı
        Sum(3, 4, 6);
        Sum(4, 4.5);
        Sum(5.6, 4);
        Sum(5.6, 4.4);


    }

    /*
    Kural1 : Bir class'in icinde herseyi aynı olan 2 method olusturulamaz
            parametre isimlerini,accses modifier'i veya static durumunu degistirmek yeterli olmaz


    Kural2 : Bir class içinde ayni isimde birden fazla method olusturabilmek icin(overloaading)
            method'larin SIGNATURE'lari farkli olmalidir.


   Method Signatur : Method ismi + parametrelerin data turleri
   Overlooading olmasi icin ismi degistirmemek gerekiyor
   Signature'i degistirmek icin 3 ihtimalimiz vardir
   -parametre sayisini degistirerek
   -data türlerini degistirmek
   -farkli data türündeki parametrelein yerini degistirmek


     */
    public static void Sum(int a, int b) {
        System.out.println("İki Integer'in Toplami : " + (a + b));
    }

    public static void Sum(int a, int b, int c) {
        System.out.println("Üc Integer'in Toplami : " + (a + b + c));
    }

    public static void Sum(double a, int b) {
        System.out.println("Double ve Integer'in Toplami : " + (a + b));
    }

    public static void Sum(int a, double b) {
        System.out.println("Integer ve Double' in Toplami : " + (a + b));
    }

    public static void Sum(double a, double b) {
        System.out.println("İki Double'in Toplami : " + (a + b));
    }
}
