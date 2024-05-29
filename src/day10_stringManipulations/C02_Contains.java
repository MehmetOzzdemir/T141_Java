package day10_stringManipulations;

public class C02_Contains {
    public static void main(String[] args) {
        String str = "Ali topu at, at Ali at";

        System.out.println(str.contains("Ali"));//true
        System.out.println(str.contains("at"));//true
        System.out.println(str.contains("ali"));//false
        System.out.println(str.contains("topu Ali"));//false
        System.out.println(str.contains("topu at"));//true
        System.out.println(str.contains("u a"));//true
        System.out.println(str.toLowerCase().contains("ali"));//true




    }
}
