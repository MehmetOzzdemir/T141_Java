package day11_stringManipultations;

import java.util.Scanner;

public class C05_Replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a','A'));
        System.out.println(str.replace("candir","guzeldir"));

        //a'lari yok edin
        System.out.println(str.replace("a",""));

        //b'leri B yappin
        System.out.println(str.replace('b','B'));
        ///can yerine han yapin
        System.out.println(str.replace("Can","Han"));

        //sadece ilk a'yi A Yapin
        System.out.println(str.replaceFirst("a","A"));




        //kullanicidan bir metinn isteyin
        //ve metinde geçen ilk space'i * yapin

        //metinde varsa ilk rakami * yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz : ");
        String cumle = scan.nextLine();

        System.out.println(cumle.replaceFirst("\\s","*"));//Space
        System.out.println(cumle.replaceFirst("\\S","*"));//Non Space

        System.out.println(cumle.replaceFirst("\\d","*"));//digits
        System.out.println(cumle.replaceFirst("\\D","*"));// Non digits


    }
}
