package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C05_MethodKullanma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write A String : ");
        String metin = scan.nextLine();

        //kullanicinin girdigi metni tersten yazdirin

        C03_MethodOlusturma.reverseWrite(metin);

        //Kullanicinin girdigi metnin palindrome olup olmadigini true/false seklinde yazdirin


        System.out.println(C04_Palindrome.isPalindrome(metin));

        //Eger girilen metin palindrome ise "Aferin sana"
        //palindrome degilse "Bu nasil metin,daha guzel bir metin girmelisin" yazdirin

        boolean result = C04_Palindrome.isPalindrome(metin);
        //palindrome olup olmadigini true/false dönen method sayesinde kaydettik

        if (result) {//result == true
            System.out.println("Aferin sana");
        } else {
            System.out.println("Bu nasil metin,daha guzel bir metin girmelisin");
        }


    }
}
