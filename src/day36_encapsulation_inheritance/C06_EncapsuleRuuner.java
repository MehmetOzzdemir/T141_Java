package day36_encapsulation_inheritance;

public class C06_EncapsuleRuuner {

    public static void main(String[] args) {
        C05_EncapsulaClass obj = new C05_EncapsulaClass();
//
       // obj.satisTutari = 30;
       // System.out.println(obj.satisTutari);
//
//
       // System.out.println(obj.toplamSatisMiktari);
       // obj.toplamSatisMiktari = 40;

        obj.setSatisTutari(50);

        /*
        System.out.println(obj.setSatisTutari(20));
        satis tutarina deger atayabiliyoruz
        ama atanan degeri yazdiramiyoruz
         */

        obj.setSatisTutari(60);
        obj.setSatisTutari(20);
        obj.setSatisTutari(30);

        System.out.println(obj.getToplamSatisMiktari()); //160

       // obj.getToplamSatisMiktari() = 500;
       // toplam satis tutarini yazdirip gorebiliyoruz
       //         ama toplam satis tutarina deger atayamiyoruz

        obj.publisSayi=60;
        System.out.println(obj.publisSayi);
        obj.publisSayi=75;
        System.out.println(obj.publisSayi);


        obj.setEncapsuleSayi(65);
        System.out.println(obj.getEncapsuleSayi());

        /*
        br variabe i public yapmak ile
        private yapip getter ve setter olusturmak
        erisim acısından ayni sonucu verir

        Bazi developer'lar
        get ve set islemine vurgu yapmak icin
        public yerine
        encapsule edip
        getter ve setter olusturmayi tercih ederler
         */
    }

}
