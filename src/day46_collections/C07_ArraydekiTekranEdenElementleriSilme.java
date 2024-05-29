package day46_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C07_ArraydekiTekranEdenElementleriSilme {
    public static void main(String[] args) {

        //Verilen int bir arraydeki
        //tekrar eden sayilari silip
        //arraydeki her bir elent unique olacak sekilde array'i kaydedin

        int[] arr = {3, 6, 5, 1, 2, 5, 7, 9, 3, 4, 5, 2, 3, 6};
        //output arr = [3,,5,1,2,7,4]


        Set<Integer> benzersizSayilarSeti = new TreeSet<>();
        for (int eachSayi : arr
        ) {
            benzersizSayilarSeti.add(eachSayi);
        }

        System.out.println("Benzarsiz Sayilar Seyi : " + benzersizSayilarSeti);
        //[1, 2, 3, 4, 5, 6, 7, 9]
        System.out.println("Arr : " + Arrays.toString(arr));
        //[3, 6, 5, 1, 2, 5, 7, 9, 3, 4, 5, 2, 3, 6]

        //simdi arr'yi setdeki sayilardan olusan hale donusturmalisiniz

        arr= new int[benzersizSayilarSeti.size()];

        int index =0;

        for (int eachSayi : benzersizSayilarSeti
        ){
            arr[index]=eachSayi;
            index++;
        }
        System.out.println("Arr'nin son hali : "+Arrays.toString(arr));
        //[1, 2, 3, 4, 5, 6, 7, 9]


    }
}
