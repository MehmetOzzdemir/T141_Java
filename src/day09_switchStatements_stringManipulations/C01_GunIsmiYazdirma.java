package day09_switchStatements_stringManipulations;

import java.util.Scanner;

public class C01_GunIsmiYazdirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Write Number (1-7) : ");
        int day = scan.nextInt();
        System.out.println("********************************");
        switch (day) {
            case 1:
                System.out.println("\t\tToday is Monday");
                break;
            case 2:
                System.out.println("\t\tToday is Tuesday");
                break;
            case 3:
                System.out.println("\t\tToday is Wednesday");
                break;
            case 4:
                System.out.println("\t\tToday is Thursday");
                break;
            case 5:
                System.out.println("\t\tToday is Friday");
                break;
            case 6:
                System.out.println("\t\tToday is Saturday");
                break;
            case 7:
                System.out.println("\t\tToday is Sunday");
                break;
            default:
                System.out.println("!!!Please Write 1-7 Number!!!");
        }

        System.out.println("********************************");


    }
}
