package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_TekrarsizHaleGetirme {
    public static void main(String[] args) {
        //Soru-1 Verilen bir arrray de
        // tekrar eden elementler icin tekrar
        // edenleri sadece bir defa olacak sekle
        // ceviren method


        int[] arr = {3, 5, 3, 5, 6, 5, 3, 4, 6, 5, 2, 3, 6, 4, 3};
        arr = uniqueHaleGetir(arr);//UniqueList [3, 5, 6, 4, 2]
        System.out.println(Arrays.toString(arr));
    }


    public static int[] uniqueHaleGetir(int[] arr) {

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        System.out.println("UniqueList : " + uniqueList);//UniqueList [3, 5, 6, 4, 2]

        //biz listeyi unique olarak olusturduk
        //simdi arrayi listedeki elementlerin oldugu hale donusturmeliyiz

        int[] newArr = new int[uniqueList.size()];


        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = uniqueList.get(i);

        }

        return newArr;
    }
}
