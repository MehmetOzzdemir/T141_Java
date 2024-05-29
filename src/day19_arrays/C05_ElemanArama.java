package day19_arrays;

import java.util.Scanner;

public class C05_ElemanArama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac tane Sayi girmek istiyorsunuz ? ");
        int adet = scan.nextInt();
        int[] arr = new int[adet];
        System.out.print("Lütfen Array'in Elemanlarini Giriniz:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Lütfen hangi sayiyi aramak istediginizi yaziniz : ");
        int iste = scan.nextInt();


        elemanVarMi(arr, iste);
    }

    public static void elemanVarMi(int[] arr, int arananSayi) {

        int bulunanAdet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                bulunanAdet++;
            }
        }
        if (bulunanAdet == 0) {
            System.out.println("Aranan elaman array'de yok");
        } else {
            System.out.println("Aranan sayi array'de " + bulunanAdet + " adet kullanilmistir");
        }


    }
}
