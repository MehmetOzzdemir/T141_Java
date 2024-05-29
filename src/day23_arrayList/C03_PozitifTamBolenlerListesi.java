package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_PozitifTamBolenlerListesi {
    public static void main(String[] args) {
        //verilen pozitif bir tamsayiyi
        //tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduyren bir method olusturun
        //  input: 20 outout : [1 ,2 , 4, 5 ,10, 20 ]
        System.out.println(pozitifBolenListesi(20));
        System.out.println(pozitifBolenListesi(240));
        System.out.println(pozitifBolenListesi(20));

    }

    public static List<Integer> pozitifBolenListesi(int number) {
        List<Integer> pozitifBolenListesi = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                pozitifBolenListesi.add(i);
            }
        }

        return pozitifBolenListesi;
    }
}
