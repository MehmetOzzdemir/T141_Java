package day04_wrapperClassAndMathatematic;

import java.util.Scanner;

public class C06_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz : ");
        int number = scan.nextInt();

        int birler=number%10;
        int onlar = number/10%10;
        int yüzler = number/100;
        System.out.println(birler+onlar+yüzler);

    }
}
