package day46_collections;

import java.util.Set;
import java.util.TreeSet;

public class C06_Set {
    public static void main(String[] args) {
        Set<String> harfler = new TreeSet<>();

        harfler.add("a");
        harfler.add("b");
        harfler.add("a");
        harfler.add("a");

        System.out.println(harfler); // [a,b]

        Set<String> names = new TreeSet<>();

        names.add("Seren");
        names.add("Bugra Can");
        names.add("Ilgar");

        System.out.println(names); //[Bugra,Ilgar,Seren]

        //Set de bulunan tum isimlerdeki toplam karakter sayisini yazdirin
        //Set INDEX KULLANMAZ
        //tüm elementleri elden gecirmek istersek
        //iterator veya for-each loop kullanbiliriz

        System.out.println(names.size()); // 3

        int toplamHarfSayisi = 0;

        for (String eachIsim : names) {
            toplamHarfSayisi += eachIsim.length();
        }

        System.out.println("Setteki Toplam karakter Sayisi : " + toplamHarfSayisi);
        //setteki Toplam karakter Sayisi : 19

        //Set'deki tum isimleri buyuk harfe donusturup kaydedin

        /*
        Set index desteklemedigi icin
        elemanlar uzerinde degisiklik yapmak zor olur
        eger elemanlarda degisiklik yapmak istersek
        once bos bir olusturup
        eski setteki elemanlara istenen degisikligi yapip yeni set e ekleriz
        islem bittikten sonra eski set e deger olarak yeni set'i atariz
         */


        Set<String> yeniSet = new TreeSet<>();
        for (String eachIsim : names
        ) {
            yeniSet.add(eachIsim.toUpperCase());
        }
        System.out.println(names);

        System.out.println("names: " + names); //[Bugra Can, Ilgar, Seren]
        System.out.println("Yeni Set" + yeniSet); //[BUGRA CAN, ILGAR, SEREN]

        names = yeniSet;
        System.out.println("Isimler setinin son hali : " + names); //[BUGRA CAN, ILGAR, SEREN]

    }
}
