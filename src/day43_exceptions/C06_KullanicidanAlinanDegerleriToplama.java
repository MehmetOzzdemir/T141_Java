package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_KullanicidanAlinanDegerleriToplama {
    //kullanici Q veya q girinceye kadar
    // toplanacak sayilari al girilen sayi
    // adedini ve sayilarin toplani yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double girilenSayi = 0;
        String girilenMetin = "";
        double toplam = 0;
        int girilenSayiAdedi = 0;
        while (!girilenMetin.equalsIgnoreCase("q")) {
            System.out.println("Lütfen Toplanmak Üzere Sayi Giriniz (Bitirmek için Q ya basiniz) : ");

            //Kullanşici 3 sey yapabilir
            //1- Toplamak için sayi yazabilir
            //2 sayi disinda bir giris yapabilir
            //      Eger Q veya q se islm bitmeli
            //      Eger sayi,Q veya q degilse uyari verip tekrar deger istemeliyiz


            try {
                girilenSayi = scan.nextDouble();
                toplam += girilenSayi;
                girilenSayiAdedi++;

            } catch (InputMismatchException e) {
                //Eger InputMismatchException olustuysa sayi girilmemis demektir
                //bu durumda girisi metin olarak kaydedip

                girilenMetin = scan.nextLine();

                //Eger Q ise islemi bitirecegiz Q degilse uyari veri basa doneceğiz


                if (girilenMetin.equalsIgnoreCase("q")) {
                    System.out.println(girilenSayiAdedi + " adet Sayi girdiniz . Toplami : " + toplam);
                } else {
                    System.out.println("Yanlis Giris yaptiniz........");
                }


            }

        }

    }

}
