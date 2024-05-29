package day20_arrays_multiDimensionalArrays;

import day19_arrays.C05_ElemanArama;

import java.util.Arrays;

public class C03_Sort {
    public static void main(String[] args) {
        int[] numbers = {2, 9, 4, 7, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//[1, 2, 4, 7, 9]


        String [] names = {"Mehmet","Mahmut","Mustafa","Mansur","melik","MEMET"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[MEMET, Mahmut, Mansur, Mehmet, Mustafa, melik]
        //Buyuk harflerin ASCII degerleri daha kucuk oldugu icin siralama bu sekildedir

        //C05_ElemanArama.elemanVarMi(numbers,4);
    }
}
