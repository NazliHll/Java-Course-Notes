package day23_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<String>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]

         /*
        indexOf method'u bize bilgi donduren bir method'dur. listemizi degistirmez
         */
        System.out.println( urunler.lastIndexOf("Ikram"));//1
        /*
        indexOf method'u urunu aramaya 0. index'den,
        lastIndexOf method'u ise aramaya son index'den baslar.
        arama bitip, urun bulundugunda ikisi de bulunan urunun index'ini verir.
         */
    }
}
