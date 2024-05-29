package day33_varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        method11("Ali"); // 3
        method11("Ilgar", "Ulvi", "Nuran"); //   7
        method11("a", "b", "c", "d", "e");  // 5


    }

    public static void method11(String s, String... t) {
        System.out.println(s.length() + t.length);
    }
}
