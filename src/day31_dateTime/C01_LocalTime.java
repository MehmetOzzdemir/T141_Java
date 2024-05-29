package day31_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);
        //saat variable i canli bir kronomete veya saatdegil
        //9.satirda calistirdigi anda ,bilgisayarinizin saatini kaydeden bir variable'dir


        for (int i = 0; i < 100000000; i++) {
            String str = i + "";
        }
        System.out.println(time);
        //saat sabit bir variable oldugu icin islem icin gecse de saat degeri degismez


        LocalTime finishTime = LocalTime.now();
        System.out.println(finishTime);

        LocalTime japon = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("Japan Time : "+japon);

        LocalTime istenenSaat = LocalTime.of(12,10,23);
        System.out.println("istenen Saat : "+istenenSaat);


        //plus ve minus methodlari saate ekleme veya cikarma yapar
        System.out.println(time.plusMinutes(267).plusHours(456));
        System.out.println(time.minusSeconds(1500));

        //with methodlari saatin istedigimiz bolumune farkli deger atmaamizi saglar

        System.out.println(time.withHour(17));
        System.out.println(time.withSecond(0).withNano(0));
        System.out.println();
        //iki zamani garsilastirmak icin
        System.out.println(time.isBefore(finishTime));
        System.out.println(time.isAfter(finishTime));

        //get methodlari saatin istedigimiz bolumlerini bize getirir
        System.out.println(time.getNano());
        System.out.println();

        //gece 00:00'dan su ana kadar gecen saniye veya nanosaniyeyi verir
        System.out.println(time.toNanoOfDay());
        System.out.println(time.toSecondOfDay());


        //asagidaki loop'un toplam islem suresini yazdirin
        LocalTime loopStart = LocalTime.now();
        Long loopBaslangicNono = LocalTime.now().toNanoOfDay();
        for (int i = 0; i < 1000000000; i++) {
            String str = i + "";

        }
        LocalTime loopFinish = LocalTime.now();
        Long loopBitisNano = LocalTime.now().toNanoOfDay();

        System.out.println("Loop baslangic : " + loopStart);
        System.out.println("Loop bitis : " + loopFinish);
        System.out.println("Loop isteö suresi Nano Saniye olarak : "+ (loopBitisNano-loopBaslangicNono));


    }
}
