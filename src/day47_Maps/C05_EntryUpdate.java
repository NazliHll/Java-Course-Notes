package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;


public class C05_EntryUpdate {
    public static void main(String[] args) {
         /*
        Soyisim Can olanlarin bransini DataScience yapalim.
         */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        /*
        Entryleri alalim
         */
        Set<Map.Entry<Integer,String>> entrySeti=sinifListMap.entrySet();

        String entryValue;
        String[]entryArr;
        for (Map.Entry<Integer,String>entry:entrySeti
             ) {
            entryValue=entry.getValue();
            entryArr=entryValue.split(", ");

            if (entryArr[1].equals("Can")){
                entryArr[2]="DataScience";
            }
            entry.setValue(entryArr[0]+","+entryArr[1]+", "+entryArr[2]);
        }
        System.out.println(sinifListMap);
    }
}
