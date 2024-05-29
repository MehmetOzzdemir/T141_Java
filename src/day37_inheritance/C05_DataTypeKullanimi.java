package day37_inheritance;

import day36_encapsulation_inheritance.C07_Car;
import day36_encapsulation_inheritance.C08_Toyota;
import day36_encapsulation_inheritance.C09_Corolla;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C05_DataTypeKullanimi {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesir ";
        //buradaki String
        //Java'nin olusturdugu bir classdir
        //ayni zamanda str variable'inin data turudur

        C09_Corolla corolla = new C09_Corolla();
        //buradaki C09_Corolla
        //bizi olusturdugumuz bir classdir
        //ayni zamanda str objesinin date turudur

        //non-Primitive data turleri bir class'dan olusturulab objelerdir
        //ve olusturduklari classlarda var olan ozellikleri(variable,method) tasirlar


        List<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        Integer number = 10;
        // String s=(String)number;
        Object obj = number; // Object =Integer

        String s = "Java";
        obj = s; //Object=String


        //non-primitve data turllerinde aralarinda parent-child iliskisi olan classlarda
        //parent classa child class atanabilir

        C09_Corolla corolla1 = new C09_Corolla();
        C08_Toyota corolla2 = new C09_Corolla();
        C07_Car corolla3 = new C09_Corolla();

        //Bir objenin data turu olarak
        //kendi class ve / veya parent classlari cesilebilir
    }
}
