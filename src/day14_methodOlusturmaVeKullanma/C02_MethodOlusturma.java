package day14_methodOlusturmaVeKullanma;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        //Verilen iki sayidan büyük olani yazdiran bir method olusturun
        //eger sayilar esitse "esit sayilarda büyük olan yoktur" yazdir

        buyukOlaniYazdir(7,5);
        buyukOlaniYazdir(7,9);
        buyukOlaniYazdir(7,7);
    }


    //Method class icinde ama diger methodlarin disinda olusturulur
    public static void buyukOlaniYazdir(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Sayilardan büyük olan : " + num1);
        } else if (num2 > num1) {
            System.out.println("Sayilardan büyük olan : " + num1);
        }else {
            System.out.println("Eşit sayilarda büyük olan yoktur");
        }
    }
}
