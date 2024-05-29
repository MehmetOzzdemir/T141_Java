package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullaniciBilgileriniYazdırma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen İsminizi giriniz : ");
        String name = scan.nextLine();
        System.out.print("Lütfen Soyisminizi giriniz : ");
        String surname = scan.nextLine();
        System.out.print("Lütfen Yaşınızı Giriniz : ");
        int age = scan.nextInt();

        System.out.println("-------------------------");
        System.out.println("Name : "+name+
                "\nSurname : "+surname+
                "\nAge : "+age+
                "\nKaydınız başarıyla tmmamlanmıştır...");



    }
}
