package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_SayininRakanlarToplaminiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen rakamlari toplanacak tam sayiyi giriniz :");
        int num = scan.nextInt();
        System.out.println(num+" 'ın Rakamlari Toplami : "+rakamlariToplama(num));
    }


    public static int rakamlariToplama(int num) {
        int sum = 0;
        int birlerbasamagi = 0;
        int verilenSayi = num;

        while (verilenSayi > 0) {
            birlerbasamagi = verilenSayi % 10;
            sum += birlerbasamagi;
            verilenSayi = verilenSayi / 10;
        }
        return sum;
    }
}
