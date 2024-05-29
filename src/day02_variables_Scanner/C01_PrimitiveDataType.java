package day02_variables_Scanner;

public class C01_PrimitiveDataType {
    public static void main(String[] args) {
        char chr1 = 'a';
        char chr2 = ' ';
        //char chr3 = 'a '; char birden fazla karakter alamaz

        byte byt = 10; //Hafızada 8 bit yer kaplıyor
        short sh = 10; //Hafızada 16 bit yer kaplıyor
        int sayi1 = 10 ; //Hafızada 32 bit yer kaplıyor
        long lng = 10; //Hafızada 64 bit yer kaplıyor

        int sayi2 = 0; //Hafızada 32 bit yer kaplıyor
        int sayi3 = 100; //Hafızada 32 bit yer kaplıyor
        int sayi4 = 100000; //Hafızada 32 bit yer kaplıyor
        int sayi5 = 1000000000; //Hafızada 32 bit yer kaplıyor

        float flt = 23412343313f;
        float flt1 = 234F;
        float flt3= 23.678f;
        double db1 = 1.123123213131;

        String str = "Java Candır";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        int not=10;
        int Not=20;

        System.out.println(Not);

        /*
        1- boolean == true-false
        2- char ==tek bir karakter 'a' tek tırnak kullanılır
        3-4-5-6 byte,short,int,long == tamsayı bildirir
        7-8 float,double  == ondalıklı sayı bildirir
         */


        //Primitive data türleri sadece değer bildirir
        //Non-Primitive data türleri ise değer ve hazır methodlar alır


    }
}
