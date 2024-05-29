package day17_scope;

public class C03_ClassLevelVariables {


    /*
     * Eger tüm methodlarda kullanabilecegimiz variable'lara ihtiyacimiz olursa
     * bu variable'lari class level'da olustururuz
     *
     * class level demek,cllassin icinde ancak tum kod bloklarinin disinda demektir.
     * genel olarak class level variable'lar class'in en ust kisminda olusturulur.
     * <p>
     * 1 -  class level variable'larin scope'u BUTUN CLASS'Dir
     * ancak class level variable'larin method icerisinde direk kullanilip
     * kullanilamamasi static Keyword'una da baglidirr.
     * <p>
     * 2 -  Variable static olarak isaretlenmisse class icerisinde
     * her yerde direk kullanilabilir ama variable static degilse
     * static methodlarda kullanilamaz.
     * <p>
     * 3 -  Static keyword'u methodlar icinde kuıllanilabilir
     * Static Methodlar bunyelerine
     * Static olmayan variable ve methodlari kabul etmezler.
     *
     * 4 -  Class level variable'lar deger atanmadan olusturulabilir ve kullanilabilir
     *      Eger biz deger atamadan variable kullanilirsa
     *      Java Variable'a DEFAULT DEGER atamasi yapar
     *
     *      boolean ==> false
     *      char ==> (hiclik)
     *      byte,short,int,long,float,double ==>0
     *      non-primitive ==>null
     *
     */

    int num1;
    int num2 = 20;


    static String str1;
    static String str2 = "Java";


    public static void main(String[] args) {
        //System.out.println(num1);
        //System.out.println(num2);
        System.out.println(str1);
        System.out.println(str2);
        method1();
        //method2();


    }

    public static void method1() {
        //System.out.println(num1);
        //System.out.println(num2);
        System.out.println(str1);
        System.out.println(str2);
        //method2();
    }

    public void method2() {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str1);
        System.out.println(str2);
        method2();
        method1();
    }
}
