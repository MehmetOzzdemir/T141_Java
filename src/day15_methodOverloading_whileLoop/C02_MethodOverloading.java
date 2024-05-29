package day15_methodOverloading_whileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        /*
        Bir class ta overloading varsa
        o method cagırildıgında java hangi methodun calisacagını
        asagıdaki 3 adımla karar verir

        1-signiture'i %100 ayni olan method varsa onu calistirir
        2.Signiture 'i aynı olan method yoksa
        Java Casting yaparak kullanabilecegi method arar
         */


        Sum('a','b');//toplama char char ==> iki integer'in toplami 195
       // Sum("Ali",5);//CTE ==>"ali" argumentinin methodlardan hicbiri parametre olarak kabul etmez

        Sum(3.4F,6);//toplama float int ==>En az casting le calistirabilecegini devreye alir

        Sum (2.3F,3.1F);//toplama float float ==> Double double toplami

    }

    public static void Sum(int a, int b) {
        System.out.println("İki Integer'in Toplami : " + (a + b));
    }

    public static void Sum(double a, int b) {
        System.out.println("Double ve Integer'in Toplami : " + (a + b));
    }

    public static void Sum(double a, double b) {
        System.out.println("İki Double'in Toplami : " + (a + b));
    }


}

