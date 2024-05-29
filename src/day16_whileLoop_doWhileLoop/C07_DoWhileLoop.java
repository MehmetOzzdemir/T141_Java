package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write a Positive Number : ");
        int num = scan.nextInt();
        int square = 1;
        boolean isSquare = false;
        while ((square * square) <= num) {

            if ((square * square) == num) {
                isSquare = true;
                System.out.println("Girilen sayi : " + square + " sayisinin tam karesidir.");

            }

            square++;
        }

        System.out.println(isSquare);
    }
}
