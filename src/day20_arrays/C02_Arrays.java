package day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];
        System.out.println(sayilar);//[I@568db2f2
        /*
        non-primitive data turundeki datalari her zaman direkt yazdiramayabiliriz.
        Array'i yazdirmak istersen Arrays class'indan yardim isteriz.
         */
        System.out.println(Arrays.toString(sayilar));//[0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar);//[I@568db2f2
        System.out.println(Arrays.toString(sayilar));//[5, 3, 10]

        String siniflist[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(siniflist));//[Ali, Ayse, Ahmet]

        siniflist[1]="Hasan";
        System.out.println(Arrays.toString(siniflist));//[Ali, Hasan, Ahmet]

        System.out.println(siniflist[1]);//hasani yazdiralim
        System.out.println(siniflist[0]);//ali



    }
}
