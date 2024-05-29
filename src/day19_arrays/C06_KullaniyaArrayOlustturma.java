package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniyaArrayOlustturma {
    public static void main(String[] args) {
        int [] arr = arrayOlustur();
        System.out.print(Arrays.toString(arr));
    }

    public static int [] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Array'in Kac elemanli olmasini istediginizi giriniz : ");
        int length = scan.nextInt();
        int [] arr = new int[length];
        System.out.println("Lütfen Array'in Elemanlarini giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        return arr;
    }
}
