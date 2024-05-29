package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C01_Faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 14 den kucuk pozitif bir tam sayi giriniz : ");
        int number = scan.nextInt();
        int faktöriyel = 1;
        if (number < 14) {
            for (int i = number; i >= 1; i--) {
                faktöriyel *= i;
            }
            System.out.println("Solution : " + faktöriyel);
        }else
        {
            System.out.println("Lütfen 14 den kücük bir deger giriniz");
        }

    }
}
