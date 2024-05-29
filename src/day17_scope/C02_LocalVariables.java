package day17_scope;

public class C02_LocalVariables {

    /*
    1 - Local variable'lar bir kod blogunun icinde olusturulur
        ve scope'u icerisinde olusturuldugu kod blogudur
        baska bir yerde kullanilamaz
    2 - Local variable'lar deger atanmadan declare edilebilir
        ama deger atamadan kullanilamaz.
    3 - Local variable'lar static olarak tanimlanamaz
    4 - Her ne kadar bir method'un icinde olsalar da
        Loop'larin da kendi scope'u vardir
        Bir Loop'un icinde olusturlan variable Loop'un dısında kullanilamaz

        Loop'un oldugu methodda Loop'dan once olusturulan variable'lar
        Loop icerisinde Kullanilabilir

     */
    public static void main(String[] args) {
        int num;
        String s;

        //int c = 2*num;// Variable 'num' might not have been initialized
        //System.out.println(s);// Variable 's' might not have been initialized

        //static int d =20;//Modifier 'static' not allowed here

        num=10;
        for (int i = 0; i <num ; i++) {
            System.out.println(num);
            num--;
        }
    }
}
