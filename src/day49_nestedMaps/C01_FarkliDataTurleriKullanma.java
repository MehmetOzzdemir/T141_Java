package day49_nestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C01_FarkliDataTurleriKullanma {
    public static void main(String[] args) {

        /*
            Java daki herhangi bir yapinin icerisinde
            farkli data turlerinden degerler bulundurmak istersek
            data turu olarak Object secebilirsiniz

            ANCAK data turunu object sectigimizde
            diger data tuurlarine ozgu olan length,size, toUpperCase gibi methodlar
            obje üzerinde calismayacaktir

            Data turunun spesifik methodlarini kullanmak icin
            Objeyi kullanmak istedigimizde data turunu CAST etmeliyiz.
         */

        List<String> seyler = new ArrayList<>();
        seyler.add("Ali");
        seyler.add("4");
        //seyler.add('d');
        //seyler.add(5);
        //seyler.add(true);

        String [] harfler ={"a","b","c"};
        //seyler.add(harfler);

        //Bir listeye <> icinde yazilan data turu disinda
        //herhangi bir data turunden deger ekleyemeiz


        List<Object> objeler = new ArrayList<>();

        objeler.add("ALi");
        objeler.add(5);
        objeler.add('d');
        objeler.add(true);
        objeler.add(harfler);
        objeler.add(seyler);
        objeler.add(51);

        System.out.println(objeler);// [ALi, 5, d, true, [Ljava.lang.String;@129a8472, [Ali, 4], 51]

        //objeler listesinin 4.indexindeki array i yazdrin

        System.out.println(Arrays.toString((String[]) objeler.get(4)));

        //objeler listesinin ilk elementi olan Alinin uzunlugunu yazdirin

        System.out.println(((String) objeler.get(0)).length()); //3

        //objeler listesinin 2. elementi olan 5'in 3 fazlasini yazdirin
        System.out.println((Integer)objeler.get(1)+3); //8
    }
}
