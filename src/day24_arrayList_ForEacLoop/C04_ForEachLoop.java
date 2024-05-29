package day24_arrayList_ForEacLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        // Verilen bir arrayde tekrar eden elementler icin mukerrer olanlari silip
        // Tüm elemanlardan sadece 1 tane yapıp eski arraye yeni halini atayip yazdirin

        int[] arr = {3, 3, 4, 4, 5, 4, 3, 2, 3, 6, 5, 4, 3, 2};

        List<Integer> benzersizlist = new ArrayList<>();

        for (int each : arr) {
            if (!benzersizlist.contains(each)) {
                benzersizlist.add(each);
            }

        }

        System.out.println(benzersizlist); //[3, 4, 5, 2, 6]


        //arrayden eleman silemedigimiz icin
        //istedigimiz elementlere sahip yeni bir array olusturalim


        arr = new int[benzersizlist.size()];//[0,0,0,0]

        for (int i = 0; i < arr.length; i++) {
            arr[i] = benzersizlist.get(i);
        }

        System.out.println("Array'in Son Hali : " + Arrays.toString(arr));
    }

}
