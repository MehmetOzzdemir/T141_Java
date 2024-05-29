package day09_switchStatements_stringManipulations;

import java.util.Locale;

public class C04_ToUpperCase_ToLowerCase {
    public static void main(String[] args) {

        String str = "Java Candir";
        //str'iBüyük harf olarak yazdırın
        System.out.println(str.toUpperCase());
        //Str'i küçük harf olarak yazdırın
        System.out.println(str.toLowerCase());

        //String'de variable'a atama yapılmadıkça
        //methodlarla yapılan değişikler kalıcı olamz
        System.out.println(str);


        //Eğer method ile yapılan değişiklern kalıcı olmasını isterseniz
        //variable'a yeni halini atamalısınız

        str = str.toUpperCase();
        System.out.println(str);


        //Eğer küçük harfle veya büyük harfle büyük harfle çevirirken
        //local bir alfabeye uygun olarak
        //çevirme yapmak isterseniz
        //Klavye TR ise geçerli
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));
    }
}
