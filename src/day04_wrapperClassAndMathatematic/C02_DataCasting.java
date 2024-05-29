package day04_wrapperClassAndMathatematic;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write 3 Number : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        double average = (double) (num1 + num2 + num3) / 3;
        System.out.println("Average : " + average);

    }
}
