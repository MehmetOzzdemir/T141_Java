package day10_stringManipulations;

import java.util.Scanner;

public class C05_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write An Email :");
        String email = scan.nextLine();
        if (!(email.contains("@"))) {
            System.out.println("Geçersiz mail");
        } else if (!(email.contains("@gmail.com"))) {
            System.out.println("Mail gmail olmalı");
        } else if (!(email.endsWith("@gmail.com"))) {
            System.out.println("Mailde yazım hatası var");
        }
    }
}
