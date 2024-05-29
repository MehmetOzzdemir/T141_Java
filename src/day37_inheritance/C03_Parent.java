package day37_inheritance;

public class C03_Parent extends C02_GrandParent {

    C03_Parent() {
        System.out.println("Parent parametresiz Constructor");
    }

    C03_Parent(int a) {
        System.out.println("Parent Integer parametreli Constructor");
    }
    C03_Parent(String s,int a){
        super(5);
        System.out.println("Parent String parametreli Constructor");
    }
    C03_Parent(String t){
        this(3);
        System.out.println("Parent String parametreli Constructor");
    }
}
