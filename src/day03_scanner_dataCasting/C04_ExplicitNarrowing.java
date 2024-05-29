package day03_scanner_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 130;
        int num3 = 140;
        int num4 = 250;
        int num5 = 520;
        int num6 = 780;
        double dbl = 24.5;

        int num = (int) dbl;
        System.out.println("24.5 i Integer'a cast edersek "+num);

        byte byt = (byte) num1;
        System.out.println("20'i Byte cast edersek "+byt);
        byt=(byte) num2;
        System.out.println("130'u Byte cast edersek "+byt);
        byt=(byte) num3;
        System.out.println("140'u Byte cast edersek "+byt);
        byt=(byte) num4;
        System.out.println("250'i Byte cast edersek "+byt);
        byt=(byte) num5;
        System.out.println("520'i Byte cast edersek "+byt);
        byt=(byte) num6;
        System.out.println("780'i Byte cast edersek "+byt);

    }
}
