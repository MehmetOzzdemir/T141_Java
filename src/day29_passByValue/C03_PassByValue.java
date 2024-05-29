package day29_passByValue;

public class C03_PassByValue {

    static int num = 50;

    public static void main(String[] args) {

        int num = 10;

        //int num = 20; //varianle 'num' is already defined is the scope

        //boolean num = 20; //varianle 'num' is already defined is the scope

        num = 30;
        System.out.println(num);
    }


    public static void method1() {

        int num = 40;
        System.out.println(num); // 40
    }

    public static void method2(int s) {
        System.out.println(num);// 50
    }
}
