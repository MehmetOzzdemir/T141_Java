package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 0-100 arası bir not giriniz : ");
        double not = scan.nextDouble();
        if (not>=0 && not <=100){
            System.out.println("Gecerli Not");
        }
        else
            System.out.println("Geçersiz Not");

    }
}
