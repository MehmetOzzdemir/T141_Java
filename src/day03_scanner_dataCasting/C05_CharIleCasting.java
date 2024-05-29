package day03_scanner_dataCasting;

public class C05_CharIleCasting {
    public static void main(String[] args) {
        //Char data türüozel bir data tutudur
        //normal olarak '' içinde tek bir karakter alabilir
        //ancak char data tutu int variable,matemöatiksel işleme
        // sokulursa ASCII tablosundaki değeri ile işleme girer
        //aynı şekilde ASCII tablosundaki değer ile int sata türü olarak kullanılabilir

        char letter = 'a';
        int num = letter;
        double dbl = letter;
        char chr1 =243;

        System.out.println(num);
        System.out.println(dbl);
        System.out.println(chr1);
        System.out.println('a'+'b');
        System.out.println('1'+'2');
    }
}
