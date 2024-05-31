package day48_maps;

import day47_maps.OgrenciMapClass;

public class C06_YeniOgrenciEkle extends OgrenciMapClass {
    public static void main(String[] args) {


        mapeOgrenciEkle();
        System.out.println(ogrenciMap);

        ogrenciEkle(101);
        System.out.println("---------------");

        ogrenciEkle(155);
        System.out.println(ogrenciMap);

    }
}
