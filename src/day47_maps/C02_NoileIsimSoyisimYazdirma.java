package day47_maps;

public class C02_NoileIsimSoyisimYazdirma extends OgrenciMapClass {
    public static void main(String[] args) {

        // kullanicinin verdigi numara ile
        // ogrencinin ismini ve soyismini yazdirin

        System.out.println(ogrenciMap); // {}

        mapeOgrenciEkle();

        System.out.println(ogrenciMap);

        //ornek 101 numarali ogrencinin ismini ve soyisimini yazdiralim

        //hazir method bize 101'in tum value sunu verir
        System.out.println(ogrenciMap.get(101));//Ali-Can-11-H-MF


        noIleIsımSoyisimYazdir(101); // Ali Can

        //105 numarali ogrencinin isim ve soyismini yazdirin
        noIleIsımSoyisimYazdir(105); //Sevgi Cem



    }
}
