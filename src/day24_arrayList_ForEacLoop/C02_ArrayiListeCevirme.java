package day24_arrayList_ForEacLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayiListeCevirme {
    public static void main(String[] args) {
        Integer[] numbers = {3, 5, 2, 6, 7, 3, 4, 5};

        //bu arrayi liste cevirin
        //1- Bir Loop ile array deki tüm elemanlari liste ekleyebilirsiniz
        //   Bir array'i listeye cevirmek icin bu yontem daha saglikli calisir

        List<Integer> numberList1 = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numberList1.add(numbers[i]);
        }
        System.out.println(numberList1); //[3, 5, 2, 6, 7, 3, 4, 5]
        numberList1.add(9);
        numberList1.remove(0);
        System.out.println(numberList1);// [5, 2, 6, 7, 3, 4, 5, 9]

        //2.Aslist()
        /*
        Varolan bir arrayi tek bir satirla asList() kullanarak listeye cevirebiliriz

        ANCAK bu cevirme islemi ile olusturulan Listede 2 Major yan etki olur

            -asList() ile donusturulen listeye
             arrayde oldugu gibi ekleme veya silme yapamazsiniz

            -asList() ile donusturulen liste ve kaynak olarak kullanilan array
            etkilesime devam eder
            array'de yaptigimiz degisikler listeye yansir
            ayni sekilde yaptigimiz degisikler array'e yansir
         */

        List<Integer> numberList2 = Arrays.asList(numbers);
        System.out.println("AsList ile Donusturulen Liste : " + numberList2); //[3, 5, 2, 6, 7, 3, 4, 5]

        //numberList2.add(9); //UnsupportedOperationException
        //numberList2.remove(0); //UnsupportedOperationException


        numbers[0] = 23;
        numbers[1] = 15;
        System.out.println("Array'e yapilan atamdan sonra array : " + Arrays.toString(numbers));
        //Array'e yapilan atamdan sonra array : [23, 15, 2, 6, 7, 3, 4, 5]

        System.out.println("Array'e yapilan atamadan sonra Liste : " + numberList2);
        //Array'e yapilan atamadan sonra Liste : [23, 15, 2, 6, 7, 3, 4, 5]
    }
}
