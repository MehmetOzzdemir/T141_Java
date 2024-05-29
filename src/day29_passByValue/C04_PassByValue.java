package day29_passByValue;

public class C04_PassByValue {
    public static void main(String[] args) {
        int num = 30;

        method1(num);
        System.out.println("Method call'dan sonra main method'da sayi : " + num);//30
    }


    public static void method1(int num) {
        num = 3 * num;
        System.out.println("Method'da sayinin degeri : " + num);//90
    }
}
