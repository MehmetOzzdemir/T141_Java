package day26_constructors;

public class C04_Car {
    String brand = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int year = 1900;
    int price;

    /*
        EGER
        Constructor icinde instance variable'lara atama yapmak istersek
        Constructor'a parametre yazabiliriz

        -Parametre isimleri instance variable isimllerinden farklı ise
         brand = brd
         bu atamada brd'nin parametre, model'in ise instance variable oldugu
         acikca belli oldugundan java extra bilgiye ihtiyac duymaz

         -  -Parametre isimleri instance variable isimllerinden ayni ise
         brand = brand
         bu atama anlamsi olur
         icinde oldugumuz scıope da brand vaariable ' ı oldugundan java class level daki instance
          variablelere bakmaz

          Objeye aiy(instance) brand'i belirtmek icin
          this. kullanilmalidir

          this. kullanildiginda
          java icinde bulundugumuz scope'a bakmadan
          direk class level'a bakar

     */

    C04_Car() {

    }

    C04_Car(String brd, int prc) {
        brand = brd;
        price = prc;
    }

    public C04_Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "C01_Car Ozellikleri" +
                "\nbrand : " + brand +
                "\nmodel : " + model +
                "\nyear : " + year +
                "\nprice : " + price;
    }
}
