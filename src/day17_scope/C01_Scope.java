package day17_scope;

public class C01_Scope {


    int a = 20;
    static String b;

    /*
    Scope
    variable ve methodlarin  nerelerden kullanilabileceğini
    v ebir kod blogu icerisinde hangi class uyelerinin kullanilabilecegini
    belirleyen kurallardir
     */

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);//10
        // System.out.println(str);
        // System.out.println(a);
        System.out.println(b);

        for (int i = 0; i <10 ; i++) {
            int c=20;
        }

        //System.out.println(i);
        //System.out.println(c);

    }


    public static void method1() {
        // System.out.println(num);
        String str = "Java super";
        //System.out.println(a);
        System.out.println(b);
    }

    public void method2() {
        //System.out.println(num);
        //System.out.println(str);
        System.out.println(a);
        System.out.println(b);
    }
}
