package day24_arrayList_ForEacLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_ForEachLoop {
    public static void main(String[] args) {
        // Kullanicidan bir cümle ve bir harf alin ,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin
        // kullanilmdiysa "harf cumlede kullanilmadi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write A String : ");
        String str = scan.nextLine();

        String letter = "";

        while (letter.length() != 1) {
            System.out.println("Please Write a Letter : ");
            letter = scan.nextLine();

        }

        String[] letterArr1 = str.split("");

        System.out.println(Arrays.toString(letterArr1)); //[A, l, i,  , t, o, p, u,  , t, u, t]

        int count = 0;
        for (String each : letterArr1) {
            if (each.equalsIgnoreCase(letter)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(letter + " Harfi Cumlede Kullanilmamistir.");
        } else {
            System.out.println("İstenen " + letter + " harfinden cümlede " + count + " adet vardir");
        }

    }
}
