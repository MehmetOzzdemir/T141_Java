package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {


        /**
         * if else ile yazdırdığımız kodlarda
         * karar vermek için değerlendirdiğimiz değişkenler birden fazla ise
         * daha anlaşılır kod yazmak içi
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your gender ? K : Kadın E: Erkek");
        char gender = scan.next().toUpperCase().charAt(0);
        System.out.println("How old are you ?");
        double age = scan.nextDouble();

        if (gender == 'E') {
            if (age < 20 || age > 80) {
                System.out.println("geçersiz yaş");
            } else if (age >= 65) {
                System.out.println("Erkek Emekli olabilir");
            } else {
                System.out.println("Emekli olmak için " + (65 - age) + " yıl daha çalışmalısınız");
            }
        } else if (gender == 'K') {

            if (age < 20 || age > 80) {
                System.out.println("geçersiz yaş");
            } else if (age >= 60) {
                System.out.println("Kadın Emekli olabilir");
            } else {
                System.out.println("Emekli olmak için " + (60 - age) + " yıl daha çalışmalısınız");
            }
        } else {
            System.out.println("Lütfen K veya E giriniz yanlış giriş yaptınız");
        }
    }
}
