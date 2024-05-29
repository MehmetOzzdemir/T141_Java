package day09_switchStatements_stringManipulations;

import java.util.Scanner;

public class C03_SwitchISTQB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ISTQB'deki harflerden hangisinin anlamını öğrenmek istiyorsunuz ?");
        char letter = scan.nextLine().toUpperCase().charAt(0);
        switch (letter) {
            case 'I':
                System.out.println("I : International");
                break;
            case 'S':
                System.out.println("S : Software");
                break;
            case 'T':
                System.out.println("T : Testing");
                break;
            case 'Q':
                System.out.println("Q : Qualification");
                break;
            case 'B':
                System.out.println("B : Board");
                break;
            default:
                System.out.println("Lütfen kısaltmalardaki harflarden birini giriniz.");
        }


    }
}
