package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Kullanicidan satir ve sütun sayisini alip

         */
        System.out.println("Satır sayisini giriniz : ");
        int satir = scan.nextInt();
        System.out.println("Sütun sayisini giriniz : ");
        int sütun = scan.nextInt();

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sütun ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
