package day45_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_listIterator {

    /*
        List Iterator ile ilgili dikkat edilecekler

        1-Lit her lit.next(); gordugunda
        iterator i bir saga goturur
        islem hatasi yapmamak icin bir while loop icerisinde
        sadece 1 kez lit.next(); kullanilimalidir

                2- iterator biz soylemedikce hareket etmez,
           biz nerede birakirsak orada bizi bekler

           biz bir isleme baslamadan once
           iterator'in yerini belirlemeli,
           eger istedigimiz yerde degilse,
           istedigimiz yere gondermeliyiz


     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 5));
        System.out.println(liste);
        //index kullanmadan listedeki cift sayilari 2,
        //tek sayilari 1 artirin

        ListIterator lit = liste.listIterator();

        while (lit.hasNext()) {
            Integer number = (Integer) lit.next();

            if (number % 2 == 0) {
                lit.set(number + 2);
            } else {
                lit.set(number + 1);
            }

        }
        System.out.println(liste);

        //listenin yeni halinde
        //elementleri sondan basa dogru yazdirn
        //bu satir itibariyle lit en sonda
        // bu gorev icin lit dogru yerde

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println("\n" + liste);

        //Listeyi sondan basa dogru tekrar yazdirin
        //yukaridaki gorevlerden sonra
        //lit en basa geldi
        //bizim elementleri sondan basa yazdirabilmemiz icin
        //Lit'i yeniden en sona goturmeliyiz

        while (lit.hasNext()) {
            lit.next();
        }

        //yukaridaki while loop lit i en sona goturur

        while (lit.hasPrevious()) {
            System.out.print(lit.previous()+" ");
        }


    }
}
