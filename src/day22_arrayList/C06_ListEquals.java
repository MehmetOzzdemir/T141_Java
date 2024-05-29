package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C06_ListEquals {
    public static void main(String[] args) {


        //Ayni indexdeki tüm elementler ayni ise true
        //ayni olmayan varsa false dondurur
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 6, 9));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(6, 9, 2));
        System.out.println(numbers1.equals(numbers2)); //false

        Collections.sort(numbers1);
        Collections.sort(numbers2);
        System.out.println(numbers1.equals(numbers2));  //true
    }
}
