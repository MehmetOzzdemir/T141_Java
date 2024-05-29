package day02_variables_Scanner;

import java.util.Scanner;

public class C03_Scanner_SayınınKaresiniAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Tam Sayı Giriniz: ");
        int number = scan.nextInt();

        System.out.println("Girdiğiniz Sayının Karesi  : "+Math.pow(number,2));

    }
}
