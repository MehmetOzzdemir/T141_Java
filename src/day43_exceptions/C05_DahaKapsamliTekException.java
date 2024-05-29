package day43_exceptions;

import java.util.Scanner;

public class C05_DahaKapsamliTekException {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesir";
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayi giriniz : ");

        try {
            int index = scan.nextInt();//InputMissmatchException

            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
        } catch (Exception e) {//RunTimeException da Olur
            //Exception ve RuntimeException daha kapsamli olduklarindan
            //hem InputMissmatchException i hemde StringIndexOutOfBoundsExcepiton i yakalar
            //ama sorunun hangisinden kaynaklandigini bilemeyiz
            System.out.println("Girilen deger sonuc yazdirmaya uygun degil");


        }


    }
}
