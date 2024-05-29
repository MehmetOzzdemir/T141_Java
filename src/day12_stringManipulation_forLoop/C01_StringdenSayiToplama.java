package day12_stringManipulation_forLoop;

public class C01_StringdenSayiToplama {
    public static void main(String[] args) {

        String fiyatStr1 = "15,30 €";
        String fiyatStr2 = "13,45 €";

        System.out.println(fiyatStr1 + fiyatStr2);
        fiyatStr1 = fiyatStr1.replaceAll("\\D", "");
        fiyatStr2 = fiyatStr2.replaceAll("\\D", "");

        System.out.println(fiyatStr1 + fiyatStr2);
        System.out.println("Verilen fiyatların Toplamı : "+(Double.parseDouble(fiyatStr1)+Double.parseDouble(fiyatStr2))/100+" €");

    }
}
