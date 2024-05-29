package day05_concatenation_mantiksalKarsilatirmalar;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Candır";


        System.out.println(str1 + str2);//JavaCandır

        /*
        String ifadeleri barındırdığından
        matematiksel işlemler KULLANILAMAZ

         System.out.println(str1*str2);
          System.out.println(str1/str2);
           System.out.println(str1-str2);
         JAVA'DA METİNSEL İFADLER SADEE + İŞLEMİNE TABİİ TUTULABİLİR
         + ile yazılan metinler , yan yana birleştirilir
         */

        System.out.println(str1 + " " + str2);//Java Candır

        System.out.println(str1 + 5);//Java5
        System.out.println(str1 + 5 + 6);//Java56
    }
}
