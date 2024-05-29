package day02_variables_Scanner;

import java.util.Scanner;

public class C04_IlkHarfiYazdırma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Metin Giriniz:");
        String str = scan.nextLine();
        System.out.println(str.toUpperCase().charAt(0));

        System.out.println("Lütfen bir metin daha giriniz : ");

        char first = scan.nextLine().toUpperCase().charAt(0);
        System.out.println(first);


    }
}
