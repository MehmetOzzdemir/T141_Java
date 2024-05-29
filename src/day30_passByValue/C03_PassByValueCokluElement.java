package day30_passByValue;

import java.util.Arrays;

public class C03_PassByValueCokluElement {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2};
        //arrayin tim elementlerini bir azaltip yazdiran method olusturun
        elementleriAzalt(arr);  //  [5, 8, 1]
        System.out.println(Arrays.toString(arr));   //  [5, 8, 1]
        System.out.println();

        //yeni bir methodda uzunlugu 4 olan bir array oluıturun
        //arr'deki elementleri yeni array'e tasiyin
        //4 . eleman olarak 3 atayim
        // islem bittikten sonra yeni array'i arr'ye atayip yazdirin

        yeniArrayOlustur(arr);  //  [5, 8, 1, 3]
        System.out.println("Eleman ekle methodundan sonra arr : "+Arrays.toString(arr));   //  [5, 8, 1]


    }

    public static void elementleriAzalt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void yeniArrayOlustur(int[] arr) {
        int[] newArr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[3] = 3;


        arr = newArr;
        System.out.println(Arrays.toString(arr));

    }

}
