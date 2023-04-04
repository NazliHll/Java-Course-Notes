package day30_immutableDate;

import java.time.LocalDate;
import java.time.Month;

public class C03_localdate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2023-04-04
        tarih.getDayOfYear();
        System.out.println(tarih.getDayOfYear());//94
        System.out.println(tarih.getDayOfWeek());//TUESDAY
        System.out.println(tarih.getMonthValue());//4
        System.out.println(tarih.isLeapYear());//false


        LocalDate tarih2=LocalDate.of(2001,5,15);
        System.out.println(tarih2);//2001-05-15

        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3);//1990-01-10

        System.out.println(tarih.plusDays(100));//2023-07-13
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//2028-07-16

        System.out.println(tarih.minusWeeks(20));//2022-11-15
        System.out.println(tarih.minusDays(100).minusMonths(5));//2022-07-25

        System.out.println(tarih.isAfter(tarih2));//true

         /*
        İki farkli dogum gunu girilidiginde hangisinde doganın daha buyuk oldugunu bulunuz.
         tarih2 ve tarih3 icin yapalim
         */
        if (tarih2.isAfter(tarih3)) {
            System.out.println(tarih3 + " tarihinde dogan daha buyuktur.");
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2 + " tarihinde dogan daha buyuktur.");
        } else {
            System.out.println("İki tarih birbiri ile ayni.");
        }
    }
}
