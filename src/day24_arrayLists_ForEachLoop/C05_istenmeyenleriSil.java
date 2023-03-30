package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_istenmeyenleriSil {
    public static void main(String[] args) {
        /*
        Soru 4-) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
                 kalan elementleri yeni bir array yapin
         */
        String[] sehirler = {"Istanbul", "Ankara", "Mersin", "Konya", "Kastamonu"};
        String istenmeyenHarf = "a";
        List<String> kalanlar = new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);

            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak
        System.out.println(kalanlar);//[Mersin]

        // // yeni bir array olusturup listeyi ona aktaralım.
        String[]kalanlarArray=new String[kalanlar.size()];

        for (int i = 0; i <kalanlarArray.length; i++) {
            kalanlarArray[i]=kalanlar.get(i);

        }
        // // sehirler array'in yeni degerini atayalim
        sehirler=kalanlarArray;
        System.out.println("sehirler arrayinin son hali: "+ Arrays.toString(sehirler));//[Mersin]

    }
}
