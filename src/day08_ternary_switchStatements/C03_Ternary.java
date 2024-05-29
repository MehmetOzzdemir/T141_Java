package day08_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
        Ternary de iki olasılık olur
        eğer bu iki olasılıktan birinde atama yapmanız
        diğerinde yazdırmanız isteniyorsa
        ternary yerine if tercih edilmelidir

         */
        int num = 20;

        //Verilen sayı 10'dan Büyükse değerini 3 azaltın
        //10'dan büyük değilse bu sayı çok küçük yazdırın

        if (num > 10) {
            num -= 3;
        } else {
            System.out.println("This Number Lower than 10 ");
        }
        System.out.println("Later If Else Number : " + num);


        System.out.println(num > 10 ? num = num - 3 : "This Number Lower than 10 ");
        System.out.println("Later Ternary Number : " + num);
    }
}
