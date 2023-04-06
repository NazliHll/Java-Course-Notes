package day34_inheritance;

public class Personel {
    /*
  eger parent class olacak sekilde tasarladiginiz bir class varsa veya ilerde
  bu class'i parent yapmak isteyenler olabilir diyorsaniz o zaman
  variable ve method'larin access modifier'ini protected
   */
   protected int persNo;
    protected String isim="İsim belirtilmedi";
    protected String departman="departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin maasi vardir");

    }

    protected void mesai(){
        System.out.println("tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");
    }
}
