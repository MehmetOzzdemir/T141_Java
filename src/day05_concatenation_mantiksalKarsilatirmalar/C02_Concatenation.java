package day05_concatenation_mantiksalKarsilatirmalar;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candiry";
        String str3 = " ";
        String str4 = "";

        int a = 5;
        int b = 4;

        System.out.println(str1+str3+a+b);//Java 54
        System.out.println(a-b+str3+str1);//1 Java
        System.out.println(str1+str3+(a+b));//Java 9
        System.out.println(str2+(a*b));//Candir20
        System.out.println(str4+b+a+str1);//45Java
        System.out.println(b+(a+str1));//45Java (Alternative)


        //"45"i nasıl Integer'a çevirip 1 ekleyebiliriz
        String str = "45";
        System.out.println(Integer.parseInt(str)+1);

        //Integer olarak verilen bir sayıyı nasıl String'e çevirebiliriz
        String ab=""+59;
        System.out.println(ab);
    }
}
