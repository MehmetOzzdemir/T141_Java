package day21_multiDimensionalArrays_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_ArrayList {
    public static void main(String[] args) {
        //Kullanicadan girmek istedigi kadar isim alip
        //girilen isimleri kaydedin
        //kullanici bitirmek icin a'ya basmalidir


        List<String> names = new ArrayList<>();

        ArrayList<String> deneme = new ArrayList<>();
        ArrayList<String> deneme1= new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        String name ="";
        while (!name.equalsIgnoreCase("q")){
            System.out.println("Please Write Names  For Add List:");
            System.out.println(" For Finish Write q");
            name = scan.nextLine();

            if (!name.equalsIgnoreCase("q")){
                names.add(name);
            }



        }

        System.out.println("Girilen isimler : "+ names);




    }
}
