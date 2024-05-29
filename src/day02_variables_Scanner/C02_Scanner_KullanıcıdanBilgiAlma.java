package day02_variables_Scanner;

import java.util.Scanner;

public class C02_Scanner_KullanıcıdanBilgiAlma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ismi alıp ismi büyük harf olarak yazdırın
        Kullanıcıdan  bilgi almak için 3 adım vardır
        1-Bir Scanner objesi oluşturmak için
         */

        Scanner scanner =new Scanner(System.in);
        //2-Kullanıcıya ne istediğimizi söylemeliyiz
        System.out.println("Lütfen isminizi giriniz ..: ");
        //3-İstediğimiz bilgiyi kaydedebileceğimiz
        //  iistenen bilgiye uygun bir variable oluşturun
        //  oluşturduğumuz scanner objesi ile uygun hazır methodu kullanıp
        //  kullanıcınıın girdiği değeri,konsoldan alıp
        //  oluşturduğumuz variable'a atayın


        /*
        Bu görevde isim istediğimiz için String bir variable oluşturduk
        ve scanner.NextLine()'i kullandık
        next() ==> bize ilk space 'a kadar olan kısmı alır
         */
        String kullaniciIsmi = scanner.nextLine();

        System.out.println("Girilen ismin büyük harfle yazılışı :"+kullaniciIsmi.toUpperCase());


    }
}
