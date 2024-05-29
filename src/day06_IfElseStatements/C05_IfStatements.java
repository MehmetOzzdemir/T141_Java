package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please A Letter for Month : ");;
        char letter = scan.nextLine().charAt(0);

        if(letter =='j' || letter == 'J'){
            System.out.println("January,June or July");
        }
        if(letter =='f' || letter == 'F'){
            System.out.println("February");
        }
        if(letter =='m' || letter == 'M'){
            System.out.println("March or May");
        }
        if(letter =='a' || letter == 'A'){
            System.out.println("April or August");
        }
        if(letter =='s' || letter == 'S'){
            System.out.println("September");
        }
        if(letter =='o' || letter == 'O'){
            System.out.println("October");
        }
        if(letter =='n' || letter == 'N'){
            System.out.println("November");
        }
        if(letter =='d' || letter == 'D'){
            System.out.println("December");
        }
    }
}
