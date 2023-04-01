package day26_Constructor;

import day25_Constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
          /*
        Birgün onceki Car Class'indan obje olusturalim.
        --> Farkli bir package'daki bir class'dan obje olusturdugumuzda
        access modifier'lari da dikkate almaliyiz.
         */
        Car car1=new Car();
        System.out.println(car1.fiyat);
         /*
        Araba class'indan bir obje olustudugumda eger
        default constructor kullanildiysa tum
        ozellikler icin tek tek deger atamak
        zorunda kaliriz.
         */
        Araba araba1=new Araba();
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";
        System.out.println("Araba1 bilgileri\nmarka: "+araba1.marka+"\nModel: "+ araba1.model
                +"\nYil: "+araba1.yil+"\nFiyat: "+araba1.fiyat);
          /*
        Eger bir objeyi olustururken bazi ozelliklerini
        argüment olarak belirtip o ozelliklerde
        bir obje olusturmak istersek
        Java itiraz eder.
        Cunku her class'da default constructor vardir
        ama o da parametresizdir.
        bizim yeni ve parametreli constructor(lar)'a
        ihtiyacimiz vardir.
         */
        Araba araba2=new Araba("BMW","5.20",2011,15000);
        System.out.println("Araba2 bilgileri\nmarka: "+araba2.marka+"\nModel: "+ araba2.model
                +"\nYil: "+araba2.yil+"\nFiyat: "+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println("Araba3 bilgileri\nmarka: "+araba3.marka+"\nModel: "+ araba3.model
                +"\nYil: "+araba3.yil+"\nFiyat: "+araba3.fiyat);






    }
}
