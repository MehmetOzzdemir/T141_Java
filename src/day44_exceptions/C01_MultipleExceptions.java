package day44_exceptions;

public class C01_MultipleExceptions {
    public static void main(String[] args) {

        /*
            Jacada ogrenemeyceğimiz kadar cok exception turu vardir

                1-Exception : tum exceptionlarin babasi
                2-RunTimeException(Unchecked)           Diger Exceptionlar(En cok karsilasilan Compile Time /Checked)
                    NullPointerException                    IOExceptions(dosya okuma yazma ile ilgili exceptionlar)
                    ArrayIndexOutOfBoundsException          FileNotFoundException
                    StringIndexOutOfBoundsException
                    ArithmetivException
                    InputMissmatchException


                    Eger kodumuzda birden fazla exception olusma riski varsa
                        -2 farkli try-catch
                        -2 exception i da kapsayan tek catch olabilir
                        -tek try 2 catch
                        - nested (ic ice try catch)


                        Bazen ortaya cikmasi mumkun olan exception lar
                        birbirinin parent-child i olabilir
                        bu durumda biraz daha dikkatli olmaliyiz


                        arent exceptşonlar yakalama acisindan daha kampasmlidir ve daha ceok exception yakalr
                        eger alt alata yazarken en uste parent exception i yazarsaniz
                        alttaki child exception lara yakalanacak bir sey kalmaz
                        -ya sqdece parenti yazabilirsiniz
                        -veya yakalanan hatayi detaylandirmak istersek
                        once child sonra parent exception i yazabilirsiniz



         */







    }
}
