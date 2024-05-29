package day16_whileLoop_doWhileLoop;

public class C01_StringTerseCevirme {
    public static void main(String[] args) {
        System.out.println(metniTerseCevir("Ali Topu Tut"));
        System.out.println(metniTerseCevir("Java calismak guzel"));
    }


    public static String metniTerseCevir(String metin){
        int index =metin.length()-1;
        String reverse = "";
        while (index>=0){
            reverse+=metin.charAt(index);
            index--;
        }
        return reverse;
    }
}
