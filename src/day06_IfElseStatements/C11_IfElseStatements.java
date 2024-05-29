package day06_IfElseStatements;

import java.util.Scanner;

public class C11_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write A Number : ");
        double number = scan.nextDouble();
        if(number<100){
            System.out.println("!!!You Win!!!");
        }else{
            System.out.println("!!!You Lose!!!");
            System.out.println("*****LOST*********");
        }
        /*
        if(number<100)
            System.out.println("!!!You Win!!!");
         else
            System.out.println("!!!You Lose!!!");
            System.out.println("*****LOST*********");*/



    }
}
