package day04_wrapperClassAndMathatematic;

public class C03_WrapperClasses {
    public static void main(String[] args) {
        int num = 20;
        String str = "I love Java ";


        System.out.println(str.toUpperCase());


        /*
        Wrapper classları oluşturmuştur
        Wrapper classlar primitive ile aynı isimlere sahiptir
        ancak non-primitive oldukları için class isimleri büük harfle başlar
        Boolean,Character,Byte,Integer,Double,Long,Float,Short
         */
        char ch1 = 'a';
        Character ch2 = 'b';

        System.out.println(ch2.charValue());//b

        System.out.println(Character.isLowerCase(ch1));//true
        System.out.println(Character.isDigit(ch1));//false
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

    }
}
