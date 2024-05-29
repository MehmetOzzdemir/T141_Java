package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {
    //verilen bir metni tersten yazan bir method olusturun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
         reverseWrite(s);
        reverseWrite("Ali");
        reverseWrite("Veli");

    }

    public static void reverseWrite(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
