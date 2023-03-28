package day20_arrays;

import java.util.Arrays;

public class C03_Lenght {
    public static void main(String[] args) {
        /*
        iki sekilde array olusturabiliriz.
         */
        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar arrayinin uzunlugu: "+sayilar.length);//3
        /*
        String length() method'unda parantez var, array'de yok.
         */
        System.out.println("harfler arrayinin uzunlugu: "+harfler.length);//4
        System.out.println(Arrays.toString(harfler));//[null, null, null, null]

        /*
        Harfler array'in son elementini yazdiralim.
         */
        System.out.println(harfler[harfler.length-1]);//null
        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException









    }
}
