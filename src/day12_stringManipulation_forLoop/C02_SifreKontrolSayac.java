package day12_stringManipulation_forLoop;

import java.util.Scanner;

public class C02_SifreKontrolSayac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sifre giriniz : ");
        String pass = scan.nextLine();
        char firstLetter = pass.charAt(0);
        char lastLetter = pass.charAt(pass.length() - 1);
        int sayac = 0;
        System.out.println("********************************");
        if (!(Character.isLowerCase(firstLetter))) {
            System.out.println("Parolanız küçük harf ile başlamalıdır");
            sayac++;
        }
        if (!(Character.isDigit(lastLetter))) {
            System.out.println("Parolanız rakam ile bitmellidir");
            sayac++;
        }
        if (pass.contains(" ")) {
            System.out.println("Parolanız boşluk içermemelidir");
            sayac++;
        }
        if (pass.length() < 10) {
            System.out.println("Şifreniz En Az 10 karakter olmalı");
            sayac++;
        }
        System.out.println("********************************");
        if (sayac == 0) {
            System.out.println("Kayıt Başarılı");
        }else
            System.out.println(sayac+" Tane Hatanız Bulunmaktadır");
    }
}
