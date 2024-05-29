package day05_concatenation_mantiksalKarsilatirmalar;

public class C03_KarsilkastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(2 * a + 4 == 14);//true
        System.out.println(a + 4 == 2 * a - 1);// 9 == 9 True

        int b = 3;
        System.out.println(b = 3 * a - 7);//8
        System.out.println("b : " + b);//b : 8
        System.out.println(b == 2 * a + 8);// 8 == 18 false

        //Java da eşit değildir harşılatırması için != kullanılır
        //a : 5 b : 8

        System.out.println(a + 3 != 2 * b);// 8 != 15 True

        System.out.println(2 * a != b + 2);// 10 !=10 false

        //Matematikteki < ve > Java'da da vardır

        System.out.println(2 * a < b - 3);// 10 <5 ==> false
        System.out.println(!(a+7 > b+8));// !(12>16) ==> !(false) ==> true
        //ÖNEMLİ NOT Java'da başa yazılan ünlem mantıksal değeri tersine çevirir


        System.out.println(!(true));//false
        System.out.println(!(5<8));// !true ==> false

        //<= ve >= de kullanılabilir

        System.out.println(8 <=8);//true
        System.out.println(5<=8);//true
        System.out.println(10<=8);//false



        int c = 15;
        System.out.println(15>=c++); // true
        System.out.println(c);
    }
}
