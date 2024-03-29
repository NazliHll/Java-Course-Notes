package day44_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

            /*
        Sondan basa gelebilmek icin once sona gitmek lazim.
         */
        ListIterator lit1=liste.listIterator();
        System.out.println(liste);

        while (lit1.hasNext()){
            lit1.next();
        }
        //bu loop bizi sona goturur
        while(lit1.hasPrevious()){
            System.out.print(lit1.previous()+" ");
        }
    }
}
