package day34_inheritance;

public class Personel {
    int persNo;
    String isim="İsim belirtilmedi";
    String departman="departman belirtilmedi";

    public void maas(){
        System.out.println("Tum personelin maasi vardir");

    }

    public void mesai(){
        System.out.println("tum personel statusune gore mesai yapar");
    }

    public void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alir");
    }
}
