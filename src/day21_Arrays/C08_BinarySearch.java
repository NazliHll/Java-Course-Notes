package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {

        /*
        Binary search java'da eleman aramanin kisa yoludur.
        Ancak binary search'un calismasi icin once array'in sirali hale
        getirilmesi gerekir.
        Eger siralama yapmadan binary search yapilirsa sonucu bulamayabilir veya
        yanlıs bulabilir.
         */
        String[] harfler={"Y","B","D","G","O"};

        String arananHarf="D";

        /*
        1- Binary search bize aradigimiz elemanin index'ini dondurur.
        2- Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
            emin olmak icin oncelikle sort yapmaliyiz.
         */
        System.out.println(C03_Contains.contains(harfler, arananHarf));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));


    }
}
