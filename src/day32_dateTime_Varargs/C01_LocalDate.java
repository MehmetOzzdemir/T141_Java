package day32_dateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 5, 14);

        System.out.println(birthday.until(today));
        System.out.println(birthday.until(today).getYears());

        System.out.println(today.lengthOfMonth());
        System.out.println(today.lengthOfYear());


        //verilen zamanlar arasındaki farki bir variable'a kaydetmek isterseniz
        Period myAge = birthday.until(today);
        System.out.println("Yasim : " + myAge.getYears());

        System.out.println(today.getDayOfYear());

    }
}
