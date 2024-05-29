package day31_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date); //2024-04-14

        //JaponyaDaki tarihi yazdiralim

        LocalDate japanDate = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(japanDate);

        //istenen tarihi olusturma

        LocalDate dogumTarihi1 = LocalDate.of(1995, 05, 14);
        System.out.println(dogumTarihi1);
        LocalDate dogumTarihi2 = LocalDate.of(1996, Month.MAY, 20);
        System.out.println(dogumTarihi2);

        System.out.println(date.plusYears(5).plusMonths(7).plusDays(10));

        //verilen dogum tahiinden eski olani yazdirin

        System.out.println(dogumTarihi1.isBefore(dogumTarihi2) ? dogumTarihi1 : dogumTarihi2);

        //verilen yilin artik yil olup olmadigini yazdirin

        System.out.println(dogumTarihi1.isLeapYear());
        System.out.println(dogumTarihi2.isLeapYear());

    }
}
