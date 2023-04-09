package day36_InheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {
    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("yan hizmetliler: "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("yan hizmetliler %30 indirimli issizlik sigortasi yaptırabilir");

    }

    public static void main(String[] args) {
 /*
       --> Overriding child class'daki bir method'un parent class'daki ayni isimdeki
       method'u etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cıkarmasıdır.
       --> Overriding'i nerede dikkate aliyoruz?
       bir obje olusturulurken data turu ve constructor farkli ise
       Eger bir obje olusturulurken data turu ve constructor farkli ise
       objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz.
            1- Obje constructor'ın oldugu class'da olusur.
            2- Obje'nin ozelliklerini aramaya data turunun oldugu class'dan baslariz.
               bu class'da aranan ozellik bulunamazsa parent class'lara bakilir. orada da
               bulamazsak o zaman CTE verir.
      ==> Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.
            3- Aranan ozellik method ise degeri yazdirmadan once override edilmis mi
               diye kontrol etmemiz gerekir
               Eger override edildiyse en guncel degeri yazdiririz.
       */

        BMuhasebe yh1=new EYanHizmetler();
        System.out.println(yh1.gunlukMesai);//m
        System.out.println(yh1.saatUcreti);//m
        yh1.maas();//yh
        yh1.ozelSigorta();//m
        yh1.sigorta();//
        System.out.println(yh1.isim);
        System.out.println(yh1.soyisim);
        System.out.println(yh1.departman);
        /*
        System.out.println(yh1.issizlikSigorta); --> aramaya muhasebeden basladigimizdan
        issizlikSigortasi bulamadik CTE
     */
    }

}
