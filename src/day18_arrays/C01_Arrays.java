package day18_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /*
        Bir array iki sekilde olusturulur
            1 - deklerasyon ve icindeki tum elementler yazilabilir
         */
        String[] names = {"Mehmet", "Hasan", "Ilgar", "Sumeyra"};
        String[] letters = {"a", "l", "i"};

        // 2 - declerasyon ve array'in eleman sayisi yazilip array olusturulabilir

        int[] numbers = new int[3];// [0,0,0]

        //names array' Write 'hasan'

        System.out.println(names[1]);

        //olusturulan bir array'in uzunlugu sabittir degistirilemez

        //letters array'ininjn 1.indexindeki harfi yazdirin
        System.out.println(letters[1]);

        //letters arrayinin 2. indexindeki elemani i yapin


        letters[2] = "i";

        //Letter array'ine 4. eleman olarak Q 'u atayin

        //letters[4] = "q";//ArrayIndexOutOfBoundsException


        //icinde 5,8,1 sayilarinin oldugu bir array olusturun

        int[] numbers1 = {5, 8, 1};

        int[] number2 = new int[3];
        number2[0] = 5;
        number2[1] = 8;
        number2[2] = 1;


        System.out.println(number2);//number2 arrayinin [I@d041cf referansidir

        System.out.println(Arrays.toString(number2));//[5, 8, 1]
        System.out.println(number2.length);


    }

}
