package day47_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class OgrenciMapClass {
    protected static Map<Integer, String> ogrenciMap = new HashMap<>();

    public static void mapeOgrenciEkle() {
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
    }

    public static void noIleIsımSoyisimYazdir(int ogrenciNo) {

        //verilen ogrenci numarasina ait value yu String olarak kaydedelim

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

        // bu String deki bilgilere tek tek ulasabilmek icin
        // value u - ile split edelim

        String[] ogrenciValueArr = istenenOgrenciValue.split("-"); // [Ali,Can,11,H,MF]

        System.out.println(ogrenciNo + " nolu ogrenci ismi ve soyismi : " +
                ogrenciValueArr[0] + " " + ogrenciValueArr[1]);

    }

    public static void noIleSinifveSubeYazdir(int ogrenciNo) {

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo);

        String[] ogrenciValueArr = istenenOgrenciValue.split("-");

        System.out.println(ogrenciNo + " numarali ögrencinin sinif ve subesi " +
                ogrenciValueArr[2] + " " + ogrenciValueArr[3]);


    }

    public static void sinifVeSubeIleListeOlusturma(Integer sinif, String sube) {
        //Tum ogrencilerin valuelerini gozden gecirmemiz
        //ve sinif ve subesi istenen degerde olan ogrencilerin
        //istenen bilgilerini yazdirin

        //1-Tum ogrencilerin numaralari icin
        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        //2-her bir ogrenci key i icin valulere ulasmak ve
        //istenen islemleri yapmak icin for-each loop kullanlaim (Set index desteklemez)

        for (Integer eachkKey : ogrenciKeySet) {
            //3-EachJKey tek tek tum keyleri getirecek
            //  each key in getirdigi key e ait value u kaydedelim

            String istenenOgrenciValue = ogrenciMap.get(eachkKey);

            //4-Ogrenci value sunu - ile split edeliö
            String[] ogrenciValueArr = istenenOgrenciValue.split("-");

            //5-Array'den gorevde istenen bilgileri elde edebiliriz

            if ((ogrenciValueArr[2].equals(sinif + "")) && (ogrenciValueArr[3].equalsIgnoreCase(sube))) {
                System.out.println(eachkKey + " " + ogrenciValueArr[0] + " " + ogrenciValueArr[1]);
            }
        }
    }

    public static void isimVeSoyisimleOgrenciBulma(String isim, String soyisim) {

        Set<Integer> ogrenciKey = ogrenciMap.keySet();

        for (Integer eachKey : ogrenciKey) {

            String istenenOgrenciValue = ogrenciMap.get(eachKey);

            String[] ogrenciValueArr = istenenOgrenciValue.split("-");

            if (ogrenciValueArr[0].equalsIgnoreCase(isim) && ogrenciValueArr[1].equalsIgnoreCase(soyisim)) {
                System.out.println(eachKey + " " + ogrenciValueArr[2] + "/" + ogrenciValueArr[3]);
            }


        }
    }

    public static void numaraAraligindakiOgrenciBilgileriniYazdir(int minNo, int maxNo) {
         /*
         1- Ogrenci numarasi olarak verilen min ve max (sinirlar dahil) numaralar
           arasindaki tum ogrencilerin numara, isim, soyisim, sinif ve subelerini yazdirin
         */

        Set<Integer> keySeti = ogrenciMap.keySet();//[101,102,......107]

        //verilen numara araligindaki ogrenciNo lari bulmak icin
        //for-each loop ile tum numaralari gözden gecirip aralikta mi diye kontrol ederiz

        for (Integer eachKey : keySeti) {
            if (eachKey >= minNo && eachKey <= maxNo) {
                //eger bir key icin burasi calisiyorsa
                //eachKey istenen aralikta demektir

                //1-Bu keye ait value kaydedelim
                String ogrenciValue = ogrenciMap.get(eachKey);

                //2-Value Split edip bilgilere direk ulacabilecek hale getirelim
                String[] ogrenciValueArr = ogrenciValue.split("-");

                //3-Artik istenen bilgileri yazdirabiliriz

                System.out.println(eachKey + " " + ogrenciValueArr[0] + " " + ogrenciValueArr[1]
                        + " " + ogrenciValueArr[2] + " " + ogrenciValueArr[3]);

            }
        }
    }

    public static void bolumdekiOgrencilerinListesiniYazdir(String bolum) {
        /*
         2- verilen bolumdeki tum ogrencilerin
           isim soyisim sinif ve subelerini yazdirin
         */

        //once tum ogrencilere ulasabilmek icin keySetini alip kaydedelim
        Set<Integer> keySeti = ogrenciMap.keySet();


        //keyleri kullanarak tum ograncileri elden gecirmek icin for each loop kullanalim

        boolean bolumdeOgrenciYok = true;
        for (Integer eachKey : keySeti) {

            String ogrenciValue = ogrenciMap.get(eachKey);

            String[] ogrenciValueArr = ogrenciValue.split("-");

            if (ogrenciValueArr[4].equalsIgnoreCase(bolum)) {
                System.out.println(ogrenciValueArr[0] + " " + ogrenciValueArr[1] + " " + ogrenciValueArr[2] + " " + ogrenciValueArr[3]);
                //istenen bolumde ogrenci oldugundan flagi degistirdim
                bolumdeOgrenciYok = false;
            }
        }
        if (bolumdeOgrenciYok) {
            System.out.println("Girdiginiz Bolum Hatali");
        }

    }
}
