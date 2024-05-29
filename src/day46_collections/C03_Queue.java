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

        System.out.println(numbers);//[9,2,5,7,10]

        System.out.println(numbers.poll());//9
        //Retrieves and removes the head of this queue, or returns null if this queue is empty
        //queue nun basindaki elementi siler ve bize dondururi eger queue bossa null dondurur

        System.out.println(numbers);//[2,5,7,10]


        Queue<Integer> bosQueue = new LinkedList<>();
        System.out.println(bosQueue.poll());// null


        System.out.println(numbers.element());//2
        //Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        // Queue nun ilk elementini silmeden bize getirir
        //bos bir Queue da calistirilirsa ezception firlatir
        System.out.println(numbers);//[2,5,7,10]

        //System.out.println(bosQueue.element());//NoSuchElementException

        System.out.println(numbers.peek()); // 2
        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        // queue'nun ilk elementini silmeden bize getirir bos bir queue da calistirilirsa null getirir

        System.out.println(bosQueue.peek());



    }
}
