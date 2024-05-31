package day48_maps;

import day47_maps.OgrenciMapClass;

public class C04_BolumUpdate extends OgrenciMapClass {
    public static void main(String[] args) {
        //istenen bolumdeki tum ogrencilerin
        //bolum isimlerini yeni verilen bolum ismi olarak degistirin
        //Ornek : MF bolumundeki tum ogrencilerin bolumunu SAY yapalim

        mapeOgrenciEkle();
        System.out.println(ogrenciMap);
        bolumDegistir("MF","SAY");
        System.out.println(ogrenciMap);
        bolumDegistir("TM","Eşit Agirlik");
        System.out.println(ogrenciMap);
    }
}
