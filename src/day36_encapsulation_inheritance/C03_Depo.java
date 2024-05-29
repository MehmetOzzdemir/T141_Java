package day36_encapsulation_inheritance;

public class C03_Depo {
    private int intPrivate;
    int intDefault;
    protected  int intProtected;

    public int intPublic;

    public static void main(String[] args) {
        C03_Depo obj = new C03_Depo();

        System.out.println(obj.intPrivate);
        obj.intPrivate=20;

        obj.intDefault=40;
        System.out.println(obj.intDefault);


        System.out.println(obj.intProtected);
        obj.intProtected=23;

        System.out.println(obj.intPublic);
        obj.intPublic=12;


    }
}
