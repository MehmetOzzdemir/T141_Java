package day09_switchStatements_stringManipulations;

public class C06_equals_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = "Java";
        String str5 = "JAVA ";
        //equals() Stringlerin metin olarak eşit olup olmadıklarını kontrol eder
        //String'de büyük harf ve küçük harf birbirinden farklı karakterler olduğundan
        //

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str4));
        System.out.println(str1.equals(str5));
        System.out.println(str3.equals(str5));

        //Eğer büyük küçük harf önemsiz ise
        //Amacımız sadece metin olarak aynı olup olmadığına bakmak ise
        //equalsIgnoreCase()

        System.out.println("************************");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println(str1.equalsIgnoreCase(str5));
        System.out.println(str3.equalsIgnoreCase(str5));


        //Java da metin ifadelerin karşılatırılması için == kullanılmaz
        //bunun yerine equals() veya equalsIgnoreCase() kullanılmalıdır


        //Çünkü equals sadece metne odaklanırkem
        //== hem metne hem de referansa odaklanır
        //== kullandığımızda aynı metinlerin bazıları true verirken bazıları false vewrir

        String s = "java";
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "ja" + "va";
        String a = "ja";
        String b = "va";
        String s5 = a+b;

        System.out.println("******************");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals("java"));

        System.out.println("******************");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1=="java");


    }
}
