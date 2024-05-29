package day12_stringManipulation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        //Kronometre yapin
        //Kullanicidan aldiginiz pozitif sayidan
        //1'e kadar tüm sayilari yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write a Positive Number : ");
        int num = scan.nextInt();
        int j=0;
        for (int i = num; i >0 ; i--) {
            j++;
            System.out.print(i+" ");
            if (j%10==0){
                System.out.println();
            }
        }
    }
}
