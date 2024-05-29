package day19_arrays;

import java.util.Arrays;

public class C03_TumElementleriArttirma {
    public static void main(String[] args) {
        /*
        soru-1 Verilen bir int arrayin tüm elemanlarini 2 arttirip
        bize donduren bir method olusturun.
        Eski array'i yeni haliyle kaydedin
         */
        int[] arr = {3,7,2};
        arr =elemanlariArttir(arr,2);

        //System.out.println("Array'in Son Hali : "+Arrays.toString(arr));
        //gorevde yazdirma yok biz kodumuz dogru calisiyor mu diye kontrol etmek icin yazdirdik
    }

    public static int[] elemanlariArttir(int[] arr,int artisMiktari){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=artisMiktari;
        }
        return arr;


    }
}
