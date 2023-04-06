package day34_inheritance;

import javax.swing.text.StyleContext;

public class Isci extends Personel{
     /*
    --> Normal hayatimizda parent cocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler
    --> mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve method'lari olusturmak yerine Personel class'ini
    kendimize parent ediniriz.
    --> Bir class'i parent  edinmek icin extends keyword kullanmaliyiz
    --> Bir class baska bir class'i parent edindiginde
        1- parent class'indaki tum ozelliklere (variable + method) otamatik olarak sahip olur
        2-- parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
        3- Parent class'da olmayan bazi yeni ozellikler olusturabilir.
        NOT ==> Parent class'daki ozelliklerden hicbirrini reddedemez ama degistebiliriz.
     */

    int persNo=1001;
     public static void main(String[] args) {
        Isci isci1=new Isci();
         System.out.println(isci1.isim);//Isim belirtilmedi
         isci1.isim="Selim";
         System.out.println(isci1.persNo);//1001 kendi class'imizda varsa onu kullanıiriz

         isci1.maas();
     }
     public void maas(){
         System.out.println("isciler minimum 15 euro saat ucreti alir");
     }
     public void ozelSigorta(){
        System.out.println("iscilerden isteyene ozel sigorta yaptirilir");
    }
}
