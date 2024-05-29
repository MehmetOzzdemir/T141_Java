package day39_inheritanceOverriding;

import day38_inheritance.C04_Birds;

public class C02_Birds extends C01_Animals {
    protected void kanat() {
        System.out.println("kanatlidirlar");
    }

    protected void solunum() {
        System.out.println("akcigerle nefes alirlar");
    }

    protected void gaga() {
        System.out.println("gagalari vardir");
    }

    protected void cogalma() {
        System.out.println("yumurtayla cagalirlar");
    }
}
