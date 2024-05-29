package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListMethods {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();// Type argument cannot be of primitive typr
        numbers.add(10);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers); //[10, 7, 9]

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 8));
        System.out.println(list);   //  [3, 6, 8]


        numbers.add(1, 5);//[10, 5, 7, 9]
        System.out.println(numbers);
        numbers.addAll(list);
        System.out.println(numbers);//[10, 5, 7, 9, 3, 6, 8]
        numbers.addAll(2, list);
        System.out.println(numbers);//[10, 5, 3, 6, 8, 7, 9, 3, 6, 8]

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(6));



    }
}
