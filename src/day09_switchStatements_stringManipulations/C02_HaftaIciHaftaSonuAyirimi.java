package day09_switchStatements_stringManipulations;

import java.util.Scanner;

public class C02_HaftaIciHaftaSonuAyirimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write Number (1-7) : ");
        int day = scan.nextInt();
        System.out.println("********************************");
        switch (day) {

            case 1:
                System.out.println("\t\tToday is Monday");
                System.out.println("\t\t\tHaftaiçi");
                break;
            case 2:
                System.out.println("\t\tToday is Tuesday");
                System.out.println("\t\t\tHaftaiçi");
                break;
            case 3:
                System.out.println("\t\tToday is Wednesday");
                System.out.println("\t\t\tHaftaiçi");
                break;
            case 4:
                System.out.println("\t\tToday is Thursday");
                System.out.println("\t\t\tHaftaiçi");
                break;
            case 5:
                System.out.println("\t\tToday is Friday");
                System.out.println("\t\t\tHaftaiçi");
                break;
            case 6:
                System.out.println("\t\tToday is Saturday");
                System.out.println("\t\t\tHaftasonu");
                break;
            case 7:
                System.out.println("\t\tToday is Sunday");
                System.out.println("\t\t\tHaftasonu");
                break;
            default:
                System.out.println("!!!Please Write 1-7 Number!!!");
        }
        System.out.println("********************************");

        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("\t\t\tHaftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("\t\t\tHaftasonu");
                break;
            default:
                System.out.println("!!!Please Write 1-7 Number!!!");
        }
        System.out.println("********************************");
    }
}
