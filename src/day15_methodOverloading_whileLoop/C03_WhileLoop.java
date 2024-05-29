package day15_methodOverloading_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // 1 de n 10 a kadar olan sayilari
        // aralarinda bir bosluk bırakarak yanyana yazdirin

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //ayni soruyu while loop ile yapin
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }


    }
}
