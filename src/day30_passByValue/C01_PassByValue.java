package day30_passByValue;

import java.util.Scanner;

public class C01_PassByValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write Non-Discount Price : ");   //  100
        double price = scan.nextDouble();
        System.out.println("%10 Discount Price: " + discount10(price)); //  90
        System.out.println("Later than %10 Discount Price : " + price); //  100

        System.out.println("%20 Discount Price: " + discount20(price)); //   80
        System.out.println("Later than %20 Discount Price : " + price); //  100
        //fiyatta kalici olarak %30 indirim yapin

        System.out.println("%30 Discount Price: " + discount30(price)); //  70
        price = discount30(price);
        System.out.println("Later than %30 Discount Price : " + price); //  70
    }

    public static double discount10(double price) {
        price *= 0.9;
        return price;
    }

    public static double discount20(double price) {
        price *= 0.8;
        return price;
    }

    public static double discount30(double price) {
        price *= 0.7;
        return price;
    }
}
