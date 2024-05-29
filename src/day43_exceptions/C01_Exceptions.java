package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            java kodlari calistiriken
            bir sorunla karsilastiginda
            ONCELILE koz yazarinin bu sorunu ongorup cozum yolu gosterip gostermedigini kontrol eder
                - eger cozum yolu gosterilmisse
                    o cozumu gerceklestirir(handle eder ) ve NORMAL calismasina devam eder
                - eger cozum yolu gostermemisse
                  kodun calismasini o satir itibariyle durdurur
                  hatanin bulundugu satiri , hatanin cinsini ve sebebini bize rapor eder


                  İyi bir kod yazarinin exception olusma olasiliklarini iyi tespit edip
                  Java'ya tum olasi exception durumlarinda ne yapmasi gerktigini söylemesi gerekir
         */
        int num1 = 0;
        int num2 = 0;
        boolean herSeyNormaMi = true;
        try {
            System.out.print("Num 1 : ");
            num1 = scan.nextInt();
            System.out.print("Num 2 : ");
            num2 = scan.nextInt();
        } catch (InputMismatchException e) {

            //EGER yukarida calistirmak istedigimiz istedigimiz kodlarda
            //sana yazdigim InputMismatchException olusursa
            //o zaman o excepcion i e oblesine kaydet
            // ve simdi sana yazacagimm kodlari calistir
            System.out.println("Sana Tam Sayi Yaz DEDİK");
            herSeyNormaMi = false;
        }
        if (herSeyNormaMi == false) {
            System.out.println("Hatalari Düzeltip tekrar dene");
        } else if (num2 == 0) {
            System.out.println("bolecek sayi sifir olamaz");
        } else {
            int divide = num1 / num2;

            System.out.println("Divide : " + divide);
        }
    }
}
