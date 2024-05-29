package day44_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_CheckedExceptionsAndThrowsKeywords {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            JAva bilgisayarinizdaki dosyalara erisim icin FileInputStream class'ini olusturmustur
         */

        String dosyaYolu = "src/day44_exceptions/deneme.txt";


        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        //Unhandled exception: java.io.FileNotFoundException

        /*  Checked Exception Java nin daha kod yazilirken farkina vardigi exception lardir
            Bir checked exception ile karsilastigimiz da 2 alternatifimiz olur
                    1-Try Catch ile kodu sarmalayip,
                    exception'iş handle etme(exception olusturdugunda javaya ne yapmasi gerektigini soyleme)
                    boylece kod calismaya devam eder

                    2- Eger boyle bir sorunla karsilastiginda yoluna devam etmesini istemiyorsak
               exception firlatmasini istiyorsak
               yani kodun bu haliyle calismasini istiyorsak
               java'ya sorumlulugun bizde oldugunu soylemek
               ve bu kodu sonradan inceleyecek olanlari exception konusunda uyarmak icin
               method deklarasyonunan "throws" keyword'u ile
               olusacak exception turunu yazariz




         */
    }
}
