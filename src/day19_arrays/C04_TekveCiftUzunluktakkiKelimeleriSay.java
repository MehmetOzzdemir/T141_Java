package day19_arrays;

public class C04_TekveCiftUzunluktakkiKelimeleriSay {
    public static void main(String[] args) {

        //Verilen bir String array'deki
        //her bir kelimeyi kontrol edip
        //Array'de kac tane tek sayi uzunlugunda
        //kac tane Cift sayi uzunlugunda kelime bulundugunu yazdiran bir meethod olusturun

        String [] arr = {"Ali","Veli","Selami","Ayse","Ahmet"};
        kelimeSayilariniYazdir(arr);
    }

    public static void kelimeSayilariniYazdir(String [] arr){
        int tek=0;
        int cift=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()%2==0){
                cift++;
            }else {
                tek++;
            }
        }
        System.out.println(cift+" adet cift uzunlugunda kelime vardır");
        System.out.println(tek+" adet tek uzunlugunda kelime vardır");
    }
}
