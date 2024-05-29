package day47_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 5, 6, 3, 5, 1, 2, 3, 6, 5, 2, 1));
//
//        //3 un kac kere kullanildigini bulun
//        istenenSayiAdediYazdir(3, numbers);
//        //method da : Arraydeki  istenen sayi adedi : 3
//
//        //5 in kac kere kullanildigini yazdirin
//        istenenSayiAdediYazdir(5, numbers);
//
//        //method da : Arraydeki  istenen sayi adedi : 4
//
//    }
//
//    public static void istenenSayiAdediYazdir(int istenenSayi, List<Integer> numbers) {
//
//        int ucAdedi = 0;
//
//        for (int each : numbers) {
//            if (each == istenenSayi) {
//                ucAdedi++;
//            }
//        }
//        System.out.println("Array'deki " + istenenSayi + " adedi " + ucAdedi + " tanedir");
//
//    }

        //bir ogrenci mapi olusturmamiz isteniyor
        //mnap olusturmadan once
        //  1- Hangi bilgileri tutacagiz No,isim,soyisim,sinif,sube,bolum
        //  2- Hangi bilgi key olacak no
        //  3- Gereiye kaln bigiler hangi data turunde value olarak birlestirilecek
        //  value olusturan bilgiler hangi sira ile tutulacak
        //  ve ihtiyaca oldugunda o bilgilere nasil ulasilacak

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");

        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-11-H-MF,
         102=Veli-Cem-10-K-TM,
          103=Ali-Cem-11-K-TM}
         */
//bu map de kac eleman var
        System.out.println(ogrenciMap.size()); // 3


        //sadece key leri yazdiralim

        System.out.println(ogrenciMap.keySet());//[101,102,103]

        //map de 102 diye bir key var mi
        System.out.println(ogrenciMap.containsKey(102)); //true

        //map de 105 diye bir key var mi
        System.out.println(ogrenciMap.containsKey(105)); // false

        //101 numarali ogrencini bilgilerini yazdirin
        System.out.println(ogrenciMap.get(101));    //Ali-Can-11-H-MF

        //106 numarali ogrencini bilgilerini yazdirin
        System.out.println(ogrenciMap.get(106)); //null

        //Tum valuleri yazdiralim
        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM]


        //values collcetion inda kac bilgi var\
        System.out.println(ogrenciMap.values().size()); //3

        //Valueler icinde Ali var mi?
        System.out.println(ogrenciMap.containsValue("Ali")); //false
        //contains value butun olarak bir value yu arar
        //value icindeki bilgileri tek tek kontrol etmez
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); //true


    }
}
