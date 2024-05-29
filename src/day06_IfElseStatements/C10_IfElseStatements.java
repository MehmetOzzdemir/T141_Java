package day06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write A Letter : ");
        char letter = scan.nextLine().charAt(0);
       // if (letter >= 'a' && letter <= 'z') {
       //     Character.toUpperCase(letter);
       //     System.out.println("Your Letter is Lowercase and change the Uppercase : "
       //             + Character.toUpperCase(letter));
       // } else
       //     System.out.println("Your Letter is Uppercase : " + letter);
//

        if(Character.isLowerCase(letter)){
            Character.toUpperCase(letter);
            System.out.println("Your Letter is Lowercase and change the Uppercase : "
                    + Character.toUpperCase(letter));
        }else
            System.out.println("Your Letter is Uppercase : " + letter);

    }


}
