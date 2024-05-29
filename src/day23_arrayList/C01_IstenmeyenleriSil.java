package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_IstenmeyenleriSil {
    public static void main(String[] args) {
        // verilen String bir Listede
        //istenmeyen harf iceren elementleri silip
        //kalan kismini list olarak vize donduren bir method

        List<String> names = new ArrayList<>(Arrays.asList("Seher", "Seren", "Meltem", "Bekir", "Sait", "Hasan"));

        String isteneyenHarf = "e";

        System.out.println(names);  //  [Seher, Seren, Meltem, Bekir, Sait, Hasan]


        System.out.println(istenmeyenHarfleriSil(names, isteneyenHarf));


    }

    public static List<String> istenmeyenHarfleriSil(List<String> names, String istenmeyenHarf) {

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains(istenmeyenHarf)) {
                names.remove(i);
                i--;
            }
        }


        return names;
    }
}
