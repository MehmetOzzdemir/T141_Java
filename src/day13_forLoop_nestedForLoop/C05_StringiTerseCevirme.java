package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write A String : ");
        String str = scan.nextLine();
        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

        if (str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not Palindrom");

        }
    }
}
