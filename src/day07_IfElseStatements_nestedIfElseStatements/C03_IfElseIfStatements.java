package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write AN INTEGER : ");
        int number = scan.nextInt();
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("Super Sayı");
        } else if (number % 5 == 0) {
            System.out.println("Sayı 5'in Katıdır");
        } else if (number % 7 == 0) {
            System.out.println("Sayı 7'nin Katıdır");
        }else
            System.out.println("Kötü Sayı");
    }
}
