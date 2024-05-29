package day29_passByValue;

public class C02_NonStaticBlocks {
/*
Static olmayan blocklar
Constructordan once calisir
ve (varsa ) obje olusturmadan oncae
yapilmasi gereken ayarlari yapar
 */
    C02_NonStaticBlocks() {
        System.out.println("Constructor Ran");
    }

    C02_NonStaticBlocks(int num ){
        System.out.println("Parametreli Constructor Ran");
    }


    public static void main(String[] args) {

        System.out.println("Main Method Ran");

        C02_NonStaticBlocks obj1 = new C02_NonStaticBlocks();
        System.out.println("obj1 created");


        C02_NonStaticBlocks obj2 = new C02_NonStaticBlocks();
        System.out.println("obj2 created");

        C02_NonStaticBlocks obj3 = new C02_NonStaticBlocks(5);
        System.out.println("obj3 created");


    }

    {
        System.out.println("Non Static Blocks Ran");
    }


}
