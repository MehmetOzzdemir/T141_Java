package day21_multiDimensionalArrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListMethodlari {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();// Type argument cannot be of primitive typr
        numbers.add(10);
        numbers.add(7);
        numbers.add(9);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 8, 1, 3, 5, 6));
        System.out.println(list);   //  [1, 6, 8, 1, 3, 5, 6]

        //List'deki eleman sayisini yazdirin

        System.out.println(list.size());// 7

        //listede eleaman olarak 7 var mi

        System.out.println(list.contains(7)); // false

    }
}
