package day04_wrapperClassAndMathatematic;

import java.util.Scanner;

public class C01_DataCasting_Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write a Letter : ");
        char letter = scan.next().charAt(0);

        /*for (int i = 0; i < 3; i++) {
            letter++;
            System.out.print((char) (letter) + " ");

        }
        */
        System.out.println("Girdiğiniz karakterden bir sonraki karakter : "+(char)(letter+1));
        System.out.println("Girdiğiniz karakterden bir sonraki karakter : "+(char)(letter+2));
        System.out.println("Girdiğiniz karakterden bir sonraki karakter : "+(char)(letter+3));

    }
}
