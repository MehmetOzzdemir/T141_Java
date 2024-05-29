package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C11_NestedForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        */
        System.out.println("Satır sayisini giriniz : ");
        int satir = scan.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
