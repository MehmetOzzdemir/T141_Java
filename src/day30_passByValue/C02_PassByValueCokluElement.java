package day30_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_PassByValueCokluElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 11));

        //listedeki elementleri 3 artirip listeni yeni halini yazdiran method olusturun
        elementleriArtir(numbers);
        System.out.println(numbers);
        System.out.println();
        //istedeki elemetleri yeni olusturacagımız bir listeye kopyalayip degerlerini 3 artirip yazdiran method olusutur

        yeniListeolustur(numbers);
        System.out.println(numbers);

    }

    public static void elementleriArtir(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 3);
        }
        System.out.println(numbers);
    }

    public static void yeniListeolustur(List<Integer> numbers) {
        List<Integer> numbers2;
        numbers2 = numbers;
        for (int i = 0; i < numbers.size(); i++) {
            numbers2.set(i,numbers2.get(i)+3);
        }
        System.out.println(numbers2);
    }

}
