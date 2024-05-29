package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Write Side For Triangle : ");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();
        if (side1 == side2 && side1 == side3 && side1 >= 0) {
            System.out.println("This Triangle is equilateral triangle");
        } else
            System.out.println("This Triangle is not equilateral triangle");
    }
}
