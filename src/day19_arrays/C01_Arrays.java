package day19_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        int[] arr = new int[4];//[0,0,0,0]

        //arrayin 2. indexindeki elementi yazdirin

        System.out.println(arr[2]);//0

        //arrayin 1.indexine deger olarak 5 atayin

        arr[1] = 5;

        //tüm arrayi yazdirin
        System.out.println(arr);//[I@d041cf
        System.out.println(Arrays.toString(arr));//[0, 5, 0, 0]

        //bir arrayin kac elemanli oldugunu(length) yazdirin
        System.out.println(arr.length);

        //arraydeki tim elemanlari yanlarinda bosluk birakarak yazdirin

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
