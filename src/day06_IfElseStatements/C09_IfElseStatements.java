package day06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write Your Age : ");
        double age = scan.nextDouble();
        if (age <= 65 && age >= 0) {
            double retireAge = 65 - age;
            System.out.println("For Retire,You Must Work " + retireAge + " years");
        } else
            System.out.println("You can Retire");

    }
}
