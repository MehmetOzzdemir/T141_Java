package day24_arrayList_ForEacLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        //Verilen String bir listedeki kullanılan
        // toplam harf veya karakter sayisini yazdirin

        List<String> names = new ArrayList<>(Arrays.asList("Seren", "Ekbal", "Ilgar", "Johanna", "Ali Cabbar"));

        int sumChracter = 0;

        for (int i = 0; i < names.size(); i++) {
            sumChracter += names.get(i).length();
        }

        System.out.println("Listede Toplam : "+sumChracter+" adet harf veya Karakter Kullanilmistir");

    }
}
