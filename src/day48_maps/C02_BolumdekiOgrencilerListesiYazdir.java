package day48_maps;

import day47_maps.OgrenciMapClass;

public class C02_BolumdekiOgrencilerListesiYazdir extends OgrenciMapClass {
    public static void main(String[] args) {
        /*
         2- verilen bolumdeki tum ogrencilerin
           isim soyisim sinif ve subelerini yazdirin
         */
        mapeOgrenciEkle();
        bolumdekiOgrencilerinListesiniYazdir("mf");
        System.out.println("---------");
        bolumdekiOgrencilerinListesiniYazdir("tm");
        System.out.println("---------");
        bolumdekiOgrencilerinListesiniYazdir("soz");
        System.out.println("---------");
        bolumdekiOgrencilerinListesiniYazdir("yazilimci");
    }
}
