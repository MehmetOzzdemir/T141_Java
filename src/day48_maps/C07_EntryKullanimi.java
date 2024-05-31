package day48_maps;

import day47_maps.OgrenciMapClass;

import java.security.Key;
import java.util.Map;
import java.util.Set;

public class C07_EntryKullanimi extends OgrenciMapClass {
    public static void main(String[] args) {
        mapeOgrenciEkle();
        System.out.println(ogrenciMap);

        Integer ogrenciNo = 103;
        System.out.println(ogrenciNo + " " + ogrenciMap.get(ogrenciNo));


        //tum ogrencilerin key ve value lerini alt alta liste olarak yazdirin
        //tum ogrencilere ulasmamiz gerektigi icin
        //keyleri bir set olarak kaydedelim
        Set<Integer> keySeti = ogrenciMap.keySet();

        //bir loop ile ber bir key i ele alip key ve value u yazdirlalim
        for (Integer eachKey : keySeti) {
            System.out.println(eachKey + " " + ogrenciMap.get(eachKey));
        }


        //su ana kadar ogrendigimiz methodlarda
        //map icindeki key ve value ler birbirinden bagimsiz
        //bir ogrencinin ke ve value sunu tek bir deger olarak alamiyoruz

        //Java key ve value yu birlikte kullanan Entry Class i olusturmustur

        //1. avantaj  : key ve value birlikte ele alabiliyoruz

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        System.out.println("Entry Seti ile Ogrenci Listesi");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {
            System.out.println(eachEntry);
        }
        System.out.println("----------------");
        System.out.println("Entry Seti : " + ogrenciEntrySeti);

        System.out.println("Ogrenci Mapi : " + ogrenciMap);

        //2.avantaj entry de yapilan updateler
        // otomatik olarak map e de islenir

        //Tum ogrencilerin isimlerini BUYUK HARF' e donusturun

        //1-Tüm öğrenci bilgilerini entrySet olarak kaydedelim
        //37. satirda kaydettik

        //2- entrySet bir Set oldugu icin for each loop ile
        // key ve value lerden olusan entryleri tek tek ele alalim

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {
            //bu loop tek tek tum entryleri bize getirir
            //03=Ali-Cem-11-K-TM

            //eski value yu kaydedeliö
            String eskiValue = eachEntry.getValue(); // "Ali-Cem-11-K-TM"

            //2- bilgilere ulasabilme icin split yapalim
            String[] valueArr = eskiValue.split("-");

            //3- ismi buyuk harfe epdate edelim
            valueArr[0] = valueArr[0].toUpperCase();

            //4- update arra de yapildi
            eachEntry.setValue(String.join("-", valueArr));

        }
        System.out.println(ogrenciMap);
    }
}
