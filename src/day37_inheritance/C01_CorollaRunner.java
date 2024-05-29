package day37_inheritance;

import day36_encapsulation_inheritance.C09_Corolla;

public class C01_CorollaRunner {
    public static void main(String[] args) {

        C09_Corolla corolla = new C09_Corolla();
        System.out.println(corolla.year);


        /*
        Bir class'dan obje olusturdugumuzda
        sadece o classdaki ozelliklere degil
        o class'in parentlarinda olan ozellikleri de sahip oluruz

        bu ornegi dusunursek
        biz sadece C09_Corolla() corolla constructor'ini calistirdik

        extends keyword kullanan bir class'da buluna
        HER CONSTRUCTOR once parent classdaki
        constructor'in calismasini saglayacak sekide
        ozel bir mekanizmaua sahiptir.
         */
    }
}
