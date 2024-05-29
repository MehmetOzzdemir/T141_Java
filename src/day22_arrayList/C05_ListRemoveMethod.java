package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemoveMethod {
    public static void main(String[] args) {

        List<String> letters = new ArrayList<>(Arrays.asList("a", "r", "a", "t", "a", "s"));


        //remove(istenenobject) ==> listede varsa siler ve listte degisir
        //Listede yoksa silinmez liste degismez
        System.out.println(letters);//[a, r, a, t, a, s]

        letters.remove("a");

        System.out.println(letters); //[r, a, t, a, s]

        letters.remove("x");

        System.out.println(letters); //[r, a, t, a, s]


        //remove methodu calistiginda asil amaci olan silme islemini yapar
        //delil olarak da sildi ise true , bulamadi ise false dondurur

        System.out.println(letters.remove("s")); // true

        System.out.println(letters); //[r, a, t, a]

        System.out.println(letters.remove("y")); //false

        //eger remove(istenenindex) kullanilirsa
        //indexi bulamama die bir sey olmayacagindan
        //true/false yerine bize sildigi elemani dondurur

        System.out.println(letters.remove(1));// a
        System.out.println(letters);//[r,t,a]
        // letters.remove(10);  //IndexOutOfBoundsException

        List<String> karakterler = new ArrayList<>(Arrays.asList("9", "a", "%", "i", "#"));

        //Karakterler listesinden harfler listesinde olan tum harfleri siler
        //karakterler listesi degisirse true ,deg,smezse false dondurur

        System.out.println(karakterler.removeAll(letters)); //true

        System.out.println(karakterler); //[9, %, i, #]

        System.out.println(karakterler.removeAll(letters)); //false


        //Listemiz sayilardan olusuyorsa
        //girilen sayinin index mi yoksa silinecek sayi mi oldugunu
        //ner  olarak bilmek icin
        //Java girilen sayiyi INDEX olarak KABUL edecegini belirtir
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 5, 7, 3, 5, 6));
        System.out.println(numbers); //[2, 5, 7, 3, 5, 6]

        System.out.println(numbers.remove(2));// delil olarak sildigi eleman 7 doner

        System.out.println(numbers);

        //EGER eleman olarak 6'yi silmek istiyorsak
        //ve indexini bilmiyoersak
        //once silinecek sayiyi non-primitive bir variavle atamaliyiz

        Integer removeNumber = 6;
        System.out.println(numbers.remove(removeNumber)); //true
        System.out.println(numbers);//[2, 5, 3, 5]




    }
}
