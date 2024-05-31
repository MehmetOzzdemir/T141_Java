package day47_maps;

public class C05_IsimveSoyisimIleOgrenciBulma extends OgrenciMapClass{
    public static void main(String[] args) {
        mapeOgrenciEkle();;

        //verilen isim ve soyisimdeki tum ogrencilerin
        //numara ,sinif , sube bilgilerini yazdirin
        //Orn: input : Veli Cem  output :102 10 K

        isimVeSoyisimleOgrenciBulma("Ali","Cem");
        isimVeSoyisimleOgrenciBulma("Sevgi","Cem");
        isimVeSoyisimleOgrenciBulma("veli","cem");
        isimVeSoyisimleOgrenciBulma("mehmet","özdemir"); // bos satir

        //bu method'a aranan isim soyisime uygun kimse bulunamazsa
        // verilen isimde kimse yok yazdirsin



    }
}
