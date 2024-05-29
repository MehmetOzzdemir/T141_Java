package day11_stringManipultations;

public class C04_NullPointer {
    public static void main(String[] args) {

        String str1;

        //System.out.println(str1);//variable str1 might not have been initialized

        //Main method içinde olusturulan bir String'2
        //deger atamadan kullanamazsiniz

        //sırf yazdirabilme icin "" atasak
        String str2 = "";
        System.out.println(str2);//bos bir satir yazdirir

        //Bu durumda yazdirabiliriz ama
        //Hiclik de olsa bu variable ' a bir deger atandigindan
        //Java bu variable'i bos olarak kabul etmez


        //Java deger atamadanda variable'lari kullanabilmemiz icin
        //Null Pointer'i olusturmustur.
        //Null Pointer bir deger degil isaretcidir.
        //str3'un bir degerinin olmadigini isaretler
        //ve str3'u yazdirmak istediginizde onun null olarak isaretlendigni
        //isaretler
        //yazdirmak disinda hicbir String methodu calistiramazsiniz
        //calistirmak isterseniz nullPointerException verir

        String str3 = null;
        System.out.println(str3);//null

        String str4 = "Java";
        System.out.println(str3 + str4);//nullJava

        //System.out.println(str3.length());//NullPointerException
        //System.out.println(str3.isEmpty());//NullPointerException

        str3 = "Seren";
        System.out.println(str3);//Seren
        System.out.println(str3.length());//5
        System.out.println(str3.isEmpty());//false




    }
}
