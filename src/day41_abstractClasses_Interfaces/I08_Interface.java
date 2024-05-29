package day41_abstractClasses_Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I08_Interface {
    public static final int num = 10;
    public int A = 5;
    static int B = 13;
    final int C = 34;

    /*
    bir interface icinde olan tum variable lar
    public,static, final
    bu keyword ler yazilsa da yazilmasa da farketmez
     */
    int D = 23; // yazilmasa d ad variable i final static ve publictir.

    //private int e =24; // Modifier 'private' not allowed here

    //interface icinde tum variable'lar final olduklarindan
    //sonradan degeri degistirilemez
    // bundan dolayi deger atanmadan variable olusturulmasina izin verilmez
    //int e ;


    //static final variabe lar icin buyuk harf ile isim verilir

    public abstract void method1();

    public void method2();

    abstract void method3();

    //Interface de olusturulan methodlar public ve Abstract tir
    //yazsak da yazmasak da farketmez

    List<Integer> numbers = new ArrayList<>();

    //bir class sadece bir class a extends edebelir
    //ANCAK istedigi kadar interface'i IMPLEMENT edebilir
}
