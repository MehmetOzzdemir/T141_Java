package day08_ternary_switchStatements;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write Your Score : ");
        double score = scan.nextDouble();
        System.out.println(score>=50?"Sınıfı Geçtin": "Malesef Sınıfta Kaldınız!");
    }
}
