package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_CreatePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean resultPassword = false;
        String password = "";

        while (!resultPassword) {
            System.out.println("Please Write A Password  : ");
            password = scan.nextLine();
            resultPassword = checkPassword(password);
        }
        System.out.println("Uygun parola : " + password);
        System.out.println("*** Correct password ***");

    }

    public static boolean checkPassword(String pass) {

        char firstLetter = pass.charAt(0);
        char lastLetter = pass.charAt(pass.length() - 1);
        int flag = 20;
        System.out.println("********************************");
        if (!(Character.isLowerCase(firstLetter))) {
            System.out.println("Parolanız küçük harf ile başlamalıdır");
            flag = 15;
        }
        if (!(Character.isDigit(lastLetter))) {
            System.out.println("Parolanız rakam ile bitmellidir");
            flag = 15;
        }
        if (pass.contains(" ")) {
            System.out.println("Parolanız boşluk içermemelidir");
            flag = 15;
        }
        if (pass.length() < 10) {
            System.out.println("Şifreniz En Az 10 karakter olmalı");
            flag = 15;
        }
        System.out.println("********************************");
        if (flag == 20) {
            return true;
        } else {
            return false;
        }
    }
}

