package day29_passByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(method1(num)); //40
        System.out.println(num); //20
    }


    public static int method1(int num) {
        num = 2 * num;
        return num;
    }
}
