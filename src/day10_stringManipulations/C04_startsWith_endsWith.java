package day10_stringManipulations;

public class C04_startsWith_endsWith {
    public static void main(String[] args) {

        String str = "Ali topu at, aat Ali at";
        System.out.println(str.contains("Ali"));
        System.out.println(str.contains("top"));
        System.out.println(str.contains("at"));

        System.out.println("********************");
        //str Ali ile mi bitiyor
        System.out.println(str.endsWith("Ali"));//false

        //str Ali ile mi başlıyor
        System.out.println(str.startsWith("Ali"));//true

        System.out.println(str.endsWith("A"));//true

        System.out.println(str.startsWith("Ali topu at"));//true
        System.out.println(str.startsWith("Ali topu at, aat Ali at"));//true
        System.out.println(str.endsWith("Ali topu at, aat Ali at"));//true
        System.out.println(str.startsWith(""));//true
        System.out.println(str.endsWith(""));//true
        System.out.println(str.startsWith("top"));//false

        System.out.println(str.startsWith("top", 4));//true
        //4. index ve sonrası top ile mi başlıyor
        //"topu at, at Ali at




    }
}
