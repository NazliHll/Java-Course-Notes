package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        Elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip eski urunu, varolan eski urunler
        listesine ekleyelim
        */
        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String>eskiurunler=new ArrayList<>();
        /*
           listedeki ikramin yerine biskrem koyalım,
           İkram'ı da eski urunler listesine koyalım
            */
        String yeniUrun="biskrem";
        String silinecekUrun="ikram";

       int temp=urunler.indexOf(silinecekUrun);
       String silinenUrun=urunler.set(temp,yeniUrun);
       eskiurunler.add(silinenUrun);
        System.out.println("liste: "+urunler);
        System.out.println("eski urunler listesi: "+eskiurunler);
















    }
}
