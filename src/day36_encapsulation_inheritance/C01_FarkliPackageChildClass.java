package day36_encapsulation_inheritance;

import day35_accessModifier.C02_Depo;

public class C01_FarkliPackageChildClass extends C02_Depo{
    public static void main(String[] args) {
        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02_Depo.defaultStr);
        System.out.println(C02_Depo.protectedStr);
        System.out.println(C02_Depo.publicStr);

        C01_FarkliPackageChildClass depo = new C01_FarkliPackageChildClass();
        //System.out.println(C02_Depo.privateNumber);
        //System.out.println(depo.defaultNumber);
        System.out.println(depo.protectedNumber);
        System.out.println(depo.publicNumber);
    }
}
