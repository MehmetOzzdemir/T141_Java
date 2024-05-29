package day37_inheritance;

public class C04_Child extends C03_Parent {
    /*
    Child class da olusturulan her objenin parent classdaki
    ozelliklere de sahip olabilmesi icin Java extends kullanan bir classdaki
    her constructor'in İLK SATİRİNA constructor Call olma mecburiyeti koymustur

    ilk satirda gorunur bir cons. call varsa
    Java o consç call'a uygun olarak calisir
    Eger ilk satirda GORUNUR bir cons. call yoksa
    JAva default olarak PARAMETRESİZ super() koyar
      */

    C04_Child() {
        System.out.println("Child parametresiz Constructor");
    }

    C04_Child(int a) {
        System.out.println("Child Integer parametreli Constructor Calisti");
    }
    C04_Child(String a) {
        super(5);
        System.out.println("Child String parametreli Constructor Calisti");
    }
    C04_Child(char s){
        super("s",5);
        System.out.println("Child Char Parametreli Constructor");
    }
    C04_Child(String a,int b){
        super("Ali");
        System.out.println("child 2 Parametreli Constructor");
    }
    public static void main(String[] args) {
        // C04_Child child1 = new C04_Child();
        // C04_Child child2 = new C04_Child(4);
        // C04_Child child3 = new C04_Child("Ali");
        C04_Child child4 = new C04_Child("a",1);
       // C04_Child child5 = new C04_Child("Ali",5);
    }
}
