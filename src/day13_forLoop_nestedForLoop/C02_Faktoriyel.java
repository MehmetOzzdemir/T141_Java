package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C02_Faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 14 den kucuk pozitif bir tam sayi giriniz : ");
        int number = scan.nextInt();
        int faktöriyel = 1;

        System.out.print(number+" != ");
        for (int i = number; i >= 1; i--) {
            faktöriyel *= i;
            if (i!=1){
                System.out.print(i+" * ");
            }else {
                System.out.print(i+" ");

            }

        }
        System.out.print("= "+faktöriyel);
    }
}
