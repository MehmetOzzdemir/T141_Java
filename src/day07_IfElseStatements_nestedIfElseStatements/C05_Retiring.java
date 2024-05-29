package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C05_Retiring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your gender ? K : Kadın E: Erkek");
        char gender = scan.next().toUpperCase().charAt(0);
        System.out.println("How old are you ?");
        double age = scan.nextDouble();

        if (age < 10 || age > 80) {
            System.out.println("Invalid Age");
        } else if ((gender == 'K' && age >= 60) || (gender == 'E' && age >= 65)) {
            System.out.println("You can Retiring !!!");
        } else {
            if (gender == 'K') {
                System.out.println("For Retire,You Need " + (60 - age));
            } else if (gender == 'E') {
                System.out.println("For Retire,You Need " + (65 - age));
            } else
                System.out.println("Girilen Bilgiler hatalı Tekrar deneyim");
        }
    }

}
