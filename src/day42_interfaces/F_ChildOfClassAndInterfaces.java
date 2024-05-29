package day42_interfaces;

public class F_ChildOfClassAndInterfaces extends E_ParentClass
        implements A_ParentInterface01, D_ParentInterface03 {


    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }

    /*
    birden fazla parent edinen bir class
     parent abstract yapiilarda bulunan
     concrete'lestirilmemis tum abstract methodlari
     kendisine UYARLAMAK ZORUNDADIR

     bu ornekte method1 ve method2
     parentClass'da concere olarak bulundugundan
     implement etme zorunlulugu yoktur.
     */

    public static void main(String[] args) {
        //System.out.println(NUM);

        System.out.println(A_ParentInterface01.NUM);
        System.out.println(D_ParentInterface03.NUM);
        System.out.println(E_ParentClass.NUM);
        //Interfacelerdeki tum variable lar final oldugundan sonradan deger atanamaz
//        A_ParentInterface01.NUM=45

        E_ParentClass.NUM = 44;
        System.out.println(E_ParentClass.NUM);

        /*
        Birden fazla parent da ayni isimde variable olursa
        parent ismi ile birlikte yazarak
        istedigimizi kullanabiliriz
         */
    }
}
