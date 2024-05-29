package day35_accessModifier;

public class C02_Depo {
    private int privateNumber;
    private static String privateStr;

    int defaultNumber;
    static String defaultStr;

    protected int protectedNumber;
    protected static String protectedStr;


    public int publicNumber;
    public static String publicStr;


    public static void main(String[] args) {
        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
        System.out.println(publicStr);


    }

    public static void method1() {
        /*
        method1 static oldugu icin access modifier yaninda
        static keyword'a de dikkat etmemiz gerekir
         */

        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
        System.out.println(publicStr);
    }

    public void method2() {
        System.out.println(privateNumber);
        System.out.println(privateStr);
        System.out.println(protectedNumber);
        System.out.println(protectedStr);
        System.out.println(defaultNumber);
        System.out.println(defaultStr);
        System.out.println(publicNumber);
        System.out.println(publicStr);

    }
}
