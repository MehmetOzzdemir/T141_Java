package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uzunluğu kilomtre olarak yazınız : ");
        double km = scan.nextDouble();
        System.out.println("Lütfen çevirmek istediğiniz birimi Cm ya da M olarak yazınız : ");
        scan.nextLine();
        String birim = scan.nextLine();

        if (birim.equalsIgnoreCase("metre")) {
            System.out.println("Metre : " + km * 1000);
        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Santimetre : " + km * 100000);
        } else {
            System.out.println("!!!İstediğiniz birim sisteme kayıtlı değil!!!");
        }
    }
}
