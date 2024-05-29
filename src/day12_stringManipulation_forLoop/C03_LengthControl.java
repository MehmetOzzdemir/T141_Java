package day12_stringManipulation_forLoop;

import java.util.Scanner;

public class C03_LengthControl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz : ");
        String metin = scan.nextLine();

        if (metin.length()%2 ==0){
            System.out.println(metin.substring(0,metin.length()/2)+":)"+metin.substring(metin.length()/2));
        }
        else {
            System.out.println(metin.substring(0,metin.length()/2)+":("+metin.substring(metin.length()/2+1));
        }
    }
}
