package day45_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_NicinIteratorKullanilir {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 2, 4));
        System.out.println(numbers);


        //sayilar listesindeki tum elementleri 2 artirip
        //yeni haliyle listeyi kaydedin [7,11,4,6]

        for (int i = 0; i < numbers.size(); i++) {
            int eskideger = numbers.get(i);
            numbers.set(i, eskideger + 2);
        }


        //Index kullanmasan sayilar listesindeki tum elementleri
        //yeniden 2 artirin ve yeni haliyle kaydedin

        for (int each : numbers
        ) {
            each += 2;
        }

        System.out.println(numbers);// [7,11,4,6]


        //Java her zaman index kullanamayabilir
        //index kullanmadan bir listedeki tum elementlere ulasmak istersek
        //Iterator kullanabiliriz

        //Index kullanmadan sayilar listesindeki tek sayilari silin

        //[     7,      11,      4,      6       ]

        Iterator iterator = numbers.iterator();

        System.out.println(iterator.hasNext());// true


        Integer num = (Integer) iterator.next();
        if (num % 2 != 0) {
            iterator.remove();//7 yi siler
        }
        System.out.println(iterator.hasNext()); // true

        num = (Integer) iterator.next();

        if (num % 2 != 0) {
            iterator.remove(); // 11 i siler
        }
        System.out.println();
        System.out.println(numbers);

        System.out.println();

        numbers.add(15);
        numbers.add(23);
        numbers.add(43);

        //eger her element icin bu islemi tek tek yazmak istemezsek
        //bir while loop kullanabiliriz

        System.out.println(numbers);


        iterator = numbers.iterator();

        while (iterator.hasNext()) {
            num=(Integer)iterator.next();
            if (num % 2 != 0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }


}
