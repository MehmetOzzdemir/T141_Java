package day29_passByValue;

public class C01_StaticBlocks {


    /*
    Static blocklar tüm methodlardan ve kod bloglarından önce calisir
    (main method'dan bile once calisir.)

    class calismamya baslamadan yapilmasi gereken
    herhangi bir islem varsa
    static block'lar kullanilir

    Eger birden fazla static nlock varsa
    kendi iclerinde ustteki blok daha once calisir
     */
    C01_StaticBlocks() {
        System.out.println("Constructor Ran");
    }

    public static void main(String[] args) {

        System.out.println("Main Method Ran");

        C01_StaticBlocks obj = new C01_StaticBlocks();


    }

    public static void method1() {
        System.out.println("Method1 Ran");
    }

    static {
        System.out.println("Static blog Ran");
    }
}
