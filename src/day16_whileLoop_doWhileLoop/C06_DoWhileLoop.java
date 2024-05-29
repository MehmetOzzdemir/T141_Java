package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String baslangicStr;
        String bitisStr;
        char baslangic = 'a';
        char bitis = 'a';

        do {
            System.out.println("Lütfen baslangic harfini giriniz :");
            baslangicStr = scan.nextLine();
            if (baslangicStr.length() == 1) {
                baslangic = baslangicStr.charAt(0);
            } else {
                System.out.println("sadece Bir harf Girmelisiniz");
            }
        } while (baslangicStr.length() != 1);


        do {
            System.out.println("Lütfen baslangic harfini giriniz :");
            bitisStr = scan.nextLine();
            if (bitisStr.length() == 1) {
                bitis = bitisStr.charAt(0);
            } else {
                System.out.println("sadece Bir harf Girmelisiniz");
            }
        } while (bitisStr.length() != 1);


        do {
            System.out.print(baslangic + " ");
            baslangic++;
        } while (baslangic <= bitis);
    }
}
