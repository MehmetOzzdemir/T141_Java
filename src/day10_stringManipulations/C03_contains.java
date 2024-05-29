package day10_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Metin Giriniz : ");
        String metin = scan.nextLine();
        if (metin.contains("ev") && metin.contains("is")){
            System.out.println("Hayatta Denge çok güzel");
        } else if (metin.contains("ev")) {
            System.out.println("Home Sweet Home ");
        } else if (metin.contains("is")) {
            System.out.println("Çalışmak Çok güzel");
        }else {
            System.out.println("Tembellik çok güzel değil");
        }

    }
}
