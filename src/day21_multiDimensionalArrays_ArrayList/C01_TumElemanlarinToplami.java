package day21_multiDimensionalArrays_ArrayList;

public class C01_TumElemanlarinToplami {
    public static void main(String[] args) {
        //Verilen iki katlı integer bir arraydeki
        //tüm sayilarin toplamini yazdiran bir method olusturun

        int[][] arr = {{3, 6}, {1, 6, 9}, {8, 0, 2, 1}, {4}};
        elemanlarinToplaminiYazdir(arr);//İki Katli Array'dekik Tüm Elementlerin Toplami : 40

    }

    public static void elemanlarinToplaminiYazdir(int[][] arr) {
        //Eger hib bir sart olmaksizin
        //2 katli  array'deki tüm elementlere ulasmak isterseniz
        //2 katli nested bir loop olusturmaliyiz
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//outer array'i kontrol eder
            for (int j = 0; j < arr[i].length; j++) {//her bir inner array'i kontrol eder
                sum += arr[i][j];
            }
        }
        System.out.println("İki Katli Array'dekik Tüm Elementlerin Toplami : " + sum);
    }
}
