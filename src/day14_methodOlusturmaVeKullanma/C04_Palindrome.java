package day14_methodOlusturmaVeKullanma;

public class C04_Palindrome {
    public static void main(String[] args) {
        //Verilen metin palindrome ise true
        //palindrome degilse false donduren bir method olsuturun

        System.out.println(isPalindrome("Mehmet"));
        System.out.println(isPalindrome("ey edip adanada pide ye"));

    }

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }
    }

}
