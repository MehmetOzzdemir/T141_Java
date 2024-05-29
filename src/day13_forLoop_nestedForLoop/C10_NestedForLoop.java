package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {//Her satirdaki sütunlari kontrol eder
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {//Her satirdaki sütunlari kontrol eder
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
