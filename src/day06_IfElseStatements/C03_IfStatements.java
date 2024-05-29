package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);
        System.out.print("Please Write A Positive Number : ");
        int number = scan.nextInt();
        if (number%3 == 0){
            System.out.println("Number Divisible by 3 ");
        }
        if (number%5 == 0){
            System.out.println("Number Divisible by 5 ");
        }
    }
}
