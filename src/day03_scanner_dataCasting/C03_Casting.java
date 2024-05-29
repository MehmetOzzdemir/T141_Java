package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Casting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        boolean bl1 = true;
        char chr1 = '$';
        byte byt1  = 23;
        int num2= 20;
        float lft1= 45.2f;
        double d = 44.1;
        String str = "I love Java ";

        //Bir data türündeki variable başka
        // data türünden değer atamaya casting denir

        int num = 20;
        double d1 = num;
        System.out.println(d1);
        //Bazı data türlerine başka türden değer atayamazsınız.


        //str = int;
        //str = d

        //Sayı barındırran variable data türleri arasında geçiş olabilir
        //Ancak her data türündeki değer her data türüne atanamaz


        /*
        1-Küçük data türünbdeki değer, Büyük data türündeki variable'a atanırsa
        Java bunu otomatik olarak yapar (Auto Widening)
        2-Daha geniş data türündeki değeri,daha dar kapsamlı variable'a atamak isterseniz
        Java bunu otomatik yapmaz
        data kayıpları ve farklı sonuçlar olabileceği için
        sorumluluğu sizin almanızı ister(Explicit Narrowing )

        Sorumluluğu almak için daraltmak istediğiniz değerin önüne
        parantez içerisinde , dönüştürmek istediğiniz data türüne yazmalsınız0
         */


        d=byt1; //auto Widening
        d=num2;//auto Widening
        d=lft1;//auto Widening

        lft1=(float) byt1;//Explicit Narrowing
        lft1=(float) num2;//Explicit Narrowing
        lft1=(float) d;//Explicit Narrowing

        num2= byt1;//auto Widening
        num2 = (int)lft1;
        num2 = (int)d;

        /*
        byt1=num2;
        byt1= lft1;
        byt1=d;     */



    }
}
