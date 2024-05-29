package day08_ternary_switchStatements;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //Verilen sayı için aşağıdaki 3 durumdan uygun olanı yazdırın
        //- sayı negatif
        //-sayı pozitif
        //-0 pozitif veya negatif değil

        /*
        ikiden fazla görevlerde Ternary Tercih edilmez
         */

        int num = 0;
        if (num > 0) {
            System.out.println("Number positive");
        } else if (num < 0) {
            System.out.println("Number negative");
        } else {
            System.out.println("Number Not negative and positive");
        }

        System.out.println(num>0 ? "Number Positive":num==0 ? "Number Not negative and positive":"Negative Number");



    }
}
