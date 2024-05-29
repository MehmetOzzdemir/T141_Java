package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write a Letter : ");
        char letter = scan.nextLine().charAt(0);
        if(letter >= 65 && letter<=90){
            System.out.println("This Letter is Uppercase Letter ");
        }
        if(letter >= 97 && letter<=122){
            System.out.println("This Letter is Lowercase Letter ");
        }

        if(letter >= 'A' && letter<='Z'){
            System.out.println("This Letter is Uppercase Letter ");
        }
        if(letter >= 'a' && letter<='z'){
            System.out.println("This Letter is Lowercase Letter ");
        }

    }
}
