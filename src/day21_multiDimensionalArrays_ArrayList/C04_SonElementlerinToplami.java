package day21_multiDimensionalArrays_ArrayList;

public class C04_SonElementlerinToplami {
    public static void main(String[] args) {

        //Verilen iki katli bir arraydeki her inner arraydeki
        //son.indexde bulunan sayilari toplayip yazdiran bir method olusturun


        int[][] arr = {{3, 6}, {1, 6, 9}, {8, 0, 2, 1}, {4}};
        sonElenanlariTopla(arr);
    }

    public static void sonElenanlariTopla(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr[i].length - 1];
        }
        System.out.println("Son Elementlerim Toplami : " + sum);
    }
}
