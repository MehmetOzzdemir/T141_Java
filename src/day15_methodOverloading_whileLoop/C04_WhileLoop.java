package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //Tekrar sayisi belli olmayan islemleri
        //While loop ile yapmak daha avantajlidir


        Scanner scan = new Scanner(System.in);
        System.out.print("For Sum, Please Write Numbers : ");

        int sum = 0;
        while (sum <= 500) {
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
