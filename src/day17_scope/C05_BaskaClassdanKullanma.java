package day17_scope;

public class C05_BaskaClassdanKullanma {
    public static void main(String[] args) {

        /*
            Methodlar ve Class Level Variable'lar
            baska classlardan da  kullanilabilir

            Static variable ve methodlara
            baska class'dan ulasmak icin
            classIsmi.ClassUyesiIsmi kullanilir
            bu sekilde kullanima static yontem denir


            Instance variable'lari baska class'dan kullanmak icin
            Instance variable'in oldugu class'dan Bir obje olusturulmalidir.

         */


        System.out.println(C04_StaticVariableVsInsranceVariables.majorDoctor);
        C04_StaticVariableVsInsranceVariables pers= new C04_StaticVariableVsInsranceVariables();
        System.out.println(pers.persAddress);
        pers.persAddress="Karabaglar";
        System.out.println(pers.majorDoctor);

        //Static bir uyuye obje uzerinden ulasmak isterseniz
        //Java otomatik olarak getirmez ama yazarsaniz kabul eder
        //IntelliJ'de static bir uyeye,nicin static olmayan bir yontemle ulasiyorsub
        //diye o kodu sariya boyar


    }
}
