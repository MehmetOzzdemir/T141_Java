package day32_dateTime_Varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();


        System.out.println(ldt);    //  2024-04-17T13:35:49.001470

        /*
            Eger tarih ve saati istediginiz formda
            ytazdirmak isterseniz once o formati olusturmalisiniz
            format olusturduktan sonra ldt'yi istenen formatta yazdirabilirsiniz
         */

        //Tarihi 03 Apr 24 seklinde yazdirin

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMM yy");
        System.out.println(ldt.format(dtf1));

        // 03 April 2024
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(ldt.format(dtf2));


        //3/4/2024 20:33

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d/M/yyyy  HH:mm");
        System.out.println(ldt.format(dtf3));
        //3 April Wednesday

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("d MMM eeee");
        System.out.println(ldt.format(dtf5));


        // 8:33 pm

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(ldt.format(dtf4));

    }
}
