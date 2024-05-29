package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C06_IsimDuzenle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write Your Name : ");
        String name = scan.nextLine();
        System.out.println("Please Write Your Surname : ");
        String surname = scan.nextLine();

        //Method bize bir String döndürdüğü için
        //Ya hemen donen String yazdiririz

        System.out.println(bigFirstLetter(name, surname));

        // veya daha sonra kullanilmak üzere kaydederiz

        String duzenlenmisName = bigFirstLetter(name, surname);

    }

    public static String bigFirstLetter(String name, String surname) {

        String prepareName = name.substring(0, 1).toUpperCase() +
                name.substring(1).toLowerCase();

        String prepareSurname = surname.substring(0, 1).toUpperCase() +
                surname.substring(1).toLowerCase();

        return prepareName + " " + prepareSurname;
    }
}
