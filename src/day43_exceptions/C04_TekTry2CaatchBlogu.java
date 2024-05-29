package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TekTry2CaatchBlogu {
    public static void main(String[] args) {


        String str = "Java gun gectikce guzellesir";
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayi giriniz : ");

        try {
            int index = scan.nextInt();//InputMissmatchException

            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
        } catch (InputMismatchException e) {
            System.out.println("Pozitif tam sayi girmelisiniz");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girdiginiz sayi metnin sinirlari disida");
        }

    }
}
