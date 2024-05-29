package day09_switchStatements_stringManipulations;

public class C07_Substring {
    public static void main(String[] args) {
        String str = "java güzeldir hem de cok.";

        System.out.println(str.substring(2));//va güzeldir
        System.out.println(str.substring(0));//java güzeldir
        System.out.println(str.substring(str.length() - 1));//r
        System.out.println(str.length());//13,son index 12
        System.out.println(str.substring(str.length()));//""verir,boş satır yazdırır

        //System.out.println(str.substring(str.length()+1));
        //StringIndexOutOfBoundsException
        //length()-1 son index'deki harfi verir
        //length() son harften sonraki hiçliği yazdırır
        //length()+1 ve daha büyük sayılar StringIndexOutOfBoundsExceptions

        //System.out.println(str.substring(-3));//StringIndexOutOfBoundsException


        //son 3 harfi
        System.out.println(str.substring(str.length()-3));

    }
}
