package day48_maps;

import day47_maps.OgrenciMapClass;

public class C01_OgrenciNumarasinaGoreListeYazdir extends OgrenciMapClass {
    public static void main(String[] args) {
        /*
         1- Ogrenci numarasi olarak verilen min ve max (sinirlar dahil) numaralar
           arasindaki tum ogrencilerin numara, isim, soyisim, sinif ve subelerini yazdirin

         */

        mapeOgrenciEkle();
        System.out.println(ogrenciMap);
        numaraAraligindakiOgrenciBilgileriniYazdir(103,105);
        System.out.println("-------------------------------");
        numaraAraligindakiOgrenciBilgileriniYazdir(102,103);

    }
}
