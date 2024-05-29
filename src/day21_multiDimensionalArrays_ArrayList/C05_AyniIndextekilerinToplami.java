package day21_multiDimensionalArrays_ArrayList;

import java.util.Arrays;

public class C05_AyniIndextekilerinToplami {
    public static void main(String[] args) {
        //Verilen iki katli iki elemanli bir  arrayde
        // ayni indexe sahip elemanlari toplayip
        //yeni olusturacagimiz tek katli arraye taoplamlarini atayin
        //input : int [][] arr = {{3,4,5},{2,3,6,7}};
        //output  :         [5,7,11]


        int[][] arr = {{3, 4, 5,1}, {2, 3, 6, 7}};


        //Once Yeni olusturacagimiz arrayin uzunluguunu belirlemek icin
        //verilen arraylerden kisa elemanin langrhini bulmalisinniz

        int newArrayLength = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;
        int[] newArr = new int[newArrayLength];//[0,0,0]


        for (int i = 0; i < newArrayLength; i++) {
            newArr[i] = arr[0][i] + arr[1][i];

        }

        System.out.println(Arrays.toString(newArr));

    }
}
