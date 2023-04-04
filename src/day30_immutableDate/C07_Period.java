package day30_immutableDate;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        /*
        İki tarih arasındaki sureyi bulma
         */

        LocalDate tarih1=LocalDate.of(1998,6,30);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(bugun,tarih1);
        System.out.println(period);
    }
}
