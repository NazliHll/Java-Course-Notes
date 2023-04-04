package day30_immutableDate;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2023-04-04T11:08:15.096361400

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));

        System.out.println(tarihSaat.minusMonths(100).plusHours(100));
        System.out.println(tarihSaat.toLocalDate());


    }
}
