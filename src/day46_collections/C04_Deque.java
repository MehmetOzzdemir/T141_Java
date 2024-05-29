package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    //Deque double ended queue demektir
    //yani bastan ve sondan calisabilir
    //deque queue nin childi oldugundan
    //deque i implement eden class
    //deque in parenti olan queue deki tum methodlari da implement etmek zorundadir
    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();

        numbers.add(20);
        numbers.add(23);
        numbers.add(34);

        System.out.println(numbers); //[20,23,34]

        numbers.addFirst(10);
        numbers.addLast(40);

        System.out.println(numbers); //[10,20,,23,34,40]

        numbers.remove();// en bastakini siler(queue'dan)
        System.out.println(numbers); //[20, 23, 34, 40]

        numbers.removeFirst(); // en bastakini siler (deque den)
        System.out.println(numbers); // [23,34,40]

        numbers.removeFirstOccurrence(34);
        //ilk sayiyi degil ilk buldugu 34 ü siler

        System.out.println(numbers); //[23,40]

        System.out.println(numbers.getLast()); // 40
        System.out.println(numbers.getFirst()); // 23

        numbers.pop();
        //remove and returns the first element of this deque
        //ilk elementi siler ve bize getirir
        //deque bos ise exception firlatir

        System.out.println(numbers);// [40]

        numbers.push(25);
        //Eger kapasite sinirlamasi yoksa verilen obje deque e uygunsa
        // verilen elementi deque e ekler
        System.out.println(numbers); // [25,40]

    }
}
