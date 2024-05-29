package day20_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
        verilen bir int arrayde
        verilen min ve maz degerler dahil olarak
        min ve max degerler arasındaki sayilasri yazdirann bir method olusturun
         */
        int[] numbers = {1, 2, 3, 4, 5, 7, 8};
        int max = 10;
        int min = 3;
        araliktakiDegerleriYazdir(numbers, min, max);
        araliktakiDegerleriYazdir(numbers, 1, 5);
        araliktakiDegerleriYazdir(numbers, 100, 123);

    }

    public static void araliktakiDegerleriYazdir(int[] arr, int min, int max) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

}
