package day02_variables_Scanner;

import java.util.Scanner;

public class C05_Scanner_DikdörtgeninAlanı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz   : ");
        double weight = scan.nextDouble();
        System.out.println("Dikdörtgenin uzun kenarını giriniz   : ");
        double length = scan.nextDouble();
        System.out.println("Dikdörtgenin Alanı    :"+length*weight);


        //Other Solution
        System.out.println("Dikdörtgenin Kenar Uzunluklarını Giriniz : ");
        double kısa = scan.nextDouble();
        double uzun = scan.nextDouble();
        double alan = uzun*kısa;
        System.out.println("Dikdörtgenin Alanı "+alan);

    }
}
