package day11_stringManipultations;

public class C06_ReplaceAll {
    public static void main(String[] args) {
        //Verilen Stringdeki tüm ozel karakterleri
        //sayilari ve yanyana birden fazla ola spaceleri temizleyin
        //ornek input :J18a6%v*a      C*7an@990dir
        // output : Java Candir

        String input = "J18a6%v*a      C*7____an@990dir";
        //birden fazla olan spaceleri tek space 'a indirir

        input=input.replaceAll("\\s+"," ");

        //tüm sayiları yok edelim
        input=input.replaceAll("\\d","");

        //Space i koruma altına almak için
        //space yerine hic kullanilmayan bir karakter atayın

        input=input.replaceAll("\\s","5");



        //Tüm Özel karakterleri de yok edelim
        //dediğimizde space de gidiyor
        input=input.replaceAll("\\W","");//harfler rakamlar ve altçizggi dışındaki her şey


        //w alt cizgiyi kapsamadığından _ i özel olarak yok etmeliyiz
        input=input.replaceAll("_","");


        //Space yerine atadigimiz 5'i eski yerine degistirelim
        input=input.replaceAll("5"," ");

        System.out.println(input);

        //"Java" lari da yazdirin

        System.out.println("\"Java\"");//"Java"
        System.out.println(input.repeat(5));
        System.out.println(input.trim());
    }
}
