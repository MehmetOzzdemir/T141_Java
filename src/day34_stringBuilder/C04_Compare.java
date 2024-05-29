package day34_stringBuilder;

public class C04_Compare {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ulvi");
        StringBuilder sb2 = new StringBuilder("Ulvi");
        String str = "Ulvi";

        // ==

        System.out.println(sb1 == sb2); // false
        //System.out.println(str==sb2); // farkli data turundeki non-*primitive'let icin == KULLANİLAMAZ


        //equals

        System.out.println(sb1.equals(sb2)); // false Metin ayni da olsa FALSE verir
        System.out.println(str.equals(sb1)); // false , Java CTE vermez ama Sonuc hep False olur

        System.out.println(sb1.equals(sb1)); // true

        StringBuilder sb3 = sb1;
        System.out.println(sb1.equals(sb3)); // true


        // StringBuilder da metinleri karsilastirmak icin compare() kullanilir
        //compareTo() 0 donduruse metinler ayni
        // 0'in disindaki tum degerler icin metinler farklidir
        //compareTo() iki Sb'i ilk index'ten baslayarak harf harf karsilastirir
        // Eger tum indexler'deki karakterler ayni ise sonuc olarak 0 doner
        // Eger herhangi bir index'de farkli karakter bulursa ,
        // bu karakterin ASCII kodlari arasindaki farki dondurur ve islemi sonlandirir

        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("Tava");
        StringBuilder s3 = new StringBuilder("Javaa");
        StringBuilder s4 = new StringBuilder("Java");
        StringBuilder s5 = new StringBuilder("Jaka");
        System.out.println();
        System.out.println(s1.compareTo(s2)); // -10
        System.out.println(s1.compareTo(s3)); // -1
        System.out.println(s1.compareTo(s4)); // 0
        System.out.println(s1.compareTo(s5)); // 11


    }
}
