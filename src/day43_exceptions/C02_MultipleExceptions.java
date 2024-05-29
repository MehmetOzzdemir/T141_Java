package day43_exceptions;

import java.util.Scanner;

public class C02_MultipleExceptions {
    public static void main(String[] args) {


        /*
            Bu kod da 3 tane risk var
            1-InputMissMachException
            2-StringIndexOutOfBoundException olusabilir

            4 farkli yol ile bunu cozebiliriz
            1-eger risk olusturan kodlar ayri ayri ise
            ayri ayri try catch yapabiliriz

            2-ic ice try catch olusturabiliriz

            3-bir try 2 catch olusurabiliriz

            4-iki exception'i da kapsayan
                daha kapsamli bir exception ile
                ikisinin yerine tek bir exception ile cozeriz

         */
        String str = "Java gun gectikce guzellesir";
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayi giriniz : ");

        int index = scan.nextInt();//InputMissmatchException

        System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
    }
}
