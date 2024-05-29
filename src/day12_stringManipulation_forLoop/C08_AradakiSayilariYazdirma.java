package day12_stringManipulation_forLoop;

import java.util.Scanner;

public class C08_AradakiSayilariYazdirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write Begin Number : ");
        int first = scan.nextInt();
        System.out.print("Please Write Last Number : ");
        int last = scan.nextInt();
        int j = 0;
        if (first < last) {
            for (int i = first; i <= last; i++) {
                if (i % 9 == 0) {
                    j++;
                    System.out.print(i + " ");
                }
                if (j % 10 == 0 && i % 9 == 0) {
                    System.out.println();
                }
            }
        } else {
            for (int i = first; i >= last; i--) {

                if (i % 9 == 0) {
                    j++;
                    System.out.print(i + " ");
                }
                if (j % 10 == 0 && i % 9 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
