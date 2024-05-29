package day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C02_ArrayeElemanEkleme {
    public static void main(String[] args) {
        /*
        verilen bir int arraye istenen elemani ekleyen
        arrayin son halini dondoren bir method olusturun
         */

        int[] numbers = {3, 5, 7};
        int eklenecekSayi = 9;
        numbers = arrayeElemanEkle(numbers, eklenecekSayi);
        System.out.println("Sayilar'in " + eklenecekSayi + " eklenmis hali : " + Arrays.toString(numbers));
        //System.out.println(Arrays.toString(arrayeElemanEkle(numbers,eklenecekSayi)));

        numbers = arrayeElemanEkle(numbers, 1);
        System.out.println("Sayilar'in " + eklenecekSayi + " eklenmis hali : " + Arrays.toString(numbers));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekSayi) {
        //var olan bir array'e yeni eleman ekleyemeyiz
        //ama array'e toptan yeni bir array degeri ekleyebiliriz

        //once uzunlugu eski arrayin 1 fazlası olan bir array olusturalim
        int[] newArr = new int[arr.length + 1];//[0, 0 , 0 ,0]

        //eski array'deki elemanlari ayni sayi indexlerler yeni array'e atayalim

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }//[3,5,7,0]

        //yeni array'in son indexine eklemek istenen sayiyi atayalim

        newArr[newArr.length - 1] = eklenecekSayi;

        return newArr;
    }
}
