package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih"+tarihSaat);//2023-04-04T16:20:59.726585900

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf.format(tarihSaat));//04/4/23 04:20

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));//4/Nis/2023 16:22





    }

}
