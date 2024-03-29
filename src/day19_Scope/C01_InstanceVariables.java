package day19_Scope;

public class C01_InstanceVariables {

     /*
            class icerisinde her yerden kullanmak istedigimiz variable'ları
            class level'da (Class'in icinde ama method'larin dışında)
            genellikle class level variable'lar class'in basinda olusturulur.(sart degil)
            class level'daki variable'lar icin 2 scope vardir.
                1- static variables (Class variable'lari da denir.)
                2- instance (static olmayan) variables (Obje variable'i da denir.)
             */

     int instSayi=20;//static olmaip class levelde oldugu icin instance variable

    public static void main(String[] args) {
        int sayi=10;
          /*System.out.println(instSayi);
           instanve variables static olmadigi icin static klup'e uye main method'dan direk
           kullanamayiz.
           instanve variables'larin diger adi object variable'dir.
           dolayisiyla obje olusturursaniz instance variable'lari her yerden direkt kullanabiliriz.

              */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once: "+obje1.instSayi);//20
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra: "+obje1.instSayi);//30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once: "+obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra: "+obje2.instSayi);//25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once: "+obje3.instSayi);//20

        //her obje olustugunda instance(obje) variablenin ilk atanan degerini alir
    }
        public static void staticMethod(){
            // System.out.println(sayi);

        /*
        Bir method'un icerisinde olusturulan variable,
        sadece o method'un icinden kullanabilir.
        (Local variable)
         */
        /*
        instSayi=30;
        İnstance variable'lara main method dısındaki static method'lardan da
        direkt ulasamayız.
        Obje olusturursak ulasabiliriz.
         */
            C01_InstanceVariables obje4=new C01_InstanceVariables();
            System.out.println(obje4.instSayi);

        }

        public void staticOlmayanMethod() {
            System.out.println(instSayi);
         /*
        İnstance variable'lar class icerisindeki
        static olmayan method'lardan direkt   kullanabilir.
         */






        }

    }

