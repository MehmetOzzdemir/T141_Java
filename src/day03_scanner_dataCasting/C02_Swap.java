package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write number 1 : ");
        int num1 = scan.nextInt();
        System.out.print("Please Write Number 2 : ");
        int num2 =scan.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;


        System.out.println("After the Change");
        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);
    }
}
