package day11_stringManipultations;

import java.util.Scanner;

public class C02_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write A Paragraph : ");
        String str = scan.nextLine();
        System.out.println("Please Write A Search Paragraph : ");
        String search = scan.nextLine();

        int firstIndex = str.indexOf(search);
        int lastIndex = str.lastIndexOf(search);
        if (firstIndex == -1){
            System.out.println("This Paragraph Not Contains ****" + search);
        } else if (firstIndex == lastIndex) {
            System.out.println("Aradığınız metin cümlede bir kere kullanilmistir");
        }else {
            System.out.println("Aradiniz metin cümlede birden fazla kez kullanilmistir");
        }
    }
}
