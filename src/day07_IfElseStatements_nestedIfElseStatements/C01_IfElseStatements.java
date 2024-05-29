package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu giriniz (kg): ");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz (cm): ");
        double boy = scan.nextDouble();

        double vke = (kilo*10000) / (Math.pow(boy, 2));
        System.out.println(vke);
        if (vke > 30) {
            System.out.println("OBEZ");
        } else if (vke > 25) {
            System.out.println("KİLOLU");
        } else if (vke > 20) {
            System.out.println("NORMAL");
        } else {
            System.out.println("ZAYIFSINIZ");
        }
    }
}
