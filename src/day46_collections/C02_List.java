package day46_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        System.out.println(numbers);//[3,5,8]


        //5 ile 8 in arasina bir ekleyelim

        numbers.add(2, 1);
        System.out.println(numbers);//[3,5,1,8]


        List<Integer> numbers2 = new LinkedList<>();

        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(7);


        System.out.println(numbers2); // [3,4,7]

        numbers.retainAll(numbers2);
        System.out.println(numbers); // [3]
        System.out.println(numbers2);// [3,4,7]

        //numbers2.remove(3); // IndexOutOfBoundsException


        System.out.println(numbers2.equals(numbers)); // false

    }
}
