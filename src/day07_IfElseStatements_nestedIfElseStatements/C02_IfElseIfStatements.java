package day07_IfElseStatements_nestedIfElseStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Verilen görev sonucunda yazığımız kod else ile bitmeyebilir

        EGER
        if,else if ... cümleleri else ile bitmiyorsa
        bazı değerler için hiçbir if bodysinin çalışmayacağını
        goz onune bulundurmalıyız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write A Integer  :  ");
        int number = scan.nextInt();
        if (number < 0) {
            System.out.println("!!!Negative Number!!!");
        } else if (number < 10) {
            System.out.println("One Digit Number");
        } else if (number < 100) {
            System.out.println("Two Digit Number");
        } else if (number < 1000) {
            System.out.println("Big Number");
        }
    }
}
