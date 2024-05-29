package day46_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        //data turu olarak 3 interface i implement eden
        // LinkedList sectigimiz icin
        //List Queue ve Deque interface'lerinde olan tum methodlari implement etmistir

        System.out.println(names.hashCode()); // 1

        names.add("java");
        System.out.println(names.hashCode()); // 3254849

        names.add("candir");
        System.out.println(names.hashCode());// -1266823012


    }
}
