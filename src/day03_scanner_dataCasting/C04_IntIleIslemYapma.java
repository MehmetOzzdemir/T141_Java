package day03_scanner_dataCasting;

public class C04_IntIleIslemYapma {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 8;
        int num3 = 10;
        double dbl = 24;

        System.out.println(num1/num2);
        System.out.println(num1/num3);//2.4 fakat ==> 2

        //işleme giren sayıların ikiside Integer olduğundan
        //Java Sonucu Integer Verir

        System.out.println(dbl/num2);
        System.out.println(dbl/num3);

        int a = 27;
        int b = 4;

        double sonuc = a/b;
        System.out.println(sonuc);//ilk önce sonucu bulup sonra double
        //çevirdiği için olmadı
        //Sayılardan birini double a cast etmeliyiz
        sonuc = (double)a/b;
        // a/b yi ondalıklı olarak yazdırın


        System.out.println(sonuc);

    }
}
