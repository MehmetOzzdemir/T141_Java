package day08_ternary_switchStatements;

public class C02_TernaryOperators {
    public static void main(String[] args) {

        //verilen bir tamsayının çift sayı veya tek sayı olduğunu yazdırın
        int num = 40;
        if (num % 2 == 0) {
            System.out.println("Çift");
        } else {
            System.out.println("Tek");
        }

        /*
        Ternary operatoru
        if else ile yapabileceğimiz Basit işlemler için kullanılır
        alternatif bir kod bloğudur

         */

        System.out.println(num % 2 == 0 ? "Çitf" : "Tek");

        //verilen sayı 0'dan büyükse "pozitif" , 0'dan büyük değilse
        //"pozitif değil" yazdırın

        if (num >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("Not positive number");
        }

        System.out.println(num >= 0 ? "positive number" : "Not positive number");

        //sayı 10 dan büyükse sayının değerini 2 artırın
        //sayı 10 dan büyük değilse sayının dağerini 5 artırın

        if (num > 10) {
            num -= 2;
        } else {
            num += 5;
        }
        System.out.println("With If : " + num);

        num = num > 10 ? (num - 2) : (num + 5);

        System.out.println("With Ternary : " + num);

        //Ternary Operatörü Bir sonuç ürettiği için
        //Sonuç ya yazdırılmalı yda bir variable a atanmalıdır
        //num>10?(num-2):(num+5);


    }
}
