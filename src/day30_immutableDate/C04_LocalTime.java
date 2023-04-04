package day30_immutableDate;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();
        System.out.println(time1);//10:37:25.974965800
 /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip
        bizim variable'imizza store eder.
        time1 variable'inin degeri SABİTTİR.
         */

        Thread.sleep(3000);// 3 sn bekler sonra alt satira geçer
        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond());
        System.out.println(time1.plusSeconds(10000));

        System.out.println(time1.minusMinutes(200));
        System.out.println(time1.withHour(3));//saati 3 yapip yazdirir





    }
}
