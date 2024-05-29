package day39_inheritanceOverriding;

public class C05_Child extends C04_Parent {

    public void method1() {
        //child class da overriding method olusturmak icin
        // method ismi ve signature ayni olmalidir
    }
    public void metthod2(int num){
        //parent daki method2 ile signature'i ayni olmadigindan
        //overriding olmaz
    }

    @Override
    public int method3() {
        //overrşde method'u intelliJ' e olusturtdugumuzda
        //@override notasyonu kullanilir
        //Bu notasyonun gorevi,parent class daki overridden methodu
        //override etmeye mani olacak bir degisiklik olursa
        //CTE verir
        return 6;
    }

    public String method4(){
        //signature = method ismi + parametrelerin data turleri
        //access modifier methos siganture ina dahil degildir
        //ama overridding icin access modifier lar da onemlidir


        //overriding de child class daki method un
        //access modifier i parent class dakinden
        //daha kisitlayici OLAMAZ
        return "Java";
    }
    private void method5(){
        //parent class da olsa
        //private access modifier'i olan class uyeleri
        //baska classlardan gorulemeyecegi ici
        //private methodlar override EDILEMEZ
    }

    public static void method6(){
        //static methodlar da override EDİLEMEZ
    }
    public void method79(){
        //overridden method is final
        //final olarak isaretlenen bir method
        //override EDİLEMEZ
    }

    public int method8(){
       //return type da siganture 'a dahil degildir
        //ama overriding de onemlidir
        //parent class daki method'un return type'i
        //primitive data turleri veya void ise
        //overriding method'ıun return type i AYNI OLMALIDIR
        return 6;
    }
    public String method9(){
        //Eger return type non-primitive idse
        //child class daki return type
        //ya parent daki retun type ile ayni olmali
        //ya da parent daki return type in child i olabilir

        //Bu iliskiye co-variant data turu denir

        return "Java";
    }


    public void method10(){
        super.method10();


        //bizim mudahelemiz olmazsa
        //overridden method ve overriding method'dan
        //sadece biri calisir
        //Eger iki method'un da calismasini istersek
        //child class daki method da
        //parent class daki methodu cagirabiriz


    }
}
