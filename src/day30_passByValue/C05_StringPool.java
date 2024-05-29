package day30_passByValue;

public class C05_StringPool {
    public static void main(String[] args) {
        /*
        equals methodu sadece metne odaklanir
        metin ayni ise true metinde farklilik varsa false verir

        == ise hem metne hem referansa bakar
            referans farkli ise metin ayni olsa da false verir.
         */
        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String str5 = "A";
        String str6 = "li";
        String str7 = str5 + str6;
        String str8 = "a";
        String str9 = str8.toUpperCase().concat(str6);

        System.out.println(str2.equals(str1)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str7)); // true
        System.out.println(str1.equals(str9)); // true
        System.out.println(str1.equals("Ali")); // true

        System.out.println("--------------------");

        System.out.println(str1 == str2);   // true
        System.out.println(str1 == str3);   // false
        System.out.println(str1 == str4);   // true
        System.out.println(str1 == str7);   // false
        System.out.println(str1 == str9);   // false
        System.out.println(str1 == "Ali");  // true

    }
}
