package day12_stringManipulation_forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        //1'den 100'e kadar olan sayilari yazdirin
        //javada tekrar eden islemler icin looplar kullanılır


        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        //34 Den baslayip 3 er 3 er artirarak
        //100 haric sayilari yazdirin

        //34,37,40..

        System.out.println("******************");
        int j = 0;
        for (int i = 34; i < 100; i += 3) {
            j++;
            System.out.print(i + " ");
            if (j % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        // 2 bas sayilardan 7 ile bölünebilenleri yazin
        System.out.println("******************");
        j = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                j++;
            }
            if (j % 10 == 0 && i % 7 == 0) {
                System.out.println();
            }
        }
    }
}
