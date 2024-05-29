package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>(Arrays.asList("a", "d", "a", "y", "a", "d", "m"));//[a, d, a, y, a, d, m]


        System.out.println(letters);//[a, d, a, y, a, d, m]


        //Eleman < = = > index

        //Eger index verip o indexdeki elemani gormek isterseniz

        System.out.println(letters.get(2));//a

        //eger harfi verip indexini istersek

        System.out.println(letters.indexOf("a"));   //  0

        System.out.println(letters.lastIndexOf("a"));   //  4


        System.out.println(letters.indexOf("y"));//3
        System.out.println(letters.lastIndexOf("y"));   //  3

        System.out.println(letters.lastIndexOf("k"));    //     -1

    }
}
