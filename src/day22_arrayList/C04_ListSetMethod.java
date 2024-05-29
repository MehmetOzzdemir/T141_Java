package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ListSetMethod {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 7, 1));

        System.out.println(numbers);// [3, 4, 7, 1]

        numbers.add(2,9); //[3, 4, 9, 7, 1]

        System.out.println(numbers);

        //set()  ==> update yani yeni deger atamasi yapar

        numbers.set(2,5);
        System.out.println(numbers);// [3, 4, 5, 7, 1]
    }
}
