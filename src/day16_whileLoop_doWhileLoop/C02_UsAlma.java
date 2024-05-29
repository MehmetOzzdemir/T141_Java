package day16_whileLoop_doWhileLoop;

public class C02_UsAlma {
    public static void main(String[] args) {

        usAl(3,4);
        usAl(2,5);
    }

    public static void usAl(int num, int us) {
        //2 üzeri 4 ü hesapla 2* 2 * 2* 2  16
        int result = 1;
        int hesaplanacak = us;
        while (hesaplanacak > 0) {
            result *= num;
            hesaplanacak--;
        }
        System.out.println(num + " uzeri " + us + " = " + result);
    }
}
