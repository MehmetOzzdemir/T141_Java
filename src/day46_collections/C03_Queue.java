package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        //Queue(kuyruk) icin en onemli olan ozellik FIFO
        //tum ozellikler FIFO'ya goren duzenlenmistir
        //yan eklenenler sona eklenir cıkacaklar bastan cikar

        Queue<Integer> numbers = new LinkedList<>();

        numbers.add(3);
        numbers.add(9);
        numbers.add(2);

        System.out.println(numbers); //  [ 3, 9, 2 ]


        // 9 ile 2 nin arasina 5 ekleyin
        //Queue de araya ekleme yok

        //1. indexteki 9 u silin
        numbers.remove();
        //queue da FIFO oldugundan remove() dedigimizde en bastakini siler

        System.out.println(numbers); // [9,2]

        numbers.add(5);
        numbers.add(7);

        System.out.println(numbers);//[9,2,5,7]

        numbers.offer(10);
        //Eger sayilarda kapasite sinirlamasina uygunsa verilen sayiyi ekler
        //add() den farki : add() direk ekler, offer() eklemeyi teklif eder ,kapas,te uygunsa ekler.

        System.out.println(numbers);



    }
}
