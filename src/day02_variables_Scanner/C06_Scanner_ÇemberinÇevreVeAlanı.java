package day02_variables_Scanner;

import java.util.Scanner;

public class C06_Scanner_ÇemberinÇevreVeAlanı {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Çemberin Yarı Çapını Giriniz : ");
        double r= scan.nextDouble();
        System.out.println("Çemberin Çevresi : "+2*Math.PI*r);
        System.out.println("Çemberin Alanı : "+Math.PI*Math.pow(r,2));


    }
}
