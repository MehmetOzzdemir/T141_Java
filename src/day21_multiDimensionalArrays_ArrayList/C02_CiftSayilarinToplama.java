package day21_multiDimensionalArrays_ArrayList;

public class C02_CiftSayilarinToplama {
    public static void main(String[] args) {

        //Verilen iki katli bir arraydeki cift sayilarin
        // toplamini yazdiran bir method

        int[][] arr = {{3, 6}, {1, 6, 9}, {8, 0, 2, 1}, {4}};
        ciftSayilarinToplami(arr);
    }

    public static void ciftSayilarinToplami(int[][] arr) {
        int ciftToplam = 0;
        for (int i = 0; i < arr.length; i++) {//outer array
            for (int j = 0; j < arr[i].length; j++) {//inner array
                if (arr[i][j] % 2 == 0) {
                    ciftToplam += arr[i][j];
                }
            }
        }
        System.out.println("Verilen İki Katli Arraydeki Cift Sayilarin Toplami : " + ciftToplam);


    }
}
