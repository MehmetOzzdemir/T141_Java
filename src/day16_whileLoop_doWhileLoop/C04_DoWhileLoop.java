package day16_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 1;
        int sum = 0;
        int nums = 0;
        do {
            System.out.print("Please Write A Positive Number For Finish write '0': ");

            num = scan.nextInt();
            if (num > 0) {
                sum += num;
                nums++;
            } else if (num < 0) {
                System.out.println("Negatif Sayi Kullanamazsiniz");
            }
        } while (num != 0);
        System.out.println(nums + " Adet Pozitif Tam sayinin Toplami : " + sum);
    }
}
