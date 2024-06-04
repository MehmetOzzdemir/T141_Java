package day49_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C03_NestedRezervasyonMap {
    static Map<String, Object> rezervasyonMapiMethodlu;

    public static void main(String[] args) {

/*
       {

            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */

        // Map olarak yukardaki rezervasyon bilgilerini olusturalim


        rezervasyonMapiMethodlu = new TreeMap<>();

        rezervasyonOlusturma("Mehmet", "Özdemir", 500, false, bookingDateMap("2024-07-21", "2024-08-10"), "wi-fi");

        System.out.println(rezervasyonMapiMethodlu);

        //rezervasyondaki ismi yazdirin
        System.out.println(((Map<String,String>) rezervasyonMapiMethodlu.get("Mehmet")).get("lastname"));

        Map<String,Object> rezervasyonMapi = (Map<String, Object>) rezervasyonMapiMethodlu.get("Mehmet");

        //rezervasyondaki ismi yazdirin
        System.out.println(rezervasyonMapi.get("firstname"));

        //rezervasyondaki checkin tarihini yazdirin
        System.out.println(((Map<String,String>)rezervasyonMapi.get("bookingdate")).get("checkin"));

        //rezervasyondaki checkin tarihini yazdirin


        System.out.println(((Map<String,String>)rezervasyonMapi.get("bookingdate")).get("checkout"));




    }

    public static void rezervasyonOlusturma(String firstname, String lastname, Integer totalPrice, Boolean depositpaid, Map<String, String> bookingdate, String additionalNeeds) {

        Map<String, Object> rezervasyonValueMap = new HashMap<>();
        rezervasyonValueMap.put("firstname", firstname);
        rezervasyonValueMap.put("lastname", lastname);
        rezervasyonValueMap.put("totalprice", totalPrice);
        rezervasyonValueMap.put("depositpaid", depositpaid);
        rezervasyonValueMap.put("bookingdate", bookingdate);
        rezervasyonValueMap.put("additionalneeds", additionalNeeds);

        rezervasyonMapiMethodlu.put(firstname, rezervasyonValueMap);


    }

    public static Map<String, String> bookingDateMap(String checkin, String checkout) {
        Map<String, String> bookingdate = new HashMap<>();

        bookingdate.put("checkin", checkin);
        bookingdate.put("checkout", checkout);

        return bookingdate;
    }
}
