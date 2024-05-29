package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C06_AsalSayiKontrol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write A Positive Number : ");
        int number = scan.nextInt();

        int flag = 20;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag=10;
                System.out.println(number + " , Asal Sayi Degildir. " + i + " e Bölünüyor");
                break;
            }
        }
        if (flag==20){
            System.out.println(number+" , Asal Sayidir.");
        }


    }
}
