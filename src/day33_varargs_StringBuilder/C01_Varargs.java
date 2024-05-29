package day33_varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        //verilen farklı adetteki sayilarin
        //sonuncusu haric geriye kalanlari toplayip
        //son sayi ile toplami carpip sonucu yazdiran bir method olusturun

        varargs(3, 53, 3, 32, 3, 1, 2, 3, 4, 5);
        varargs(2);
        varargs(2, 3, 4);
        varargs(2, 4, 5, 6, 7);
        varargs(0, 25, 5, 5, 5, 5);

    }

    public static void varargs(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        System.out.println(sum + numbers[numbers.length - 1]);
    }
    /*
    Varargs 'in kapasite sinirlamasi yoktur
    Verilen her sayiyi almak isteyecektyir
    Eger parametre olarak yazilan varargs'dan sonra baska bir parametre yazarsaniz
    varargs kendinden sonraki parametreye HİC BİR ELEMENT birakmaz
    bu durumda method calismöaz


    KURAL 1 - Varargs her zaman son parametre olarak yazilmalidir
    KURAL 2 - Kural 1 den dolayi bir method'da birden fazla VARARGS OLMAZ
     */
}
