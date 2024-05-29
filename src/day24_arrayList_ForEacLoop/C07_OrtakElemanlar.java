package day24_arrayList_ForEacLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_OrtakElemanlar {
    public static void main(String[] args) {
        //Verilen iki arrayde elementlerinş karsilastirip
        //ikisinin ortak elementleri
        //ayri bir liste olarak veren bir program yazin


        int[] arr1 = {3, 6, 8, 1, 0, 3, 8, 1, 1};
        int[] arr2 = {3, 6, 7, 5, 6, 5, 6, 5, 1};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        //bir arraydeki tüm elementleri
        //diger arraydeki tüm elemanlarla karsilastirmak icin
        //nested loop kullanmak zorundayiz

        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)) {
                    ortakElemanlarListesi.add(each1);
                }
            }
        }
        System.out.println("Ortak Elemanlar Listesi : " + ortakElemanlarListesi);  // [3, 6, 1]


    }


}
