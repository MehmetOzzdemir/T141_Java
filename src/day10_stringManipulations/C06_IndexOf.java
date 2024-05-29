package day10_stringManipulations;

import java.util.Scanner;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        //IndexOf methodu parametre olarak hem String hem Char kabul eder
        System.out.println(str.indexOf("t"));//4
        System.out.println(str.indexOf('t'));//4
        System.out.println(str.indexOf("Ali"));//0
        System.out.println(str.indexOf("pu at"));//6
        System.out.println(str.indexOf(' '));//3

        System.out.println(str.indexOf('t',7));
        // index ve sonrasındaki ilk t'nin indexini veri
        //"u at, at Ali at"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz : ");
        String metin = scan.nextLine();

        //Java gibi ders su gibi akiyor.....:)

        int ilkIndex = metin.indexOf('a');//
        System.out.println(metin.indexOf("a",ilkIndex+1));



    }
}
