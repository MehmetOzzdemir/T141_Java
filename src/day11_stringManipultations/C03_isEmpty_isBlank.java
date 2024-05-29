package day11_stringManipultations;

public class C03_isEmpty_isBlank {
    public static void main(String[] args) {
        String str ="";
        System.out.println(str.length());// 0
        System.out.println(str.isEmpty());// true
        System.out.println(str.isBlank());// true
        System.out.println("*****************");
        String str2 = " ";
        System.out.println(str2.length());//1
        System.out.println(str2.isBlank());//true
        System.out.println(str2.isEmpty());//false
        System.out.println("*****************");

        String str3 = "             ";
        System.out.println(str3.length());//13
        System.out.println(str3.isBlank());//true
        System.out.println(str3.isEmpty());//false
        System.out.println("*****************");
    }
}
