package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_FibonacciSerisi {
    public static void main(String[] args) {
        //Verile pozitif bir n tamsayisini alarak
        //bize ilk n tane Fibonacci sayisini
        //bir list olarak donduren bir method olusturun
        // Fibonacci Serisi 0 1 1 2 3 5 8 13 21 34 55 89 144 233

        System.out.println(fibonacciSerisiOlustur(-5));
        System.out.println(fibonacciSerisiOlustur(0));//[]
        System.out.println(fibonacciSerisiOlustur(1));//[0]
        System.out.println(fibonacciSerisiOlustur(2));//[0, 1]
        System.out.println(fibonacciSerisiOlustur(5));//[0, 1, 1, 2, 3]
        System.out.println(fibonacciSerisiOlustur(15));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]
        System.out.println(fibonacciSerisiOlustur(25));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368]
    }


    public static List<Integer> fibonacciSerisiOlustur(int sayiAdedi) {


        List<Integer> fibonacciSerisi = new ArrayList<>();
        if (sayiAdedi <= 0) {
            System.out.println("Sayi Adedi Sifirdan Büyük Olmalidir");
        } else if (sayiAdedi == 1) {
            fibonacciSerisi.add(0);
        } else if (sayiAdedi == 2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        } else {  //ornegin 5 girilsin
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
            for (int i = 2; i < sayiAdedi; i++) {
                fibonacciSerisi.add(fibonacciSerisi.get(i - 2) + fibonacciSerisi.get(i - 1));
            }


        }


        return fibonacciSerisi;
    }
}
