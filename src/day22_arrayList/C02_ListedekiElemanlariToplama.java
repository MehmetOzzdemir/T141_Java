package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListedekiElemanlariToplama {
    public static void main(String[] args) {
        //Verilen bir integer bir Listedeki
        //tüm elemanlari toplayıp sonucunu yazdirin

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 8, 1, 3, 5, 6));
        System.out.println(list); //[3, 6, 8, 1, 3, 5, 6]

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println("Listedeki sayilarin Toplami : " + sum);
    }
}
