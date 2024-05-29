package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write 3 Side for Triangle : ");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();

        if (side1 == side2 && side1 == side3 && side1 < 0) {
            System.out.println("This Triangle is equilateral triangle");
        }

    }
}
