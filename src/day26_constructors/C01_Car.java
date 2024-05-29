package day26_constructors;

public class C01_Car {

    String brand = "marka belirtilmedi";
    String model = "model beirtilmedi";
    int year = 1900;
    int price;


    C01_Car() {
        //Biz bir class'da gorunur bir constructoor olusturdugumuzda
        //Java Default Constructor'u SILER
        //bu durumda daha onceden default cons.' i kullanarak
        //olusturan objeler CTE verir
        //Kodun problem yasamamasi icin
        //gorunur bir cons. olusturdugumuzda
        //HEMEN default cons. yerine de
        // gorunur bir parametresiz cons. olusturmaliyiz
    }


    C01_Car(String brnd, String mdl, int yr, int prc) {
        brand = brnd;
        model = mdl;
        year = yr;
        price = prc;

    }


    @Override
    public String toString() {
        return "C01_Car Ozellikleri" +
                "\nbrand : " + brand +
                "\nmodel : " + model +
                "\nyear : " + year +
                "\nprice : " + price;
    }
}
