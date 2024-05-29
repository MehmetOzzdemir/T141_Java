package day21_multiDimensionalArrays_ArrayList;

public class C03_InnerArraylerinIlkElemanlariniTopla {
    public static void main(String[] args) {


        //Verilen iki katli bir arraydeki her inner arraydeki
        //0.indexde bulunan sayilari toplayip yazdiran bir method olusturun

        int[][] arr = {{3, 6}, {1, 6, 9}, {8, 0, 2, 1}, {4}};
        ilkELemaniTopla(arr);

    }

    public static void ilkELemaniTopla(int[][] arr) {
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][0];

        }
        System.out.println("İlk Elementlerin Toplani : "+sum);
    }

}
