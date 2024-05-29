package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_FarkliTryCatchIerIleCozum {
    public static void main(String[] args) {

        /*
            Ayri ayri try catch kullandigimizda
            birinci try catch de exception yakalandiginda
            ikincinin bundan haberi olmuyor

            bunun cozumu icin extra flag kullanabilirsiniz
         */

        String str = "Java gun gectikce guzellesir";

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayi giriniz : ");

        int index =100;//InputMissmatchException

        try {
            index = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pozitif bir tamsayi girmelisiniz....");
        }

        try {
            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz Index sinirlarin disinda");
        }
    }
}
