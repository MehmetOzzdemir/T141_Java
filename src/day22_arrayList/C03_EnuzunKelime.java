package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_EnuzunKelime {
    public static void main(String[] args) {
        //Vewrilen bir String List teki
        // en uzun kelimeyi yazdirin en
        // uzun kelimenin harf sayisina esit
        // birden fazla kelime varsa en sonuncuyu yazdirin

        List<String> names = new ArrayList<>(Arrays.asList("Seher", "Sumeyra", "Meltem", "Ramazan", "Mustafa"));

        System.out.println(names);


        String enUzun = names.get(0);
        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).length() >= enUzun.length()) {
                enUzun = names.get(i);
            }


        }

        System.out.println(enUzun);


    }
}
