package day30_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_Mutable_ImmutableClasses {
    public static void main(String[] args) {

        /*


         */
        String str = "Java Candir";
        str.toUpperCase();
        System.out.println(str);    //Java Candir

        System.out.println(str.substring(5));   //    Candir
        System.out.println(str);    //Java Candir

        str.length();
        str.toLowerCase();
        str.replace("a", "c");

        System.out.println(str);    //Java Candir

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        System.out.println(numbers);    //  [4, 7]
        numbers.add(1, 9);
        System.out.println(numbers);    //  [4, 9, 7]
        numbers.remove(0);
        System.out.println(numbers);    //  [9, 7]
    }
}
