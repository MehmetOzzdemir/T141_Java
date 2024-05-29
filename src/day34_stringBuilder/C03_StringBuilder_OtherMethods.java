package day34_stringBuilder;

public class C03_StringBuilder_OtherMethods {
    public static void main(String[] args) {
        /*
        Bize StringBuilder dondurmeyen methodlar
        StringBuilder'da kalici degisiklik yapmaz
         */
        StringBuilder sb = new StringBuilder("Java Candir");
        System.out.println(sb.indexOf("a")); // 1
        System.out.println(sb); // Java Candir

        System.out.println(sb.substring(2, 4)); // va
        System.out.println(sb); // Java Candir

        System.out.println(sb.charAt(0)); // J
        System.out.println(sb); // Java Candir

        System.out.println(sb.insert(2, "ali")); //Jaaliva Candir
        System.out.println(sb); //Jaaliva Candir

        //Eger StringBuilder da olmayan fakat String 'de olan bir methodu kullanmak isterseniz
        // önce toString() ile StringBuider'i String'e cevirip sonra String methodlarinin kullanabiriz
        //Bu yontem ile yapilan degisiklikler KAVICI OLMAZ



        // sb Can icerir mi ?
        System.out.println(sb.toString().contains("Can")); // true

        // sb Java ile mi Basliyor?
        System.out.println(sb.toString().startsWith("Java")); // false

        //sb'yi buyuk harfe cevirin
        //sb = sb.toString().toUpperCase();

        sb = new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb); // JAALİVA CANDİR
    }
}
