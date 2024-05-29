package day32_dateTime_Varargs;

public class C03_Varargs {
    public static void main(String[] args) {

        /*
            Eger bir method 'da ayni cinsten istendigi kadar parametre kabul etmesini istiyorsak
            parametere olarak varargs (variety of arguments ) kullaniriz
            //varargs sadece parametre
         */
        sum(3, 5);
        sum(3, 5, 7);
        sum(3, 5, 7, 2);
        sum(5);
        sum(4, 5, 5, 5, 4, 4, 8, 9, 1);
    }

    public static void sum(int... numbers) {
        int sum =0;
        for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b);
    }

}
