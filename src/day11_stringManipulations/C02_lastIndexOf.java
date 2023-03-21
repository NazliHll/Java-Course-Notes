package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="java cok kolay, java cok guzel";
        String kelime="java";
          /*
        Verilen kelime icin asagıdaki sartlardan uygun olanı yazan bir programi
        yazin.
        -verilen kelime cumleden kullanilmamiş
        -verilen kelime cumlede sadece 1 kere kullanilmiş
        -verilen kelime cumlede birden fazla kullanilmiş
         */

        int kelimeIlkIndex= cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);
        if(kelimeIlkIndex==-1) {
            System.out.println("verilen kelime cumleden kullanilmamis");

        }else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");

        }

    }
}
