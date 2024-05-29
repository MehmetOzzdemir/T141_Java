package day04_wrapperClassAndMathatematic;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String valueStr1 = "23";
        String valueStr2 = "45";
        System.out.println(valueStr1 + valueStr2);//2345
        /*
        Toplamayı yapabilmek için String olarak verilen değerleri
        Integer'a Çevirmeliyiz
         */

        System.out.println(Integer.parseInt(valueStr1) + Integer.parseInt(valueStr2));


        String valueStr3 = "23.56";
        String valueStr4 = "45.21";

        System.out.println(Double.parseDouble(valueStr3)+Double.parseDouble(valueStr4));
    }
}
