package day14_methodOlusturmaVeKullanma;

public class C01_Return {
    public static void main(String[] args) {

        /*
        Her method bir is yapmak icin olusturulur
        Biz methodlarin yaptiklari islem sonucunda
        bize ne döndürdüklerine bakariz

        Methodlarin islem sonucu,verilen parametrelere gore degisecegi icin
        return kelimesi daha cok

         */

        String str = "Java kolaydir";

        System.out.println(str.substring(3));//a kolaydir
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.indexOf("x"));

        System.out.println(str.contains("Java"));//true

        str.substring(7);//bu bir sey
        //substring methodu bize String döndürür
        //28.satirdaki kod calisir ve bize "laydir" return eder
        //ancak dönen "laydir" i biz hiçbir islem yapmadigimiz icin goremeyiz

        //bize sonuc return eden bir method kullandigimizda,
        //sonucu kullanmak icin 2 alternatifimiz vardir

        //1 direk yazdirip konsolda sonucu gorebiliriz
        System.out.println(str.substring(7));//laydir
        //2-gorevde yazdirmamiz istenmiyorsa
        //  ileride kullanmak üzere bir variable a kaydedebiliriz.

        String strinIlkYarisi=str.substring(0,str.length()/2);
        System.out.println(strinIlkYarisi);

    }

}
