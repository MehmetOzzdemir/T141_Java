package day06_IfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        /**
         *Bağımsız if cümleleri adından anlaşılacağı gibi
         * kodun geriye kalanından bağımsızdır
         * şarta odaklanır
         * şart true ise if body'si çalışır
         * şart fase ise if body'si çalışmaz
         * Bağımsız if cümleleri kodun geri kalanı ile ilgilenmediğinden
         * birden fazla bağımsız if cümlesi olduğunda
         * tümünün bodysi çalışacabileceği gibi ,
         * hiçbirinin if bodysi çalışmayabilir.
         */


        int a = 18;
        int b = 47;

        //Eğer a b 'den büyükse "a b 'den büyüktür" yazdır
        if (a > b) {
            System.out.println("A higher than B");
        }

        //B çift ise "bu sayıların çarpımı çift olur" yazdır
        if (b % 2 == 0) {
            System.out.println("Multiplication of these numbers becomes Even");
        }

        //a 100'den büyükse "ilk sayı çok büyük" yazdır
        if (a > 100) {
            System.out.println("First Number Very High !!!");
        }

    }
}
