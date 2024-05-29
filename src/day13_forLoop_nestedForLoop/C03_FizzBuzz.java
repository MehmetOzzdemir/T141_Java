package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C03_FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Positive Write A Integer : ");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz ");
            }else if (i % 3 == 0 ){
                System.out.print("fizz ");
            } else if (i % 5 == 0 ) {
                System.out.print("buzz ");
            }else {
                System.out.print(i+ " ");
            }


        }
    }
}
