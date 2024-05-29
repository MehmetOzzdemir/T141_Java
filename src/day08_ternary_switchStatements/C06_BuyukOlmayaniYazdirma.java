package day08_ternary_switchStatements;

import java.util.Scanner;

public class C06_BuyukOlmayaniYazdirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Write Two Number : ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println(num1>num2 ? "Büyük Olmayan Sayı : "+num2:"Büyük Olmayan Sayı : "+num1);

    }
}
